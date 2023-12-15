package com.bilgeadam.lesson037.designPatterns.singeltonPattern.enums;

public class Test {

    public static void main(String[] args) {
        EvHalkı evHalkı1=new EvHalkı("Esra","Köle");
        EvHalkı evHalkı2=new EvHalkı("Limon","Kedi");
        EvHalkı evHalkı3=new EvHalkı("Morlock","Kedi");
        EvHalkı evHalkı4=new EvHalkı("Fındık","Kedi");

        evHalkı1.start();
        evHalkı2.start();
        evHalkı3.start();
        evHalkı4.start();

    }
}
