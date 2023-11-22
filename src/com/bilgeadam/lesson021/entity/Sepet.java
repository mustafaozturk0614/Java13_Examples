package com.bilgeadam.lesson021.entity;

import com.bilgeadam.lesson021.enums.EUrun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sepet {
    private List<EUrun> urunler;
    private int urunSayisi;
    private double toplam;

    public Sepet() {
        this.urunler=new ArrayList<>();
    }

    public List<EUrun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<EUrun> urunler) {
        this.urunler = urunler;
    }

    public int getUrunSayisi() {
        return urunSayisi;
    }

    public void setUrunSayisi(int urunSayisi) {
        this.urunSayisi = urunSayisi;
    }

    public double getToplam() {
        return toplam;
    }

    public void setToplam(double toplam) {
        this.toplam = toplam;
    }

    @Override
    public String toString() {
        return "Sepet{" +
                "urunler=" + urunler +
                ", urunSayisi=" + urunSayisi +
                ", toplam=" + toplam +
                '}';
    }
}
