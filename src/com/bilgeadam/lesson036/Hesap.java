package com.bilgeadam.lesson036;

public class Hesap {

    int bakiye=0;

//synchronized keywordu metodları thread safe hale getirir iki thrad aynı anda bu metodu ÇALIŞTIRAMAZ!!!
    public synchronized void paraYatir(int para){
        this.bakiye+=para;
        System.out.println(Thread.currentThread().getName()+"===> para yatırdı==>"+bakiye);
    }

    public void paraCek(int para){
            bakiye-=para;
            System.out.println(Thread.currentThread().getName()+"===> para cekit==>"+bakiye);
    }
}
