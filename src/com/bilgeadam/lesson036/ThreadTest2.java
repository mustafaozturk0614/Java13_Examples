package com.bilgeadam.lesson036;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest2 {


    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        AtomicInteger atomicInteger=new AtomicInteger();
        AtomicInteger atomicInteger2=new AtomicInteger();
        Thread thread=new Thread(()->{
            for (int i = 0; i <1 ; i++) {
                System.out.println("1.thread ekleme yaptı");
                list.add(i);
                atomicInteger.incrementAndGet();
            }
        });
        Thread thread2=new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                System.out.println("2.thread ekleme yaptı");
                list.add(i);
                atomicInteger2.incrementAndGet();
            }
        });
        thread.start();
        thread2.start();
        try {
            thread.join();
           // thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("liste uzunlugu==>"+list.size());
        System.out.println("1thread calısma sayısı==>"+atomicInteger);
        System.out.println("2.thread calısma sayısı==>"+atomicInteger2);

    }


}
