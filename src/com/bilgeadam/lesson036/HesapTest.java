package com.bilgeadam.lesson036;

public class HesapTest {

    public static void main(String[] args) {
        Hesap hesap = new Hesap();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                hesap.paraYatir(1);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                hesap.paraYatir(1);
            }
        });

        thread1.start();
        thread2.start();




    }

}
