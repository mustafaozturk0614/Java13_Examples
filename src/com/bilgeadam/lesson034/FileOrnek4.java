package com.bilgeadam.lesson034;

import java.io.*;

public class FileOrnek4 {

  static String path="E:\\java13-workspace\\fileornekleri\\deneme.txt";


    public static void main(String[] args) {
        BufferedReader reader=null;
        BufferedWriter writer = null;
        File file=new File(path);
        //Yazma İşlemi
        try {
            FileWriter fileWriter=new FileWriter(path,true);
            writer=  new BufferedWriter(fileWriter);
          //  writer=new BufferedWriter(new FileWriter(path));
            writer.write("Deneme\n");
            writer.write("Deneme2");
            writer.newLine();
            writer.write("Deneme3");
            writer.newLine();
            writer.write("Deneme4");
            writer.newLine();
       //     writer.write("xyza",1,1);//off degeri index degerine karsılık gelir o indexden itibaren len degeri kadar elaman yazdırır 1indexten itibaren 1 tane deger yazdır
        //   writer.append("xyzab",2,4); //start baslangıc indexi end bitiş indexi olarak gorev alır (substring benzeri)
            writer.flush();
            writer.write("Deneme5");
            writer.newLine();
            writer.write("Deneme6");
            writer.newLine();

        } catch (IOException e) {

            System.out.println(e.toString());
        }finally {
          try{
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
              writer.close();
            }catch (IOException e){
                System.out.println(e.toString());
            }

            //==========OKUMA İŞLEMİ ===============
            try {
                reader=new BufferedReader(new FileReader(path));
         //       BufferedReader reader2=new BufferedReader(new FileReader(path));
//                System.out.println((char) reader.read());
//                System.out.println(reader.readLine());
//                System.out.println(reader.readLine());
//                System.out.println(reader.readLine());
//                System.out.println(reader.readLine());
//                System.out.println(reader.readLine());
//                System.out.println(reader.readLine());
//                System.out.println(reader.readLine());
//                System.out.println(reader.readLine());
            //    System.out.println(reader2.readLine());
                String deger=null;
                while ((deger=reader.readLine())!=null){
                    System.out.println(deger);
                }
//                for (int i = 0; i < file.length() ; i++) {
//                    System.out.print((char) reader.read());
//                    try {
//                        Thread.sleep(1500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }





    }




}
