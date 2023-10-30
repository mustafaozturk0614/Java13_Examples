package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    Bir urun fiyatında %18 kdv %15 kar payı oldugunu biliyoruz
    bu urunun son fiyatı elimizde olsun daha sonra bu urun fiyatı uzerinden
    urunun ham fiyatı ve kdvsiz fiyatını bulalım

 */
public class Question1 {

    public static void main(String[] args) {
        double sonFiyat ,kdvsiz,hamFiyat;
        sonFiyat=200;
        kdvsiz=sonFiyat*0.82;
        System.out.println("kdvsiz fiyat---->" + kdvsiz);
        hamFiyat=kdvsiz*0.85;
        System.out.println("ham fiyat ----> "+hamFiyat);
     /// Scanner ile veri alma işlemleri
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim=scanner.nextLine();
        String soyİsim=scanner.nextLine();
        System.out.println("isim="+isim+" "+soyİsim);
        System.out.println("bir double deger giriniz");
        double sayi1= scanner.nextDouble();
        System.out.println("bir int deger giriniz");
        int sayi2= scanner.nextInt();
        //ctr +d aşağı dogru çoğaltma kısayolu
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println("Lütfen bir ulke giriniz");
        // nextInt nextDouble nextLong gibi sayısay degerlerden
        // sonra string bir deger alacaksak oncelikle bos bir
        // scanner.nextLine komutu yazmamız gerekli
        scanner.nextLine();
        String ulke=scanner.nextLine();
        System.out.println("Lütfen bir sayi giriniz");
         long sayi3=scanner.nextLong();
        System.out.println(sayi3);
        System.out.println(ulke);



    }

}
