package com.bilgeadam.lesson015.kutuphaneApp;

public class Kutuphane {
    public static Kitap[] kitaplar=new Kitap[5];
    public static Yazar[] yazarlar=new Yazar[10];
    public  static int kitapIndex;
    public  static int yazarIndex;


    /*
        array boyutunu kontrol eden bir metot
        arrayimiz sınıra ulaşmıssa
        10 ar 10 ar array boyutunu arttırıyor
     */
    public static void arrayBoyutKontrol(){
        System.out.println("Array boyutu kontrol ediliyor");
        if (kitapIndex==kitaplar.length){
         Kitap [] temp=new Kitap[kitaplar.length+10];
            for (int i = 0; i <kitaplar.length ; i++) {
                temp[i]=kitaplar[i];
            }
            kitaplar=temp;
        }

    }

}
