package com.bilgeadam.lesson028.sehirApp;

import java.util.Random;

/*
    bir sehire random nufus atama metodu yazılacak ==>500 000 ile  10 000 000 arasında


 */
public class SehirManager implements ISehir {

    Random random=new Random();
    public void randomNufusAta(Sehir sehir){
        sehir.setNufus(random.nextLong(500000,10000000));
      //  System.out.println(sehir.getNufus());
    }

    @Override
    public void plakaKoduAta(Sehir sehir, int i) {
            if (i<10){
                sehir.setPlakaNo("0"+(i));
            }else {
                sehir.setPlakaNo(String.valueOf(i));
            }
    }

    @Override
    public void bolgeAta(Sehir sehir) {
        int index= random.nextInt(EBolge.values().length);
        EBolge bolge= EBolge.values()[index];
        sehir.setBolge(bolge);
    }

//    public static void main(String[] args) {
//        SehirManager sehirManager=new SehirManager();
//        Sehir sehir=new Sehir("Ankara");
//        sehirManager.randomNufusAta(sehir);
//
//    }

}
