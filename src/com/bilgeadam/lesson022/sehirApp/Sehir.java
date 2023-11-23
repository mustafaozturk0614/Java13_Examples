package com.bilgeadam.lesson022.sehirApp;

public class Sehir {

    private String isim;
    private long nufus;
    private int plakaNo;
    private String bolge;

    public Sehir() {
    }

    public Sehir(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getNufus() {
        return nufus;
    }

    public void setNufus(long nufus) {
        this.nufus = nufus;
    }

    public int getPlakaNo() {
        return plakaNo;
    }

    public void setPlakaNo(int plakaNo) {
        this.plakaNo = plakaNo;
    }

    public String getBolge() {
        return bolge;
    }

    public void setBolge(String bolge) {
        this.bolge = bolge;
    }

    @Override
    public String toString() {
        return "Sehir{" +
                "isim='" + isim + '\'' +
                ", nufus=" + nufus +
                ", plakaNo=" + plakaNo +
                ", bolge='" + bolge + '\'' +
                '}';
    }
}
