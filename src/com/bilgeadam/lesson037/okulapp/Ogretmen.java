package com.bilgeadam.lesson037.okulapp;

import java.util.ArrayList;
import java.util.List;

public class Ogretmen {

    private String isim;
    private List<Ogrenci> ogrenciler;

    public Ogretmen(String isim) {
        this.isim = isim;
        this.ogrenciler=new ArrayList<>();
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
}
