package com.bilgeadam.lesson021.enums;

public enum EUrun {
    CIPS(25),KOLA(30),SEKER(100.80),
    YAG(352.40),UN(145),EKMEK(10),CAY(189.90),
    YUMURTA(80.45),YOGURT(152.45),SUT(52.65);

    private double fiyat;

    EUrun(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }


}
