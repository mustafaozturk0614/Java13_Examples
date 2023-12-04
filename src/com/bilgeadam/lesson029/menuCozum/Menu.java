package com.bilgeadam.lesson029.menuCozum;

public class Menu {
     private   EYemek yemek;
    private    ECorba corba;
    private    EIcecek icecek;
    private   ETatli tatli;
    private    EGun gun;

    public Menu(EYemek yemek, ECorba corba, EIcecek icecek, ETatli tatli) {
        this.yemek = yemek;
        this.corba = corba;
        this.icecek = icecek;
        this.tatli = tatli;
    }

    public Menu(EYemek yemek, ECorba corba, EIcecek icecek, ETatli tatli, EGun gun) {
        this.yemek = yemek;
        this.corba = corba;
        this.icecek = icecek;
        this.tatli = tatli;
        this.gun = gun;
    }

    public EYemek getYemek() {
        return yemek;
    }

    public void setYemek(EYemek yemek) {
        this.yemek = yemek;
    }

    public ECorba getCorba() {
        return corba;
    }

    public void setCorba(ECorba corba) {
        this.corba = corba;
    }

    public EIcecek getIcecek() {
        return icecek;
    }

    public void setIcecek(EIcecek icecek) {
        this.icecek = icecek;
    }

    public ETatli getTatli() {
        return tatli;
    }

    public void setTatli(ETatli tatli) {
        this.tatli = tatli;
    }

    public EGun getGun() {
        return gun;
    }

    public void setGun(EGun gun) {
        this.gun = gun;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "yemek=" + yemek +
                ", corba=" + corba +
                ", icecek=" + icecek +
                ", tatli=" + tatli +
                ", gun=" + gun +
                '}';
    }
}
