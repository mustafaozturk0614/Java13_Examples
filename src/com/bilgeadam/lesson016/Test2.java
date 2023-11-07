package com.bilgeadam.lesson016;

public class Test2 {

    public static void main(String[] args) {

        // elektrik pokemonu için id haric diğer bilgileri dısardan alan bir const yazalım ve
        // eger elektrik pokemonu yaratıyorsam turum otamatik olark elektrik gelsin
        ElektirkPokemonu elektirkPokemonu=new ElektirkPokemonu("rayichu");
       // elektirkPokemonu.tur="Elektrik";

        Pokemon pokemon1=new Pokemon();
        pokemon1.ad="Pikachu";
        pokemon1.tur="Elektrik";
        pokemon1.seviye=2;
        pokemon1.guc=28;
        pokemon1.can=250;
        pokemon1.bilgileriGoster();
        elektirkPokemonu.bilgileriGoster();

        ElektirkPokemonu elektirkPokemonu2=new ElektirkPokemonu("rayichu",3,320,1250);
        elektirkPokemonu2.bilgileriGoster();

    }
}
