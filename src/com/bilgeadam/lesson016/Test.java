package com.bilgeadam.lesson016;

import com.bilgeadam.lesson015.kutuphaneApp.Kutuphane;

public class Test {

    public static void main(String[] args) {
        Pokemon pokemon1=new Pokemon();

        pokemon1.ad="Pikachu";
        pokemon1.tur="Elektrik";
        pokemon1.seviye=2;
        pokemon1.guc=28;
        pokemon1.can=250;

        Pokemon pokemon2= new Pokemon();

        pokemon2.ad="Charizard";
        pokemon2.tur="Ateş";
        pokemon2.seviye=3;
        pokemon2.guc=80;
        pokemon2.can=550;

        pokemon1.saldir();
        pokemon2.saldir();
        pokemon1.kacinma();
        pokemon2.bilgileriGoster();
        pokemon1.bilgileriGoster();

        SuPokemonu suPokemonu= new SuPokemonu();
        suPokemonu.ad="squirtle";
        suPokemonu.can=220;
        suPokemonu.guc= 25;
        suPokemonu.seviye=2;
        suPokemonu.tur="Su";
        suPokemonu.yuzmeHizi=50;
        suPokemonu.suBasıncGucu=320;
        suPokemonu.bilgileriGoster();
        suPokemonu.saldir();

    }
}
