package com.bilgeadam.lesson015.kutuphaneApp;

import java.util.Arrays;

/*

    Bu sınıf kutuphane sınıfını yoneten bir sınıf buraya metotlar yazacagız

    kitap sil metodu gelen kiatbın kacıncı indexde oldugunu bulup arrayden o indexdeki değeri silecek

 */
public class KutuphaneManager {


    public static void kitapSil(Kitap kitap) {
        for (int i = 0; i <Kutuphane.kitapIndex ; i++) {
            if (Kutuphane.kitaplar[i].equals(kitap)){
                Kutuphane.kitaplar[i]=null;
                break;
            }
        }
    }

    public void kitapEkle(Kitap kitap){
        Kutuphane.arrayBoyutKontrol();
        Kutuphane.kitaplar[Kutuphane.kitapIndex]=kitap;
        System.out.println( Kutuphane.kitaplar[Kutuphane.kitapIndex].ad+" adlı kitap kutuphaneye eklendi"+"==>"+(Kutuphane.kitaplar[Kutuphane.kitapIndex].id));
        Kutuphane.kitapIndex++;
        System.out.println("Kitaplar arrayinin boyutu==>"+Kutuphane.kitaplar.length);
    }

    public Kitap[] kitaplariGetir(){
        return  Kutuphane.kitaplar;
    }

    public  Kitap kitapVarmi(String kitapAdi){
        for (int i = 0; i <Kutuphane.kitapIndex ; i++) {
           // Kitap kitap=Kutuphane.kitaplar[i];

                if (kitapAdi.equals(Kutuphane.kitaplar[i].ad)){
                    return Kutuphane.kitaplar[i];
                }
        }
        return  null;
    }

    public  int kitapVarmi2(String kitapAdi){
        for (int i = 0; i <Kutuphane.kitapIndex ; i++) {
            if (kitapAdi.equals(Kutuphane.kitaplar[i].ad)){
                return i;
            }
        }
        return  -1;
    }
  //[ "a","b" "c" "d" "e" null null]

   // [a ,b d e e null null]
    //[a,b d e null null null]
    public static void kitapSil2(int index){
        for (int i = 0; i <Kutuphane.kitapIndex ; i++) {
            if (index<i){
                Kutuphane.kitaplar[i-1]=Kutuphane.kitaplar[i];
               // Kutuphane.kitaplar[i]=null;
            }
        }
        Kutuphane.kitapIndex--;
        Kutuphane.kitaplar[Kutuphane.kitapIndex]=null;
    }

}
