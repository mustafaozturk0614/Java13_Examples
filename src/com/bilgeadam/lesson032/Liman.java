package com.bilgeadam.lesson032;

import java.util.Arrays;

public class Liman {
    private int alanSayisi;
    private Yuk[] yukler;

    public Liman() {
        this.alanSayisi=10;
        this.yukler=new Yuk[alanSayisi];
    }

    public Liman(int alanSayisi) {
        this.alanSayisi = alanSayisi;
        this.yukler=new Yuk[alanSayisi];
    }

    public int getAlanSayisi() {
        return alanSayisi;
    }

    public void setAlanSayisi(int alanSayisi) {
        this.alanSayisi = alanSayisi;
    }

    public Yuk[] getYukler() {
        return yukler;
    }

    public void setYukler(Yuk[] yukler) {
        this.yukler = yukler;
    }

    @Override
    public String toString() {
        return "Liman{" +
                "alanSayisi=" + alanSayisi +
                ", yukler=" + Arrays.toString(yukler) +
                '}';
    }
}
