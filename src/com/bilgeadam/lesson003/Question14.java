package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
     Pizza boyut secimi yapacagız
     dışarıdan bizza boyutlarını gireceğiz
      S küçük boy pizza sectiniz
     ,M ora boy pizza sectiniz
     ,L buyuk boy pizza sectiniz
     ,Xl ekstra buyuk boy pizza sectiniz
     bunların dısında bir deger girmiş ise yanlıs bir secim yaptınız cıktısı versin
 */
public class Question14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String secim;

//        do {
//            System.out.println("Lütfen bir pizza boyutu seciniz");
//            secim=scanner.nextLine();
//        }while (secim!="S"||secim!="M"||secim!="L"||secim!="XL");

        boolean kontrol=true;
        while (kontrol){
            kontrol=false;
            System.out.println("Lütfen bir pizza boyutu seciniz");
            secim=scanner.nextLine();
            switch (secim){
                case "S":
                    System.out.println("Küçük Boy Pizza Sectiniz");
                    break;
                case "M":
                    System.out.println("Orta Boy Pizza Sectiniz");
                    break;
                case "L":
                    System.out.println("Buyuk Boy Pizza Sectiniz");
                    break;
                case "XL":
                    System.out.println("Ekstra Buyuk Boy Pizza Sectiniz");
                    break;
                default:
                    System.out.println("Yanlış bir secim yaptınız");
                    kontrol=true;
                    break;
        }

        }


    }
}
