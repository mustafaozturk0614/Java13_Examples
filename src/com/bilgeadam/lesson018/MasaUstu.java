package com.bilgeadam.lesson018;

public class MasaUstu extends Bilgisayar{
    Monitor monitor;
    int kasaBoyutu;

    public MasaUstu(String marka, AnaKart anaKart, Klavye klavye, Mouse mouse, Monitor monitor, int kasaBoyutu) {
        super(marka, anaKart, klavye, mouse);
        this.monitor = monitor;
        this.kasaBoyutu = kasaBoyutu;
    }

    @Override
    public String toString() {
        return "MasaUstu{" +
                "monitor=" + monitor +
                ", kasaBoyutu=" + kasaBoyutu +
                ", marka='" + marka + '\'' +
                ", anaKart=" + anaKart +
                ", klavye=" + klavye +
                ", mouse=" + mouse +
                '}';
    }
}
