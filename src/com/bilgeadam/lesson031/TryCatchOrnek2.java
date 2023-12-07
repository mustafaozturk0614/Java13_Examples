package com.bilgeadam.lesson031;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    bölme işlemi için bir metot yazalım  2 tane sayı alalım
    bölme işlemi sonucunu bulmaya calısalım eger hata varsa hatayı yazdıralım

    2-  scannerla 2 tane sayı alan bir bolme metodu yazalım ve eger hata varsa sayıları tekrar tekrar alalım


 */
public class TryCatchOrnek2 {



    public static void bolme(Integer bolunen,Integer bolen){

        try {
            int bolum=bolunen/bolen;
            System.out.println("sonuc==>"+bolum);
        }
        catch (ArithmeticException exception){
            System.out.println("Hata olustu:"+ exception.toString()+"==> Bir sayı 0 a bölünemez");
        }catch (NullPointerException exception){
            System.out.println("Hata olustu:"+ exception.toString()+"==> sayı null olamaz");
        }catch (Exception exception){
            System.out.println("Hata olustu:"+ exception.toString()+"==> genel hata");
        }

    }
    public static void bolme4(Integer bolunen,Integer bolen){
            int bolum=bolunen/bolen;
            if (bolen==0){
                throw new ArithmeticException("Bir sayı sıfıra bolunmez");
            }
           else if (bolen==null|| bolunen==null) {
                throw new NullPointerException("Sayılar null olamaz");
            }
            System.out.println("sonuc==>"+bolum);
    }
    public static void bolme2(Double bolunen,Double bolen){

        try {
            double bolum=bolunen/bolen;
            System.out.println("sonuc==>"+bolum);
        }catch (Exception exception){
            System.out.println("Hata olustu:"+ exception.getMessage()+"==> Bir sayı 0 a bölünemez");
        }

    }


    public static void bolme3(){
        Scanner scanner=new Scanner(System.in);
        boolean kontrol=false;
        do {
            try {
                System.out.println("1. sayıyı giriniz");
                int bolunen=scanner.nextInt();

                System.out.println("2. sayıyı giriniz");
                int bolen=scanner.nextInt();

                int bolum=bolunen/bolen;
                System.out.println("sonuc==>"+bolum);

                kontrol=true;
            }
            catch (ArithmeticException exception){
                System.out.println("Hata olustu:"+ exception.toString()+"==> Bir sayı 0 a bölünemez");
            }catch (NullPointerException exception){
                System.out.println("Hata olustu:"+ exception.toString()+"==> sayı null olamaz");
            }catch (InputMismatchException exception){
                System.out.println("Hata olustu:"+ exception.toString()+"==> lütfen sayısal deger giriniz");
            }catch (Exception exception){
                System.out.println("Hata olustu:"+ exception.toString()+"==> genel hata olustu");
            }finally {
                scanner.nextLine();
            }
//            System.out.println("Lütfen bir deger giriniz");
//            String value=scanner.nextLine();
//            System.out.println(value);

        }while (!kontrol);

        System.out.println("Program sonlandı...");

    }

    public static void main(String[] args) {
//        Integer sayi1=10;
//        Integer sayi2=null;
//        bolme(5,2);
//        bolme(5,0);
//        bolme(sayi1,sayi2);
//        bolme(5,1);
//        double sayi3=5D;
//        double sayi4=0D;
 //     bolme2(sayi3,sayi4);
        bolme3();
//        Scanner scanner=new Scanner(System.in);
//        boolean kontrol=false;
//        do {
//            System.out.println("1. sayıyı giriniz");
//            Integer bolunen=null;
//
//            System.out.println("2. sayıyı giriniz");
//            int bolen=scanner.nextInt();
//            try {
//
//                bolme4(bolunen,bolen);
//                kontrol=true;
//            }catch (Exception e){
//                System.out.println("burada");
//                System.out.println(e.toString());
//            }
//
//        }while (!kontrol);

    }


}
