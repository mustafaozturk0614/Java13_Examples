package com.bilgeadam.lesson019.interfaceDemo2;

public class Gemi extends  Arac  implements IDenizTasiti{
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
}
