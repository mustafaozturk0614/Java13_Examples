package com.bilgeadam.lesson020.abstractOrnek3;

public class MongoDb extends Database{
    @Override
    public void veriEkle() {
        System.out.println("Mongoya veri eklendi");
    }

    @Override
    public void veriSil() {
        System.out.println("Mongodan veri silindi");
    }

    @Override
    public void veriGuncelle() {
        System.out.println("Mongoda veri guncellendi");
    }

    @Override
    public void verileriGetir() {
        System.out.println("Mongodan veriler getirildi");
    }
}
