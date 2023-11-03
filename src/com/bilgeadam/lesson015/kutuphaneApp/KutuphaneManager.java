package com.bilgeadam.lesson015.kutuphaneApp;

import com.bilgeadam.lesson015.kutuphaneApp.Kitap;

/*

    Bu sınıf kutuphane sınıfını yoneten bir sınıf buraya metotlar yazacagız

 */
public class KutuphaneManager {


    public void kitapEkle(Kitap kitap){
        Kutuphane.kitaplar[Kutuphane.kitapIndex]=kitap;
        System.out.println( Kutuphane.kitaplar[Kutuphane.kitapIndex].ad+" adlı kitap kutuphaneye eklendi"+"==>"+(Kutuphane.kitaplar[Kutuphane.kitapIndex].id));
        Kutuphane.kitapIndex++;
    }

    public Kitap[] kitaplariGetir(){
        return  Kutuphane.kitaplar;
    }


}
