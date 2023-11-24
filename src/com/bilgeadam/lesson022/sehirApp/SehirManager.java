package com.bilgeadam.lesson022.sehirApp;

import java.util.List;
import java.util.Random;

/*
    bir sehire random nufus atama metodu yazılacak ==>500 000 ile  10 000 000 arasında


 */
public class SehirManager implements ISehir {


    public void randomNufusAta(Sehir sehir){
        Random random=new Random();
        sehir.setNufus(random.nextLong(500000,10000000));
      //  System.out.println(sehir.getNufus());
    }

    @Override
    public void plakaKoduAta(Sehir sehir,int i) {
            if (i<10){
                sehir.setPlakaNo("0"+(i));
            }else {
                sehir.setPlakaNo((i)+"");
            }
    }

//    public static void main(String[] args) {
//        SehirManager sehirManager=new SehirManager();
//        Sehir sehir=new Sehir("Ankara");
//        sehirManager.randomNufusAta(sehir);
//
//    }

}
