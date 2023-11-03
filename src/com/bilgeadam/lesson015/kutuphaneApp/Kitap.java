package com.bilgeadam.lesson015.kutuphaneApp;

public class Kitap {
    public  int id;
    public  String ad;
    public  String yazarIsmi;
    public String tur;
    public  int sayfaSayisi;
    public  String basimTarihi;
    public  String yayinEvi;
    public  String dil;

    public void bilgileriGoster(){
        System.out.println("===Kitap Bilgileri==");
        System.out.println("id= "+id);
        System.out.println("kitap adı= "+ad);
        System.out.println("yazar ismi= "+yazarIsmi);
        System.out.println("tur= "+tur);
        System.out.println("sayfa sayisi= "+sayfaSayisi);
        System.out.println("basim Tarihi= "+basimTarihi);
        System.out.println("yayın evi= "+yayinEvi);
        System.out.println("dil= "+dil);

    }


}
