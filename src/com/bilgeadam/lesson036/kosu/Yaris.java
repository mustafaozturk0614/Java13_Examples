package com.bilgeadam.lesson036.kosu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    1- Kosucu sınıfı olusturacagız
    kosucunun ismi kat edeceği mesefa sure ve baslangıc zamanı olsun
    adımUzunlugu==> buda bir kişinin adım uzunlugu olsun şimdilik hepsi 1 metre olsun

   ismi kat edeceği mesefa==> Yarıs uzunlugu bu kosucu kac metre koscak
   sure ==> kac milisaniyede(nonasaniye) bitirdi
   baslangıc zamanı==> yarısın basladıgı andaki long deger

   kosucu sınıfmız bir thread olacak
   kosucular kac metre kosacakları yarıs sınıfında belirlenebilir(100 metre)
   her defasında adımUZunlugu kadar yol katedecekler ( 1er 1er gibi dusunebirliz)
   ve her 10 metrede bir cıktı verelim  mustafa==>10.metrede mustafa==>20.metrede .... mustafa==>100.metrede cıkstısını verelim
    mustafa adlı kosucu 100 metreyi 2000 msn de kostu bir cıktı verelim

   daha sonra yarıs sınıfında 5 tane kosucu olusturup herbir threadı baslatıp yarıs sonuclarnı gozlemleyecegiz



 */
public class Yaris {

    public static void main(String[] args) {
        long baslangicZamani=System.nanoTime();

        Kosucu kosucu1=new Kosucu("Mustafa",100,baslangicZamani,1);
        Kosucu kosucu2=new Kosucu("Zeliha",100,baslangicZamani,2);
        Kosucu kosucu3=new Kosucu("Serkan",100,baslangicZamani,1);
        Kosucu kosucu4=new Kosucu("Burhan",100,baslangicZamani,2);
        Kosucu kosucu5=new Kosucu("Ezgi",100,baslangicZamani,1.5);
        Kosucu kosucu6=new Kosucu("Hilal",100,baslangicZamani,2);

        List<Kosucu> kosucular=new ArrayList<>(List.of(kosucu1,kosucu2,kosucu3,kosucu4,kosucu5,kosucu6));
        Thread thread1=new Thread(kosucu1);
        Thread thread2=new Thread(kosucu2);
        Thread thread3=new Thread(kosucu3);
        Thread thread4=new Thread(kosucu4);
        Thread thread5=new Thread(kosucu5);
        Thread thread6=new Thread(kosucu6);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        kosucular.stream().sorted(Comparator.comparingLong(Kosucu::getSure)).forEach(System.out::println);


    }
}
