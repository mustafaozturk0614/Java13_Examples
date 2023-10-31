package com.bilgeadam.lesson012;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProfileTest {

    public static void main(String[] args) {
        Random random=new Random();
        LinkedinProfile profile1=new LinkedinProfile(); // nesne olusturma kısmı
        LinkedinProfile profile2;


        profile1.isim="Mustafa";
        profile1.soyIsim="Öztürk";
        profile1.takipciSayisi= random.nextInt(100,1000000);
        profile1.adres="Ankara, Türkiye";
        profile1.meslek="Junior Java Software Developer";
        profile1.calismayaAcıkMi=true;

        System.out.println(profile1.isim+" "+profile1.soyIsim);
        ////  3. bir profil tanımladık  /////
        LinkedinProfile profile3= new LinkedinProfile();
        System.out.println(profile3);
        System.out.println(profile3.isim+" "+profile3.soyIsim);
        profile3.isim="Özge";
        profile3.soyIsim="Ünlü";
        System.out.println(profile3.isim+" "+profile3.soyIsim);

        System.out.println(Arrays.toString(profile1.bolumler));
        System.out.println(Arrays.toString(profile3.bolumler));
      //   profile1.bolumler=new String[5];
        profile1.bolumler[0]="Eğitim";
        System.out.println(Arrays.toString(profile1.bolumler));
       // profile3.bolumler=new String[15];
        System.out.println(Arrays.toString(profile3.bolumler));
      //  System.out.println(profile2.isim+" "+profile2.soyIsim);
        profile1.bolumEkle("Yetenekler",1);
        profile1.bolumEkle("Referanslar",2);
        profile3.bolumEkle("Eğitimm",0);
        System.out.println(Arrays.toString(profile1.bolumler));
        System.out.println(Arrays.toString(profile3.bolumler));


       // Scanner scanner=new Scanner(System.in);
//        String b="asdasd";
//        String c=new String("sdasdasd");
      //
     //   random.nextInt(1,5);

    }
}
