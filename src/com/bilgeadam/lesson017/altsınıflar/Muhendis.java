package com.bilgeadam.lesson017.altsınıflar;

import com.bilgeadam.lesson017.Calisan;

public class Muhendis extends Calisan {
    private double bonus=250;

    public Muhendis(String isim, String soyIsım) {
        super(isim, soyIsım);
       // this.unvan="Muhendis";
        setUnvan("Mühendis");
    }

    public Muhendis(String isim, String soyIsım, double maas) {
        super(isim, soyIsım, maas);
        unvanBelirle(maas);

    }

    public void unvanBelirle(double maas){
        if (maas<20000){
            System.out.println("20 000 altında bir maas girilmiş ise en dusuk maas 20 000 dir " +
                    "personel maası 20 000 olarak ayarlandı");
           // this.unvan="Muhendis";
            setUnvan("Muhendis");
           // this.maas=20000;
            setMaas(20000);
        } else if (maas<25000) {
            setUnvan("Muhendis");
        } else if (maas<35000){
            setUnvan("Kıdemli Muhendis");;
        }else {
            setUnvan("Yuksek Muhendis");
        }
    }


    @Override
    public void zamYap(double oran) {
        super.zamYap(oran);
       // this.maas+=bonus;
        setMaas(getMaas()+bonus);
    }
}
