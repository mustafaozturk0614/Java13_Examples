package com.bilgeadam.lesson012;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
        iki tane String degeri alıp araya atıp arayı yazdıran fonksiyorn
        ikiden fazla deger alsın ve arayı yazdırsın( varargs )
 */
public class OverloadingTest {


    public  static void arrayYazdir(String deger1,String deger2  ){
        String [] dizi=new String[2];
        dizi[0]=deger1;
        dizi[1]=deger2;
      //  String [] dizi2= {deger1,deger2};
        System.out.println(dizi[0]);
        System.out.println(dizi[1]);
        System.out.println(Arrays.toString(dizi));
        for (String string:dizi){
            System.out.println(string);
        }
    }
    public  static void arrayYazdir(String ...deger){
        for (String string:deger){
            System.out.println(string);
        }
    }
    public  static void arrayYazdir(String  deger,int ...sayilar){
        System.out.println(deger);
        for (int sayi:sayilar){
            System.out.println(sayi);
        }
    }
    public  static void arrayYazdir(int ...sayilar){
        for (int sayi:sayilar){
            System.out.println(sayi);
        }
    }

//    public  static void arrayYazdir(String deger1,String deger2,String deger3,String deger4){
//
//    }
//    public  static void arrayYazdir(String deger1,String deger2,String deger3,String deger4,String deger5){
//
//    }
    public static void main(String[] args) {

        harfDegistir("Merhaba","a","x");

        harfDegistir("Merhaba",'a','x');

        harfDegistir("Merhaba",'a','x');
        System.out.println();

        "metin".substring(3);
        "metin".substring(2,4);
        arrayYazdir("Ankara","Bursa");
        System.out.println("///////////////////////");
        arrayYazdir("İzmir","Balıkesir","Bolu","Sivas");
        System.out.println("///////////////////////");
        arrayYazdir("Balıkesir","Bolu","Sivas");
        arrayYazdir("sayilar",5,4,7);
        arrayYazdir(12,56,78);
    }



    public  static void harfDegistir(String metin,String ilkHarf,String ikinciHarf){
        System.out.println(metin.replace(ilkHarf,ikinciHarf));
    }
    public  static void harfDegistir(String metin,char ilkHarf,char ikinciHarf){
        System.out.println(metin.replace(ilkHarf,ikinciHarf));
    }
}
