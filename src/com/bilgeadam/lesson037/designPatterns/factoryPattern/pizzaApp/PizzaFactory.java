package com.bilgeadam.lesson037.designPatterns.factoryPattern.pizzaApp;

public class PizzaFactory {

    public static Pizza pizzaOlustur(ETur tur,EHamurTipi hamurTipi,EBoyut boyut){
        switch (tur){
            case AKDENIZ -> {
                return new VejeteryanPizza(tur,hamurTipi,boyut);
            }
            case KARISIK,TONBALIKLI ->{
                return new KlasikPizza(tur,hamurTipi,boyut);
            }
            case TAVVUKLU ,BARBEKUTAVUKLU-> {
                return  new TavukluPizza(tur,hamurTipi,boyut);
            }
            default -> throw new RuntimeException("Hatalı pizza secimi");
        }
    }


}
