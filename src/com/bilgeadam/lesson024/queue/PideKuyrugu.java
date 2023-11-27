package com.bilgeadam.lesson024.queue;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/*
    String bir kuyruk olusturcagız
    bir metot ile 10 tane musteri ekleyeceğiz
    daha sonra random 1 - 12  adet arasında bir pide uretecğiz pide sayımız

    daha sonra olsmus kuyruga pideleri dagıtacağız
    pide bittiğinde pide kalmadı cıktısı verelim
    eğer  pide almayan varsa pide almayanları da ayrıca yazdıralım


 */
public class PideKuyrugu {
    Queue<String> pideKuyrugu=new ArrayBlockingQueue<>(10);
    Random random=new Random();
    int pideSayisi;


    public void musteriEkle(){
        for (int i = 0; i <10 ; i++) {
            pideKuyrugu.offer("Musteri "+(i+1));
        }
    }

    public int pideSayısıBelirle(){
        this.pideSayisi = random.nextInt(1,5);
        return pideSayisi;
    }

    public void pideDağıt(){
        pideSayısıBelirle();
        System.out.println("pidesayısı===>"+pideSayisi);
        for (int i = 0; i <pideSayisi ; i++) {
            if (!pideKuyrugu.isEmpty()){
            String musteri=pideKuyrugu.poll();
            System.out.println(musteri+" pide aldı");
            }
            else {
                System.out.println("kalan pide sayisi==>" +(pideSayisi-(i)));
                break;
            }
        }
    }

    public void pideAlmayanlar(){
        if (!pideKuyrugu.isEmpty()){
            System.out.println("pide bitti.... Pide alamayan musteriler");
            for (String musteri:pideKuyrugu){
                System.out.println(musteri);
            }
        }else {
            System.out.println("Pidesini almayan kalmadı");
        }
    }

}
