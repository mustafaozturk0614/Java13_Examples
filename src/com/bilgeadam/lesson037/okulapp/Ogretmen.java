package com.bilgeadam.lesson037.okulapp;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Ogretmen extends Thread {

    private String isim;
    private List<Ogrenci> ogrenciler;

    BufferedReader bufferedReader;

    public Ogretmen(String isim,BufferedReader bufferedReader) {
        this.isim = isim;
        this.ogrenciler=new ArrayList<>();
        this.bufferedReader=bufferedReader;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "isim='" + isim + '\'' +
                ", ogrenciler=" + ogrenciler +
                '}';
    }

    public void notlariOku(){
       this.ogrenciler=Manager.dosyadanVeriOku(this.isim,this.bufferedReader);
    }

    public void  dosyaOlustur(){
        Manager.ogretmenDosyasıOlsutur(this.ogrenciler,this.isim);
    }

    public List<Ogrenci> dosyadanOgrencileriGetir(){
        this.ogrenciler=Manager.ogrencileriGetir(this.isim);
        return this.ogrenciler;
    }

    @Override
    public void run() {
        notlariOku();
    }
}
