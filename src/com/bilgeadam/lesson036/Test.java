package com.bilgeadam.lesson036;

public class Test {

    public static void main(String[] args) {
        Calisan calisan1=new Calisan("Mustafa");
        Calisan calisan2=new Calisan("Ece");
        Calisan calisan3=new Calisan("Özge");
        Calisan calisan4=new Calisan("Furkan");
        Calisan calisan5=new Calisan("Sinem");

//        calisan1.calis();
//        calisan2.calis();
        // run metodu thread olarak calıstırmaz direk run metodunu normal bir metod olarak calıstırır
        // biz sınıfmızn bir thread olarak calısmasını istiyorsak strat metodunu kullancagız
//        calisan1.run();
//        calisan2.run();

        calisan1.start();
        calisan2.start();
        calisan3.start();
        calisan4.start();
        calisan5.start();
        System.out.println("Program başladı");

    }
}
