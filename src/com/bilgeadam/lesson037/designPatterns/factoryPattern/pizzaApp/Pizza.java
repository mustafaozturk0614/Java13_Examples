package com.bilgeadam.lesson037.designPatterns.factoryPattern.pizzaApp;

public class Pizza {
    private ETur tur;
    private EHamurTipi hamurTipi;
    private EBoyut boyut;

    public Pizza(ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {
        this.tur = tur;
        this.hamurTipi = hamurTipi;
        this.boyut = boyut;
    }

    public ETur getTur() {
        return tur;
    }

    public void setTur(ETur tur) {
        this.tur = tur;
    }

    public EHamurTipi getHamurTipi() {
        return hamurTipi;
    }

    public void setHamurTipi(EHamurTipi hamurTipi) {
        this.hamurTipi = hamurTipi;
    }

    public EBoyut getBoyut() {
        return boyut;
    }

    public void setBoyut(EBoyut boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tur=" + tur +
                ", hamurTipi=" + hamurTipi +
                ", boyut=" + boyut +
                '}';
    }
}
