package com.bilgeadam.lesson018;

public class DizUstu extends Bilgisayar {
    double sarjYuzdesi;
    String ekran;
    String batarya;

    public DizUstu(String marka, AnaKart anaKart, Klavye klavye, Mouse mouse, double sarjYuzdesi, String ekran, String batarya) {
        super(marka, anaKart, klavye, mouse);
        this.sarjYuzdesi = sarjYuzdesi;
        this.ekran = ekran;
        this.batarya = batarya;
    }

    @Override
    public String toString() {
        return "DizUstu{" +
                "sarjYuzdesi=" + sarjYuzdesi +
                ", ekran='" + ekran + '\'' +
                ", batarya='" + batarya + '\'' +
                ", marka='" + marka + '\'' +
                ", anaKart=" + anaKart +
                ", klavye=" + klavye +
                ", mouse=" + mouse +
                "} ";
    }

    //    @Override
//    public String toString() {
//        return "DizUstu{" +
//                "sarjYuzdesi=" + sarjYuzdesi +
//                ", ekran='" + ekran + '\'' +
//                ", batarya='" + batarya + '\'' +
//                "} " + super.toString();
//    }


}
