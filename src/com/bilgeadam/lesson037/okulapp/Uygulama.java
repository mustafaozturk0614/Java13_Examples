package com.bilgeadam.lesson037.okulapp;
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
        Manager manager=new Manager();
        Ogretmen ogretmen=new Ogretmen("Mustafa");
        manager.dosyadanVeriOku(ogretmen.getIsim()).forEach(System.out::println);
    }
}
