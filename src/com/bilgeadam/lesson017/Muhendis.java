package com.bilgeadam.lesson017;

public class Muhendis extends Calisan {


    public Muhendis(String isim, String soyIsım) {
        super(isim, soyIsım);
        this.unvan="Muhendis";
    }

    public Muhendis(String isim, String soyIsım, double maas) {
        super(isim, soyIsım, maas);
        unvanBelirle(maas);

    }

    public void unvanBelirle(double maas){
        if (maas<20000){
            System.out.println("20 000 altında bir maas girilmiş ise en dusuk maas 20 000 dir " +
                    "personel maası 20 000 olarak ayarlandı");
            this.unvan="Muhendis";
            this.maas=20000;
        } else if (maas<25000) {
            this.unvan="Muhendis";
        } else if (maas<35000){
            this.unvan="Kıdemli Muhendis";
        }else {
            this.unvan="Yuksek Muhendis";
        }
    }

}
