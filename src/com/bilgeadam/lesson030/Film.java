package com.bilgeadam.lesson030;

import java.time.LocalDate;

public class Film {
    private String isim;
    private LocalDate tarih;
    private long hasilat;
    private Yonetmen yonetmen;
    private ETur tur;
    private double puan;

    public Film(String isim, LocalDate tarih, long hasilat, ETur tur,Yonetmen yonetmen, double puan) {
        this.isim = isim;
        this.tarih = tarih;
        this.hasilat = hasilat;
        this.yonetmen = yonetmen;
        this.tur = tur;
        this.puan = puan;
    }

    public Yonetmen getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(Yonetmen yonetmen) {
        this.yonetmen = yonetmen;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public long getHasilat() {
        return hasilat;
    }

    public void setHasilat(long hasilat) {
        this.hasilat = hasilat;
    }

    public ETur getTur() {
        return tur;
    }

    public void setTur(ETur tur) {
        this.tur = tur;
    }

    public double getPuan() {
        return puan;
    }

    public void setPuan(double puan) {
        this.puan = puan;
    }

    @Override
    public String toString() {
        return "Film{" +
                "isim='" + isim + '\'' +
                ", tarih=" + tarih +
                ", hasilat=" + hasilat +
                ", yonetmen=" + yonetmen +
                ", tur=" + tur +
                ", puan=" + puan +
                '}';
    }
}
