package com.bilgeadam.lesson010;
/*
   1- bir string deger alma metodu istiyorum
   2- iki string karsılastırıp dogru olup olmadıgını donen bir metot istiyorum
   3-metotda girdiğimiz degerin aslında dizimizde olup olmadıgını soylen bir metot olacak


 */

import java.util.Scanner;

public class Question46 {


    public static void main(String[] args) {
        String [] dizi={"Türkiye","Japonya","Danimarka","Fransa"};
//        String ulke=degerAl("Lütfen bir ülke giriniz");
//        System.out.println("girdiğiniz ulke===>"+ulke);
//        String sehir=degerAl("Lütfen şehir giriniz");
//        System.out.println(degerAl("Lütfen bir isim giriniz"));
               // ****1.metot cagırma yontemi
           // sonucGoster(dizideVarmi(ulke,dizi));
        // ****2.metot cagırma yontemi
       //     sonucGoster(dizideVarmi(degerAl("Lütfen bir ülke giriniz".toUpperCase()),dizi));
        // ****3.metot cagırma yontemi
//            String ulke=degerAl("Lütfen bir ülke giriniz");
//            boolean kontrol  =dizideVarmi(ulke,dizi);
//            sonucGoster(kontrol);

        dizideVarmi2(degerAl("Lütfen bir ulke giriniz") ,dizi);



    }

    public  static  String degerAl(String sorgu){
        Scanner scanner=new Scanner(System.in);
        System.out.println(sorgu);
        String metin= scanner.nextLine();
        return metin;
    }
    public static boolean karsilastirma(String ulke1,String ulke2){
        boolean kontrol=false;
        if (ulke1.equalsIgnoreCase(ulke2)){
            kontrol=true;
        }
        return kontrol;
    }
    public static boolean karsilastirma2(String ulke1,String ulke2){
        return  ulke1.equalsIgnoreCase(ulke2);
    }
    public static   boolean dizideVarmi(String ifade,String [] dizi){
        boolean dizideVar=false;
        for (int i = 0; i <dizi.length; i++) {
            if (karsilastirma(dizi[i],ifade)){
                dizideVar=true;
                break;
            }
        }
        return dizideVar;
    }
    public static   void dizideVarmi2(String ifade,String [] dizi){
        boolean dizideVar=false;
        for (int i = 0; i <dizi.length; i++) {
            if (karsilastirma(dizi[i],ifade)){
                dizideVar=true;
                break;
            }
        }
         sonucGoster(dizideVar);
    }
    public  static void  sonucGoster(boolean kontrol){

        if (kontrol){
            System.out.println("Aradıgınız ülke bulundu");
        }else {
            System.out.println("aradığınız ulke bulunamadı");
        }
    }



}
