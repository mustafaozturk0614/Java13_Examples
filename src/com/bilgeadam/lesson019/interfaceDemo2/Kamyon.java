package com.bilgeadam.lesson019.interfaceDemo2;

public class Kamyon  extends  Arac implements  IKaraTasiti,IYuk{

    private int kasaUzunlugu;


    public int getKasaUzunlugu() {
        return kasaUzunlugu;
    }

    public void setKasaUzunlugu(int kasaUzunlugu) {
        this.kasaUzunlugu = kasaUzunlugu;
    }

    @Override
    public String toString() {
        return "Kamyon{" +
                "kasaUzunlugu=" + kasaUzunlugu +
                '}';
    }

    @Override
    public void sur() {
        System.out.println(getClass().getSimpleName()+" hareket ediyor");
    }

    @Override
    public void yukAl() {
        System.out.println(getClass().getSimpleName()+" yuk alıyor");
    }
    @Override
    public void yukBosalt() {
        System.out.println(getClass().getSimpleName()+" yuk  bosaltıyor");
    }
}
