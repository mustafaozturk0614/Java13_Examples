package com.bilgeadam.lesson032;

import java.util.UUID;

public class Yuk {

    private String id;
    private String isim;
    private double agirlik;
    private long kabulTarihi;
    private EGun kabulGunu;

    public Yuk(String isim, double agirlik, long kabulTarihi, EGun kabulGunu) {
        this.id= UUID.randomUUID().toString();
        this.isim = isim;
        this.agirlik = agirlik;
        this.kabulTarihi = kabulTarihi;
        this.kabulGunu = kabulGunu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public long getKabulTarihi() {
        return kabulTarihi;
    }

    public void setKabulTarihi(long kabulTarihi) {
        this.kabulTarihi = kabulTarihi;
    }

    public EGun getKabulGunu() {
        return kabulGunu;
    }

    public void setKabulGunu(EGun kabulGunu) {
        this.kabulGunu = kabulGunu;
    }

    @Override
    public String toString() {
        return "Yuk{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", agirlik=" + agirlik +
                ", kabulTarihi=" + kabulTarihi +
                ", kabulGunu=" + kabulGunu +
                '}';
    }
}
