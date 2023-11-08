package com.bilgeadam.lesson018;

public class Bilgisayar {
    public  String marka;

    // Composition agretaion
    public  AnaKart anaKart;

    public Klavye klavye;

    public Mouse mouse;


    //    public  Ram ram;
//    public EkranKarti ekranKarti;
//    public Islemci islemci;
    public Bilgisayar() {
    }

    public Bilgisayar(String marka, AnaKart anaKart, Klavye klavye, Mouse mouse) {
        this.marka = marka;
        this.anaKart = anaKart;
        this.klavye = klavye;
        this.mouse = mouse;
    }
    public Bilgisayar(String marka, AnaKart anaKart) {
        this.marka = marka;
        this.anaKart = anaKart;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "marka='" + marka + '\'' +
                ", anaKart=" + anaKart +
                ", klavye=" + klavye +
                ", mouse=" + mouse +
                '}';
    }
}
