package com.bilgeadam.lesson024.queue.banka;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Banka {


//    Comparator<Musteri> comparator=new Comparator<Musteri>() {
//        @Override
//        public int compare(Musteri o1, Musteri o2) {
//            return o1.getSiraNo() -o2.getSiraNo();
//        }
//    };

    Queue<Musteri> musteriler=new PriorityQueue<>();


    public void kuyrugaMusteriEkle(){
        musteriler.offer(new Musteri("Mustafa",5,false));
        musteriler.offer(new Musteri("Kemal",1,true));
        musteriler.offer(new Musteri("Merve",3,true));
        musteriler.offer(new Musteri("Ali",2,false));
        musteriler.offer(new Musteri("Okan",4,false));
        musteriler.offer(new Musteri("Gizem",7,true));
        musteriler.offer(new Musteri("Zeliha",6,true));
    }

    public void kuyruguYazdir(){
        while (!musteriler.isEmpty()){
            System.out.println(musteriler.poll());
        }
    }

    public static void main(String[] args) {
        Banka banka=new Banka();
        banka.kuyrugaMusteriEkle();
        banka.kuyruguYazdir();
    }
}
