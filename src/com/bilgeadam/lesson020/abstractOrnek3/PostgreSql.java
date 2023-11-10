package com.bilgeadam.lesson020.abstractOrnek3;

public class PostgreSql extends Database{


    @Override
    public void veriEkle() {
        System.out.println("Postgreya veri eklendi");
    }

    @Override
    public void veriSil() {
        System.out.println("Postgredan veri silindi");
    }

    @Override
    public void veriGuncelle() {
        System.out.println("Postgreda veri guncellendi");
    }

    @Override
    public void verileriGetir() {
        System.out.println("Postgredan veriler getirildi");
    }

}
