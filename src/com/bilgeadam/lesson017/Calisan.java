package com.bilgeadam.lesson017;

public class Calisan {

    String isim;
    String soyIsım;
    String unvan;
    double maas;

    public  Calisan(String isim,String soyIsım){
        this.isim=isim;
        this.soyIsım=soyIsım;
        this.unvan="Calışan";
    }

    public  Calisan(String isim,String soyIsım,double maas){
//        this.isim=isim;
//        this.soyIsım=soyIsım;
        //this.unvan="Çalışan";
        this(isim,soyIsım);
        this.maas=maas;
    }
//ctrl + /
    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", soyIsım='" + soyIsım + '\'' +
                ", unvan='" + unvan + '\'' +
                ", maas=" + maas +
                '}';
    }
}
