package com.bilgeadam.lesson034;

import java.util.Scanner;

public class Utility {
   static   Scanner scanner =new Scanner(System.in);


    /*
            int deger alma metodu ==> kullanıcıya ne için deger aldıgını gostersin ve aldıgı int degeri geri dondursun
            kullanıcadan dogru deger girene kadar deger almaya devam edelim (String deger yanlıs degerdir)
     */

    public  static int intDegerAlma(String sorgu){
        boolean kontrol=false;
        int value=0;
        do {
            try {
                System.out.println(sorgu);
               value= scanner.nextInt();
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+" : Lütfen bir sayısal deger giriniz");
                kontrol=true;
            }finally {
                scanner.nextLine();
            }
        }while (kontrol);
    return  value;
    }
    public  static double doubleDegerAlma(String sorgu){
        boolean kontrol=false;
        double value=0;
        do {
            try {
                System.out.println(sorgu);
                value= scanner.nextDouble();
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+" : Lütfen bir sayısal deger giriniz");
                kontrol=true;
            }finally {
                scanner.nextLine();
            }
        }while (kontrol);
        return  value;
    }
    public  static long longDegerAlma(String sorgu){
        boolean kontrol=false;
        long value=0;
        do {
            try {
                System.out.println(sorgu);
                value= scanner.nextLong();
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+" : Lütfen bir sayısal deger giriniz");
                kontrol=true;
            }finally {
                scanner.nextLine();
            }
        }while (kontrol);
        return  value;
    }
    public static String stringDegerAlma(String sorgu){
        System.out.println(sorgu);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        System.out.println(intDegerAlma("Lütfen bir sayi girniz")); ;
//        System.out.println(intDegerAlma("Lütfen id nizi girniz")); ;
//        System.out.println(intDegerAlma("Lütfen bir uzunluk girniz")); ;
    }

}
