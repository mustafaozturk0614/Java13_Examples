package com.bilgeadam.lesson020.abstractOrnek;

import java.util.Random;
/*
    abstract classlardan newleme işlemi ile bir nesne uretilmez
    abstract sınıflarda govdeli metotlar  yazılabilir
    abstract sınıflarda govdesiz abstract metotlar yazilabilir

 */
public  abstract class Pokemon {
    public int id;
    public String tur;
    public  String ad;
    public int seviye;
    public int can;
    public int guc;
    public  int hediyePuan;

    // default constructor
    //const==> kurucu metot  (new leme işleminin yapıldıgı yer )
    // nesneyi olusturan metot
    // eğer sınıfın içinde herhangi bir const. yoksa default const(boş cons)
    // otamatik gelri olusturmamıza gerek yok
    // eğer başka bir const var ise ve biz yinede boş const ihtiyac
    // duyuyorsak bos const olusturmak zorundayız
    public Pokemon(){
        this.hediyePuan=120;
        this.id= new Random().nextInt(0,100);
    }
    public  Pokemon(String isim){
        this();
        ad=isim;
//        this.hediyePuan=120;
//        this.id= new Random().nextInt(0,100);

    }

    public Pokemon(String tur, String ad, int seviye, int can, int guc) {
       // this();
        this(ad);
       // this.ad=ad;
        this.tur = tur;
        this.seviye = seviye;
        this.can = can;
        this.guc = guc;
//        this.hediyePuan=120;
//        this.id= new Random().nextInt(0,100);
    }

    public  Pokemon(int myId, String isim, String cesit, int hp, int vurusGucu, int level){
        this(cesit,isim,level,hp,vurusGucu);
        id=myId;
//        ad=isim;
//        tur=cesit;
//        can=hp;
//        guc=vurusGucu;
//        seviye=level;
//        this.hediyePuan=120;

    }

    //alt+insert

    // govdesiz metotlar alt sınflarda ozelleşebilecek metotlardır
    public abstract void ozelSaldiriYap();

    //govdeli metotlar ise butun alt sınıflar için aynı işlemi yapan metotlardır
    public void saldir(){
        System.out.println(ad+" adlı pokemon saldırıda bulunuyor");
    }

    public void kacinma(){
        System.out.println(ad+" adlı pokemon saldırıdan kaçındı");
    }

    public void bilgileriGoster(){
        System.out.println("===============");
        System.out.println("id= "+id);
        System.out.println("ad= "+ad);
        System.out.println("tur= "+tur);
        System.out.println("can= "+can);
        System.out.println("guc= "+guc);
        System.out.println("seviye= "+seviye);
        System.out.println("hediye puanı= "+hediyePuan);
        System.out.println("===============");
    }
}
