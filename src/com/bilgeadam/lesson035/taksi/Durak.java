package com.bilgeadam.lesson035.taksi;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Durak {

    List<Taksi> taksiler;
    Queue<Integer> musteriler;

    public Durak() {
        this.taksiler=new ArrayList<>();
        this.musteriler=new ArrayBlockingQueue<>(100);
        musteriOlustur();
        taksiOlustur();
    }

    public void musteriOlustur(){
        for (int i = 0; i <100 ; i++) {
            musteriler.offer(i+1);
        }
    }

    public void taksiOlustur(){
        for (int i = 0; i <10 ; i++) {
            taksiler.add(new Taksi(i+1,this));
        }
    }


}
