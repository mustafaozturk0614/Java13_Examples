package com.bilgeadam.lesson029.streamOgrenciOrnek;

public class Test {

    public static void main(String[] args) {
        OgrenciManager ogrenciManager=new OgrenciManager();
        ogrenciManager.baslangicVerisi();
        ogrenciManager.okulOrt();
        ogrenciManager.okulOrt2();
        ogrenciManager.okulOrt3();
        ogrenciManager.notOrt50denKucukler().forEach(System.out::println);
        ogrenciManager.durumGuncelle();
        ogrenciManager.ogrenciler.forEach(x->
                System.out.println(x.getIsim()+"===>"+x.ortalamaHesapla()+"===>"+x.getDurum()));
    }
}
