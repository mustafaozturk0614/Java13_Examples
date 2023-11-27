package com.bilgeadam.lesson024.queue;

public class App {

    public static void main(String[] args) throws InterruptedException {
        PideKuyrugu pideKuyrugu=new PideKuyrugu();
        pideKuyrugu.musteriEkle();
//        pideKuyrugu.pideDağıt();
//        pideKuyrugu.pideAlmayanlar();
//        Thread.sleep(2000);
//        pideKuyrugu.pideDağıt();
//        pideKuyrugu.pideAlmayanlar();
//        Thread.sleep(2000);
//        pideKuyrugu.pideDağıt();
//        pideKuyrugu.pideAlmayanlar();
//        Thread.sleep(2000);
//        pideKuyrugu.pideDağıt();
//        pideKuyrugu.pideAlmayanlar();
        while (!pideKuyrugu.pideKuyrugu.isEmpty()){
            pideKuyrugu.pideDağıt();
            pideKuyrugu.pideAlmayanlar();
            Thread.sleep(2000);
        }

    }
}
