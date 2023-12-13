package com.bilgeadam.lesson036;

public class Calisan extends Thread {
    String isim;

    public Calisan(String isim) {
        this.isim = isim;
    }

    public void  calis(){
        for (int i = 0; i <5 ; i++) {
            bilgiGoster(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }


    public void  bilgiGoster(int sayi){
        System.out.println(isim+" adlı calısan çalışıyor====>"+ sayi);
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            bilgiGoster(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}
