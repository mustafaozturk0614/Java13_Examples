package com.bilgeadam.lesson037.designPatterns.factoryPattern.pizzaApp;
/*
    Bir Pizza siparis uygulaması
    kullanıcı dısardan Pizzanın
    hamur tipini
    boyutunu
    turunu daha sonra bunu bir factory sınıfı uzerinden pizza olusturup bize donmesini bekliyoruz



 */
public class App {

    public static void main(String[] args) {

        new PizzaSiparis().menu();

    }
}
