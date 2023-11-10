package com.bilgeadam.lesson020.enums;

public enum EAylar {
    HAZIRAN(30,"YAZ") ,TEMMUZ(31,"YAZ"),AGUSTOS(31,"YAZ"),EYLUL(30,"SONBAHAR"),EKIM(31,"SONBAHAR");

    private int gunSayisi;
    private String mevsim;

    private  EAylar(int gunSayisi,String mevsim){
        this.gunSayisi=gunSayisi;
        this.mevsim=mevsim;
    }
    public int getGunSayisi() {
        return gunSayisi;
    }

    public String getMevsim() {
        return mevsim;
    }


}
