package com.bilgeadam.lesson029.streamOgrenciOrnek;

import java.util.List;
import java.util.stream.Collectors;

public class Ogrenci {

private  int id;
private String isim;
private  EBolum bolum;

private String durum;

private List<Double> notlar;

    public Ogrenci(int id, String isim, EBolum bolum) {
        this.id = id;
        this.isim = isim;
        this.bolum = bolum;
    }


    public Double ortalamaHesapla(){
    Double ort=notlar.stream().collect(Collectors.averagingDouble(n->n));
   // Double ort2=notlar.stream().mapToDouble(x->x).average().orElse(0);
        return  ort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public EBolum getBolum() {
        return bolum;
    }

    public void setBolum(EBolum bolum) {
        this.bolum = bolum;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public List<Double> getNotlar() {
        return notlar;
    }

    public void setNotlar(List<Double> notlar) {
        this.notlar = notlar;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", bolum=" + bolum +
                ", durum='" + durum + '\'' +
                ", notlar=" + notlar +
                '}';
    }
}
