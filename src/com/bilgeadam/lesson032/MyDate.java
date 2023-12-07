package com.bilgeadam.lesson032;

public class MyDate {
    private long kabulTarihi;
    private EGun kabulGunu;


    public MyDate(long kabulTarihi, EGun kabulGunu) {
        this.kabulTarihi = kabulTarihi;
        this.kabulGunu = kabulGunu;
    }

    public long getKabulTarihi() {
        return kabulTarihi;
    }

    public void setKabulTarihi(long kabulTarihi) {
        this.kabulTarihi = kabulTarihi;
    }

    public EGun getKabulGunu() {
        return kabulGunu;
    }

    public void setKabulGunu(EGun kabulGunu) {
        this.kabulGunu = kabulGunu;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "kabulTarihi=" + kabulTarihi +
                ", kabulGunu=" + kabulGunu +
                '}';
    }
}
