package com.bilgeadam.lesson030;

public class Yonetmen {
    private String isim;
    private String ulke;

    public Yonetmen(String isim, String ulke) {
        this.isim = isim;
        this.ulke = ulke;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    @Override
    public String toString() {
        return "Yonetmen{" +
                "isim='" + isim + '\'' +
                ", ulke='" + ulke + '\'' +
                '}';
    }
}
