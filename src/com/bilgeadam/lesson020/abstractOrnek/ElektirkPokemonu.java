package com.bilgeadam.lesson020.abstractOrnek;

public class ElektirkPokemonu  extends Pokemon {


    public ElektirkPokemonu(String isim) {
        super(isim);
        this.tur="Elektrik";
    }

    @Override
    public void ozelSaldiriYap() {
        System.out.println("Elektrik saldırısı");
    }


    public ElektirkPokemonu(String ad, int seviye, int can, int guc) {
        super("Elektrik",ad, seviye, can, guc);
       // this.tur="Elektrik";
    }
}
