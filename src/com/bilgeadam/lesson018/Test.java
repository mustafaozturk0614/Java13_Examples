package com.bilgeadam.lesson018;

public class Test {

    public static void main(String[] args) {
        // Anakart olusturma kısmı/////////////////////
        Ram ram=new Ram(16);
        EkranKarti ekranKarti=new EkranKarti("11");
        Islemci islemci=new Islemci(4);
        AnaKart anaKart=new AnaKart(ram,ekranKarti,islemci);
        ///////////////////////////////////////

        Klavye klavye=new Klavye("Mekanik");
        Mouse mouse=new Mouse(2);
        Bilgisayar bilgisayar=new Bilgisayar();
        bilgisayar.marka="Monster";
        bilgisayar.anaKart= anaKart;
        bilgisayar.klavye= klavye;
        bilgisayar.mouse= mouse;
        System.out.println(bilgisayar);
        System.out.println(ram);


        DizUstu dizUstu=new DizUstu("Monster", anaKart,klavye,mouse, 80,"","");
        System.out.println(dizUstu);
    }

}
