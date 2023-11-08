package com.bilgeadam.lesson018;

public class AnaKart {

   public  Ram ram;
   public EkranKarti ekranKarti;
   public Islemci islemci;

    public AnaKart(Ram ram, EkranKarti ekranKarti, Islemci islemci) {
        this.ram = ram;
        this.ekranKarti = ekranKarti;
        this.islemci = islemci;
    }

    @Override
    public String toString() {
        return "AnaKart{" +
                "ram=" + ram +
                ", ekranKarti=" + ekranKarti +
                ", islemci=" + islemci +
                '}';
    }
}
