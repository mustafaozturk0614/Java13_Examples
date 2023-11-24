package com.bilgeadam.lesson022.sehirApp;

public class Sehir {

    private String isim;
    private long nufus;
    private String plakaNo;
    private EBolge bolge;

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

    public String getPlakaNo() {
        return plakaNo;
    }

    public void setPlakaNo(String plakaNo) {
        this.plakaNo = plakaNo;
    }

    public EBolge getBolge() {
        return bolge;
    }

    public void setBolge(EBolge bolge) {
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
