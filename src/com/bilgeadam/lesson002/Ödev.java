package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    Girilen sayının basamakları toplamını ve kaç basamaklı oldugunu ekrana yazdıralım
    do while ile yapalım

 */
public class Ödev {

    public static void main(String[] args) {
        int sayi1;
        int sayac=0;
        int basamakDegeri;
        int toplam=0;
        System.out.println("Basamak sayısı için bir sayı giriniz");
        Scanner scanner=new Scanner(System.in);
        sayi1=scanner.nextInt();
        do {
            basamakDegeri=sayi1%10;
            toplam+=basamakDegeri;
            sayi1=sayi1/10;
            sayac++;
        }while (sayi1>0);
        System.out.println("toplam= "+toplam);
        System.out.println("basamak sayısı= "+sayac);
        /// do while  ile while farkı
        int deger;
        deger=scanner.nextInt();
        do {
            System.out.println(deger);
        }while (deger!=0);
        while(deger!=0){
            System.out.println(deger);
        }
    }



}
