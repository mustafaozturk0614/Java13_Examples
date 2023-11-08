package com.bilgeadam.lesson017;

public class Calisan {

   private   String isim;
    private   String soyIsım;
    private  String unvan;
    private  double maas;

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

    public  void  zamYap(double oran){
        this.maas+=(this.maas*oran);
    }

    public double getMaas(){
        return  this.maas;
    }
    public void setMaas(double maas){
        this.maas=maas;

    }
    public String getIsim(){
        return  this.isim;
    }
    public  void  setIsim(String isim){
        this.isim=isim;
    }

    public String getSoyIsım() {
        return soyIsım;
    }

    public void setSoyIsım(String soyIsım) {
        this.soyIsım = soyIsım;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
