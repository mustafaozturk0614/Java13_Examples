package com.bilgeadam.lesson020.abstractOrnek2;

public abstract class Gemi extends Arac implements IDenizTasiti {
    private int odaSayisi;

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    @Override
    public String toString() {
        return "Gemi{" +
                "odaSayisi=" + odaSayisi +
                '}';
    }

    @Override
    public void limanaYanas() {
        System.out.println( getClass().getSimpleName()+"  limana yanasıyor");
    }

    @Override
    public void yelkenAc() {
        System.out.println( getClass().getSimpleName()+"  limandan ayrılıyor");
    }


    @Override
    public void hizlan() {
        setHiz(getHiz()+10);
        System.out.println(getClass().getSimpleName()+" adlı aracın hızı===>"+getHiz());
    }

    @Override
    public void yavasla() {
        setHiz(getHiz()-10);
        System.out.println(getClass().getSimpleName()+" adlı aracın hızı===>"+getHiz());
    }
}
