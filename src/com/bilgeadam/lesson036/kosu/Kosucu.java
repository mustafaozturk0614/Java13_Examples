package com.bilgeadam.lesson036.kosu;

public class Kosucu implements Runnable{
    private String isim;
    private int mesafe;
    private long sure;
    private long baslangicZamani;
    private double adimUzunlugu;
    public Kosucu(String isim, int mesafe, long baslangicZamani, double adimUzunlugu) {
        this.isim = isim;
        this.mesafe = mesafe;
        this.baslangicZamani = baslangicZamani;
        this.adimUzunlugu = adimUzunlugu;
    }
    public Kosucu(String isim, int mesafe, long baslangicZamani) {
        this.isim = isim;
        this.mesafe = mesafe;
        this.baslangicZamani = baslangicZamani;
        this.adimUzunlugu = 1;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMesafe() {
        return mesafe;
    }

    public void setMesafe(int mesafe) {
        this.mesafe = mesafe;
    }

    public long getSure() {
        return sure;
    }

    public void setSure(long sure) {
        this.sure = sure;
    }

    public long getBaslangicZamani() {
        return baslangicZamani;
    }

    public void setBaslangicZamani(long baslangicZamani) {
        this.baslangicZamani = baslangicZamani;
    }

    public double getAdimUzunlugu() {
        return adimUzunlugu;
    }

    public void setAdimUzunlugu(double adimUzunlugu) {
        this.adimUzunlugu = adimUzunlugu;
    }

    @Override
    public String toString() {
        return "Kosucu{" +
                "isim='" + isim + '\'' +
                ", mesafe=" + mesafe +
                ", sure=" + sure +
                ", baslangicZamani=" + baslangicZamani +
                ", adimUzunlugu=" + adimUzunlugu +
                '}';
    }

    @Override
    public void run() {
        System.out.println("baslangic zamani==>"+baslangicZamani);
        double anlıkMesafe=0;
        long bitisZamanı=0;
        while (anlıkMesafe<mesafe){
            anlıkMesafe+=adimUzunlugu;
            if (anlıkMesafe%10==0){
                System.out.println(isim+"==>"+anlıkMesafe+". metrede");
            }

        }
        bitisZamanı=System.nanoTime();
        this.sure=bitisZamanı-baslangicZamani;
        System.out.println(  isim+ " adlı kosucu "+mesafe+" metreyi "+ sure +" msn de kostu");
    }
}
