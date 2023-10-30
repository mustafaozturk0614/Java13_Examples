package com.bilgeadam.lesson005;

import java.util.Locale;

public class StringOrnek {

    public static void main(String[] args) {

        String value="Merhaba Dünya";
        String value2=" Merhaba Dünya ";
        String value3="Merhaba Dünya";
        String value4= new String("Merhaba Dünya");
        System.out.println(value.lastIndexOf("a"));// metin içerisindeki bir değerin son indexini verir
        System.out.println(value.indexOf("a"));// metin içerisindeki bir değerin ilk indexini verir
        System.out.println(value.indexOf("x"));// metin içerisindeki aradıgımız deger yoksa -1 çıktısnı alırız
        System.out.println(value.charAt(1));// bir indexdeki değeri dondurur
        System.out.println(value.charAt(0));
        System.out.println(value.charAt(12));
        System.out.println(value2);
        System.out.println(value2.trim());// başta ki ve sonda ki boşlukları temizler
        System.out.println(value.contains("m"));//false // metinin bir kelimeyei içeri içermediğini bize dondurur
        System.out.println(value.contains("e"));//true
        System.out.println(value.substring(1,7)); // metini parçalamak için kullanılan bir metot baslangıc indexi dahildir bitiş indexi dahil değildir
        System.out.println(value.substring(1));// eğer bitiş indexi vermze isek başlangıc indexinden sonuna kadar böler.
        System.out.println(value.toUpperCase()); // tüm harfleri buyutmek için kullanılan metot
        System.out.println(value.toLowerCase());//tüm harfleri kucultmek için kullanılan metot
       //System.out.println(value.toUpperCase(Locale.ENGLISH));
        System.out.println(value.replace("a","x"));
      //  value=value.replace("a","x");
        System.out.println(value.replace("Dünya","Evren"));
        System.out.println(value.equals(value2));//false // içerik kontrolu yapar
        System.out.println(value.equals(value2.trim()));// true
        System.out.println(value==(value2.trim()));// false // adres kontrolu
        System.out.println(value==(value3));// true
        System.out.println(value==(value4));// false
        String value5="merhaba dünya";
        System.out.println(value.equalsIgnoreCase(value5));// buyuk kucuk harf farketmekssizin içerik kontrolu yapar
        System.out.println(value.endsWith("a"));
        System.out.println(value.endsWith("e"));
        System.out.println(value.startsWith("M"));
        System.out.println(value.startsWith("D"));

        String value6="Java-React-Css";

        String [] array=value6.split("-");
        for (int i = 0; i< array.length ; i++) {
            System.out.println(array[i]);
        }
        String value7="10";
        System.out.println(5+value7);
        int sayi1=Integer.parseInt(value7); // bir string degeri int degerine cevirir
        System.out.println(sayi1);
        System.out.println(5+sayi1);

       // int sayi2=Integer.parseInt(value5);// bir string degeri int degerine cevirir fakar deger sayı olmadıgı için çevirmede hata veriri
   //     System.out.println(sayi2);
        System.out.println(value.length());// uzunlugu veriyor


    }
}
