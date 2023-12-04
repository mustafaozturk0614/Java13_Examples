package com.bilgeadam.lesson029.menuCozum;

public enum EIcecek {
    AYRAN(false),KOLA(false),GAZOZ(false),MEYVESUYU(false),LİMONATA(false),ICETEA(false),FANTA(false);

    boolean atandiMi;

    EIcecek(boolean atandiMi) {
        this.atandiMi = atandiMi;
    }
}
