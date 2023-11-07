package com.bilgeadam.lesson016;

public class ElektirkPokemonu  extends Pokemon{


    public ElektirkPokemonu(String isim) {
        super(isim);
        this.tur="Elektrik";
    }



    public ElektirkPokemonu(String ad, int seviye, int can, int guc) {
        super("Elektrik",ad, seviye, can, guc);
       // this.tur="Elektrik";
    }
}
