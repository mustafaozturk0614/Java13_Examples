package com.bilgeadam.lesson037.okulapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/*
      1-ogrenci sınıfımız olacak
        -isim
        -notort
        -durum===>(GEcTI,KALDI)
        -dogum tarihi (lacalDate)
        2 tane const
         bitanesi sadece isim
         digeride durum haric hepsini alan bir const
      2-ogretmen sınıfımız olsun
        -isim
        birde notlarını okudugu ogrencileri tuttgu bir liste olsun
    Manager sınıfım olsun
        1- dosyadan verileri okuyacagız her veriden bir ogrenci yaratacagız
        ve bunu bir listeye ekleyip listeyi metod sonunda geri doncegiz
        (ogrenciyi olusturken 1. adımda sadece ismi ile olusturalaım)


 */
public class Uygulama {

    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(Manager.path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Ogretmen ogretmen1=new Ogretmen("Barıs",bufferedReader);
        Ogretmen ogretmen2=new Ogretmen("Mustafa",bufferedReader);
        Ogretmen ogretmen3=new Ogretmen("Özge",bufferedReader);

        ogretmen1.start();
        ogretmen2.start();
        ogretmen3.start();

        try {
            ogretmen1.join();
            ogretmen2.join();
            ogretmen3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(ogretmen1.getOgrenciler());
        System.out.println(ogretmen2.getOgrenciler());
        System.out.println(ogretmen3.getOgrenciler());

        System.out.println(ogretmen1.getOgrenciler().size());
        System.out.println(ogretmen2.getOgrenciler().size());
        System.out.println(ogretmen3.getOgrenciler().size());
    }
}
