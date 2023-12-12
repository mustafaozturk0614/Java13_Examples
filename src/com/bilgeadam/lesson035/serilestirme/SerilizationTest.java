package com.bilgeadam.lesson035.serilestirme;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SerilizationTest {

    public  static  String path="E:\\java13-workspace\\fileornekleri\\seri.txt";
    public  static  String path2="E:\\java13-workspace\\fileornekleri\\seri2.txt";



    public  static void serilizationExample(Movie movie){
        ObjectOutputStream oos=null;
        try {
             oos=new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(movie);
            System.out.println("Serileştirme işlemi başarılı");
        } catch (IOException e) {
            System.out.println("Serileştirme işlemi başarısız");
            System.out.println(e.toString());
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  static void deserilizationExample(){
        Movie movie=null;
        ObjectInputStream ois=null;
        try {
         ois=new ObjectInputStream(new FileInputStream(path));
           movie= (Movie)ois.readObject();
            System.out.println(movie);
        } catch (IOException e) {
            System.out.println("De-Serileştirme işlemi başarısız");
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public  static void serilizationListExample(List<Movie> movies){
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream(path2));
            for (Movie movie:movies){
                oos.writeObject(movie);
            }
            System.out.println("Serileştirme işlemi başarılı");
        } catch (IOException e) {
            System.out.println("Serileştirme işlemi başarısız");
            System.out.println(e.toString());
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  static void serilizationListExample2(List<Movie> movies){
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream(path2));
                oos.writeObject(movies);
            System.out.println("Serileştirme işlemi başarılı");
        } catch (IOException e) {
            System.out.println("Serileştirme işlemi başarısız");
            System.out.println(e.toString());
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  static List<Movie> deserilizationListExample(){
        List<Movie> movieList=new ArrayList<>();
        Movie movie=null;
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(new FileInputStream(path2));
            while ( (movie= (Movie)ois.readObject())!=null){
                movieList.add(movie);
            }
        } catch (EOFException e){
            System.out.println("Dosya okuma işlemi sonlandı");
        }
        catch (IOException e) {
            System.out.println("De-Serileştirme işlemi başarısız");
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return  movieList;
    }
    public  static List<Movie> deserilizationListExample2(){
        List<Movie> movieList=new ArrayList<>();
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(new FileInputStream(path2));
            movieList= (List<Movie>) ois.readObject();
        }
        catch (IOException e) {
            System.out.println("De-Serileştirme işlemi başarısız");
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return  movieList;
    }
    public static void main(String[] args) {
        Movie movie=new Movie("Seven","Drama", LocalDate.of(1995,10,5));
        Movie movie2=new Movie("Pulp Fiction","Drama", LocalDate.of(1994,10,5));
       // serilizationExample(movie);
        List<Movie> movies=new ArrayList<>(List.of(movie,movie2));
       // deserilizationExample();
        //serilizationListExample(movies);
     //   deserilizationListExample().forEach(System.out::println);
        serilizationListExample2(movies);
        deserilizationListExample2().forEach(System.out::println);


    }

}
