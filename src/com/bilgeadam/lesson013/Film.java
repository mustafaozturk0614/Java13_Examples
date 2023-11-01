package com.bilgeadam.lesson013;
/*
    filmin bilgilerini gostren (yazdıran) bir metot yazalım

 */
public class Film {
    String ad;
    double ortalamaPuan;
    int yil;
    String [] oyuncular;
    String yonetmen;
    String dil;
    int sure;
    String [] etiketler;
    String ulke;
    int [] puanlar=new int[30];
    public  void etiketEkle(String etiket,int index){
        etiketler[index]=etiket;

    }
    public void  puanEkle(int puan,int index){
        puanlar[index]=puan;
    }
//filmin bilgilerini gostren (yazdıran) bir metot yazalım
    public void  bilgileriGoster(){

    }
}
