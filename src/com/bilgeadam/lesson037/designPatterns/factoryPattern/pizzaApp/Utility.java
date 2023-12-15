package com.bilgeadam.lesson037.designPatterns.factoryPattern.pizzaApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
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

    public static Optional<LocalDate> stringTarihDegeriniLocalDateCevirme(String sorgu){
        LocalDate date=null;
        boolean kontrol=false;
        do {
            String tarih=stringDegerAlma(sorgu);
            try {
                date=LocalDate.parse(tarih);
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+": lutfen yıl-ay-gun formatinda bir tarih giriniz");
                kontrol=true;
            }
        }while (kontrol);

        return Optional.ofNullable(date);
    }
   /*
    formatlı gelen bir degeri local date cevirme fonksiyornu yazacagız
    */
    public static Optional<LocalDate> formatliLocalDateCevirme(String format,String tarih){
        LocalDate date=null;
        try {
            DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern(format);
            date=LocalDate.parse(tarih,dateTimeFormatter);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return  Optional.ofNullable(date);
    }

    public static void main(String[] args) {
    Optional<LocalDate> date  = formatliLocalDateCevirme("MM/dd/yyy","10/19/1990");
        System.out.println(date);
    }


}
