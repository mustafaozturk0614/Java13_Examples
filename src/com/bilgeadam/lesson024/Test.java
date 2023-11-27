package com.bilgeadam.lesson024;

public class Test {

    public static void main(String[] args) {
        TabakManager tabakManager=new TabakManager();
        tabakManager.tabakOlustur();
        tabakManager.getKirliler().forEach(System.out::println);
        System.out.println("///////////////////////////////");
        tabakManager.getTemizler().forEach(System.out::println);
    }
}
