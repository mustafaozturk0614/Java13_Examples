package com.bilgeadam.lesson021.entity;

import com.bilgeadam.lesson021.enums.EUrun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sepet {
    private List<EUrun> urunler;
    private int urunSayisi;
    private double toplam;
    private  boolean hesaplandiMi;

    public boolean isHesaplandiMi() {
        return hesaplandiMi;
    }

    public void setHesaplandiMi(boolean hesaplandiMi) {
        this.hesaplandiMi = hesaplandiMi;
    }

    public Sepet() {
        this.urunler=new ArrayList<>();
    }

    public List<EUrun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<EUrun> urunler) {
        this.urunler = urunler;
    }

    public int getUrunSayisi() {
        return urunSayisi;
    }

    public void setUrunSayisi(int urunSayisi) {
        this.urunSayisi = urunSayisi;
    }

    public double getToplam() {
        return toplam;
    }

    public void setToplam(double toplam) {
        this.toplam = toplam;
    }


    public  double toplamTutariHesapla(){
        double sonuc=0;
        for (EUrun urun : urunler){
           sonuc+=urun.getFiyat();
        }
        toplam=sonuc;
        return  toplam;
    }
    public  double toplamTutariHesapla2(){
       toplam=0;
        for (EUrun urun : urunler){
            toplam+=urun.getFiyat();
        }

        return  toplam;
    }

    public  double toplamTutariHesapla3(){
            if (!hesaplandiMi){
                for (EUrun urun : urunler){
                    toplam+=urun.getFiyat();
                }
                hesaplandiMi=true;
            }else {
                System.out.println("Daha once hesaplanmıştır");
            }


        return  toplam;
    }

    @Override
    public String toString() {
        return "Sepet{" +
                "urunler=" + urunler +
                ", urunSayisi=" + urunSayisi +
                ", toplam=" + toplam +
                '}';
    }
}
