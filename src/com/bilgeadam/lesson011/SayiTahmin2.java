package com.bilgeadam.lesson011;

import java.util.Random;
import java.util.Scanner;

/*
    sayı tahmin oyunu
    5 adet hakkımız olacak
    program baslangıcata bize rastgele bir sayı üretecek  (1 ile 750 arası sayı uretsin)
    hakkımız bitene kadar tahminde bulunacagız
    eger tahmin ettiğimiz sayi uretilen sayıdan buyuk ise tahmininizi azaltın
    eger tahmin ettiğimiz sayi uretilen sayıdan kucuk ise tahmininizi arttıralım
    eger bir hakkımızda sayıyı tahmin edebilmişsek program sonlansın
    eger edememissek ve hakkmız bitmiş ise bir uzgunuz tahmin hakkınız bitti diye bir cıktı verelim
    ve  önce ki tahminlermizide bir arrayde tutalım oyun sonunda da tahminleriniz diye yazdıralım
 */
public class SayiTahmin2 {

    int hak;
    int tahminEdilcekSayi;

    public  int rastgeleSayiUret(){
        Random random=new Random();
        return random.nextInt(1,750);

    }

    public  int sayiAl(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 ile 750 arasında bir sayı tahmin giriniz");
        int sayi= scanner.nextInt();
        while (sayi<0 || sayi>750){
            System.out.println("yanlış aralıkta bir sayı girdiniz lütfen 1 ile 750 arasında bir sayı giriniz ");
            sayi=scanner.nextInt();
        }
        return sayi;

    }
    public  boolean sayiKontrol(int sayi1,int randomSayi,int hak){
        if (sayi1==randomSayi){
            System.out.println("Tebrikler tahmininiz dogru tahmin edilen sayı===> "+sayi1+ " "+(hak+1)+" hakkınızda bildiniz");
            return true;
        } else if (sayi1>randomSayi) {
            System.out.println("Lütfen tahmininizi azaltın");
        } else if (sayi1<randomSayi) {
            System.out.println("Lütfen tahmininizi arttırın");
        }
        return  false;
    }

 public  int [] sayiTahminEt(){

   tahminEdilcekSayi=rastgeleSayiUret();

     hak=5;
     System.out.println("metot içindeki hak==>"+hak);
     int [] tahminler=new int[hak];
     System.out.println(tahminEdilcekSayi);
     for (int i = 0; i < tahminler.length ; i++) {
         tahminler[i]= sayiAl();
         hak--;
          if (sayiKontrol(tahminler[i],tahminEdilcekSayi,i)){
              break;
          };

         if (hak==0){
             System.out.println("üzgünüz tahmin hakkınız bitti tahmin edilmesi gereken sayi===>"+tahminEdilcekSayi);
         }
     }
     tahminEdilenSayilar(tahminler);
     return  tahminler;
 }

 public  void  tahminEdilenSayilar(int []  dizi){
     System.out.println("Tahmin ettiğiniz sayılar");
        for (int sayi:dizi){
            if (sayi!=0){
                System.out.println(sayi);
            }

        }
 }



}
