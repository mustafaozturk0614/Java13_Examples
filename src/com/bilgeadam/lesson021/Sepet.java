package com.bilgeadam.lesson021;

import java.util.Arrays;

public class Sepet {
    private EUrun [] urunler;
    private int urunSayisi;
    private double toplam;

    public Sepet() {
        this.urunler=new EUrun[10];
    }

    public EUrun[] getUrunler() {
        return urunler;
    }

    public void setUrunler(EUrun[] urunler) {
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
                "urunler=" + Arrays.toString(urunler) +
                ", urunSayisi=" + urunSayisi +
                ", toplam=" + toplam +
                '}';
    }
}
