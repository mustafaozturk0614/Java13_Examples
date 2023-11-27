package com.bilgeadam.lesson024.queue.banka;
/*
    müşterilerimizin ismi olsun sıra no olsun birde banka musterismi değilmi onu tuttugmuz bir değişken olsun
    daha sonra bankada bir müsteri kuyrugu olusturalım ve banka musterisi olanlara oncelik verelim


 */
public class Musteri  implements Comparable<Musteri>{

    private String isim;
    private int siraNo;
    private boolean musteriMi;

    public Musteri(String isim, int siraNo, boolean musteriMi) {
        this.isim = isim;
        this.siraNo = siraNo;
        this.musteriMi = musteriMi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(int siraNo) {
        this.siraNo = siraNo;
    }

    public boolean isMusteriMi() {
        return musteriMi;
    }

    public void setMusteriMi(boolean musteriMi) {
        this.musteriMi = musteriMi;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "isim='" + isim + '\'' +
                ", siraNo=" + siraNo +
                ", musteriMi=" + musteriMi +
                '}';
    }

//    @Override
//    public int compareTo(Musteri o) {
//        if (o.musteriMi){
//            return 1;
//        }else {
//            return  -1;
//        }
//    }

    // musteri olup olmadıgana gore sıralama
//    @Override
//    public int compareTo(Musteri o) {
//        if (this.musteriMi){
//            return -1;
//        }else {
//            return  1;
//        }
//    }

//    @Override
//    public int compareTo(Musteri o) {
//        if (o.siraNo<this.siraNo){
//            return 1;
//        }else if (o.siraNo>this.siraNo){
//            return  -1;
//        }else {
//            return 0;
//        }
//    }

    @Override
    public int compareTo(Musteri o) {
        return this.siraNo-o.siraNo;
    }

}
