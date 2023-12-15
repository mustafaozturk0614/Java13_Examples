package com.bilgeadam.lesson037.designPatterns.factoryPattern.pizzaApp;

public class TavukluPizza extends Pizza {
    public TavukluPizza(ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {
        super(tur, hamurTipi, boyut);
    }

    @Override
    public String toString() {
        return "TavukluPizza{} " + super.toString();
    }
}
