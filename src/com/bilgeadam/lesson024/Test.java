package com.bilgeadam.lesson024;

import java.util.Random;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        TabakManager tabakManager=new TabakManager();
        tabakManager.tabakOlustur();
        tabakManager.getKirliler().forEach(System.out::println);
        System.out.println("///////////////////////////////");
        tabakManager.getTemizler().forEach(System.out::println);

        // 50 kere secim yap metodunu calıstıralım ve secimler random olsun
        Random random=new Random();
        for (int i = 0; i <50 ; i++) {
            int secim= random.nextInt(1,3);
            tabakManager.secimYap(secim);
            Thread.sleep(300);
        }

    }
}
