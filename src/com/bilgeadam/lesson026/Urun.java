package com.bilgeadam.lesson026;
public class Urun {
    public  int id;
    public  double fiyat;

    public  String isim;

    public Urun(int id, double fiyat, String isim) {
        this.id = id;
        this.fiyat = fiyat;
        this.isim = isim;
    }

    public Urun(double fiyat, String isim) {
        this.fiyat = fiyat;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", fiyat=" + fiyat +
                ", isim='" + isim + '\'' +
                '}';
    }
}
