package com.bilgeadam.lesson017;

public class OfisCalisani  extends  Calisan{
    public OfisCalisani(String isim, String soyIsım) {
        super(isim, soyIsım);
        this.unvan="Ofis Calısanı";
    }

    public OfisCalisani(String isim, String soyIsım, double maas) {
        super(isim, soyIsım, maas);
        unvanBelirle(maas);
    }
    public void unvanBelirle(double maas){
        if (maas<18000){
            System.out.println("18 000 altında bir maas girilmiş ise en dusuk maas 18 000 dir " +
                    "personel maası 18 000 olarak ayarlandı");
            this.unvan="Ofis Calısanı";
            this.maas=18000;
        } else if (maas<27000) {
            this.unvan="Ofis Calısanı";
        }else {
            this.unvan="Kıdemli Calısan";
        }
    }
}
