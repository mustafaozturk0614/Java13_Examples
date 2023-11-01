package com.bilgeadam.lesson013;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
   public String oyuncuAdi;
   public String [] secenekler={"TAS","KAGIT","MAKAS" };


   public  String secimYap(){
      Scanner scanner=new Scanner(System.in);
      System.out.println(Arrays.toString(secenekler)+" seceneklerinden birini seciniz");
      String secim= scanner.nextLine();
      return  secim;
   }

   public  String secimYap2(){
      Scanner scanner=new Scanner(System.in);
      /*
        1-Tas
        2-Kagıt
        3-Makas
         kullanıcan 1.2 veya 3 den birni secmesini isteyeceğiz
       */
      for (int i = 0; i < secenekler.length ; i++) {
         System.out.println((i+1)+"-"+secenekler[i]);
      }
      System.out.println("Lütfen 1,2, veya 3. secenekden brini seciniz");
      int secim= scanner.nextInt()-1;
      return  secenekler[secim];
   }

   public  String pcSecim(){
      Random random=new Random();
      int secim= random.nextInt(secenekler.length);
      return secenekler[secim];
   }

   public void  uygulama(){

      System.out.println("**"+oyuncuAdi+ " Hoşgeldin**");
      System.out.println("====TAŞ KAĞIT MAKAS OYUNU=====");
      String secim=secimYap2();
      String rast=pcSecim();

      System.out.println("Pc secim==>"+rast);
      if (secim.equals(rast)){
         System.out.println("Sonuc...: Berabere");
      } else if (secim.equals("TAS") && rast.equals("KAGIT")) {
         System.out.println("Sonuc...: Kaybettiniz");
      }else if (secim.equals("TAS") && rast.equals("MAKAS")) {
         System.out.println("Sonuc...: Kazandınız");
      }else if (secim.equals("KAGIT") && rast.equals("TAS")) {
         System.out.println("Sonuc...: Kazandınız");
      }else if (secim.equals("KAGIT") && rast.equals("MAKAS")) {
         System.out.println("Sonuc...: Kaybettiniz");
      }else if (secim.equals("MAKAS") && rast.equals("KAGIT")) {
         System.out.println("Sonuc...: Kazandınız");
      }else if (secim.equals("MAKAS") && rast.equals("TAS")) {
         System.out.println("Sonuc...: Kaybettiniz");
      }
   }



   public void  uygulama2(){
      System.out.println("**"+oyuncuAdi+ " Hoşgeldin**");
      System.out.println("====TAŞ KAĞIT MAKAS OYUNU=====");
      String secim=secimYap2();
      String rast=pcSecim();
      System.out.println("Pc secim==>"+rast);
      if (secim.equals(rast)){
         System.out.println("Sonuc...: Berabere");
      }
      else {
         switch (secim) {
            case "TAS":
                  if (rast.equals("KAGIT")) {
                     System.out.println("Sonuc...: Kaybettiniz");
                  }else{
                     System.out.println("Sonuc...: Kazandınız");
                  }
               break;
            case "KAGIT":
               if (rast.equals("MAKAS")) {
                  System.out.println("Sonuc...: Kaybettiniz");
               }else{
                  System.out.println("Sonuc...: Kazandınız");
               }
               break;
            case "MAKAS":
               if (rast.equals("TAS")) {
                  System.out.println("Sonuc...: Kaybettiniz");
               }else{
                  System.out.println("Sonuc...: Kazandınız");
               }
               break;
         }
      }
   }

}