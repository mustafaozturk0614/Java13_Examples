package com.bilgeadam.lesson037.designPatterns.factoryPattern.pizzaApp;

public class KlasikPizza extends Pizza{

    public KlasikPizza(ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {
        super(tur, hamurTipi, boyut);
    }

    @Override
    public String toString() {
        return "KlasikPizza{} " + super.toString();
    }
}
