package com.bilgeadam.lesson037.designPatterns.singeltonPattern.enums;

public class EvHalkı extends  Thread {

    String ad;
    String statu;

    public EvHalkı(String ad, String statu) {
        this.ad = ad;
        this.statu = statu;
    }
    public EvHalkı() {
       
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }
    public void robotCagir(){
        Robot.ROBOT.calis();
    }


    @Override
    public String toString() {
        return "EvHalkı{" +
                "ad='" + ad + '\'' +
                ", statu='" + statu + '\'' +
                '}';
    }

    @Override
    public void run() {
        robotCagir();
    }
}
