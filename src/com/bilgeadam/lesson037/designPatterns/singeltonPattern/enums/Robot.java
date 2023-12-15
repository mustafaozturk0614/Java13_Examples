package com.bilgeadam.lesson037.designPatterns.singeltonPattern.enums;
/*
    1- 1 tane robotmuz var bu robotun birde calıs metodu olsun ==>( hascode()==> numaralı robot calısıyor)
    2-Ev halkı sınıfmız olsun bu sınıfta robotcagır metodu olsun
    bu metod calısınca bize robot sınıfndaki calıs metodunu calıstırsın
    (ev halkı herdefasında aynı robotu cagırmalı)
    3-Test sınıfında 3 tane ev halkı olusturup bunu deneyelim


 */
public enum Robot {
    ROBOT;




    public void calis(){
        System.out.println(ROBOT.hashCode()+" nolu robot çalışıyor...");
    }

}
