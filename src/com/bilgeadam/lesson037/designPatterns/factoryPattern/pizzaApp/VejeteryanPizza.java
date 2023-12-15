package com.bilgeadam.lesson037.designPatterns.factoryPattern.pizzaApp;

public class VejeteryanPizza  extends Pizza{

    public VejeteryanPizza(ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {
        super(tur, hamurTipi, boyut);
    }
    @Override
    public String toString() {
        return "VejeteryanPizza{} " + super.toString();
    }
}
