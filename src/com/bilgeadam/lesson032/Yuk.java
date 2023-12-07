package com.bilgeadam.lesson032;

import java.util.UUID;

public class Yuk {
    private String id;
    private String isim;
    private double agirlik;
    private MyDate date;

    public Yuk(String isim, double agirlik,MyDate date) {
        this.id= UUID.randomUUID().toString();
        this.isim = isim;
        this.agirlik = agirlik;
        this.date=date;
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

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Yuk{" +
                "id='" + id + '\'' +
                ", isim='" + isim + '\'' +
                ", agirlik=" + agirlik +
                ", date=" + date +
                '}';
    }
}
