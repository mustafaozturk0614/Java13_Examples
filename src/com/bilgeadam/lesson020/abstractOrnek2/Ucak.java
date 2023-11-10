package com.bilgeadam.lesson020.abstractOrnek2;

public  abstract class Ucak extends Arac implements IHavaAraci {

    private int kanatUzunlugu;

    public int getKanatUzunlugu() {
        return kanatUzunlugu;
    }

    public void setKanatUzunlugu(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "kanatUzunlugu=" + kanatUzunlugu +
                '}';
    }

    @Override
    public void kalkisYap() {
        System.out.println(getClass().getSimpleName()+ " Ucak kalkıyor");
    }

    @Override
    public void inisYap() {
        System.out.println( getClass().getSimpleName()+" Ucak iniyor");
    }

    @Override
    public void hizlan() {
        setHiz(getHiz()+50);
        System.out.println(getClass().getSimpleName()+" adlı aracın hızı===>"+getHiz());
    }

    @Override
    public void yavasla() {
        setHiz(getHiz()-50);
        System.out.println(getClass().getSimpleName()+" adlı aracın hızı===>"+getHiz());
    }
}
