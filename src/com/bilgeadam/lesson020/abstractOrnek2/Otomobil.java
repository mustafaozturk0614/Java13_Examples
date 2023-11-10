package com.bilgeadam.lesson020.abstractOrnek2;

public class Otomobil  extends Arac implements IKaraTasiti {


    @Override
    public void sur() {
        System.out.println(getClass().getSimpleName()+" hareket ediyor");
    }

    @Override
    public void hizlan() {
        setHiz(getHiz()+20);
        System.out.println(getClass().getSimpleName()+" adlı aracın hızı===>"+getHiz());
    }

    @Override
    public void yavasla() {
        setHiz(getHiz()-20);
        System.out.println(getClass().getSimpleName()+" adlı aracın hızı===>"+getHiz());
    }
}
