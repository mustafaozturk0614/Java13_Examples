package com.bilgeadam.lesson017.altsınıflar;

import com.bilgeadam.lesson017.Calisan;

public class OfisCalisani  extends Calisan {
    public OfisCalisani(String isim, String soyIsım) {
        super(isim, soyIsım);
        setUnvan("Ofis Calısanı");;
    }

    public OfisCalisani(String isim, String soyIsım, double maas) {
        super(isim, soyIsım, maas);
        unvanBelirle(maas);
    }
    public void unvanBelirle(double maas){
        if (maas<18000){
            System.out.println("18 000 altında bir maas girilmiş ise en dusuk maas 18 000 dir " +
                    "personel maası 18 000 olarak ayarlandı");
           setUnvan("Ofis Calısanı");;
            setMaas(18000);;
        } else if (maas<27000) {
            setUnvan("Ofis Calısanı");
        }else {
           setUnvan("Kıdemli Calısan");;
        }
    }


}
