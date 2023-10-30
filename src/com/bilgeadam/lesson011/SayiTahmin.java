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
public class SayiTahmin {



    public  static  int rastgeleSayiUret(){
        Random random=new Random();
        return random.nextInt(1,750);

    }

    public static int sayiAl(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 ile 750 arasında bir sayı tahmin giriniz");
        int sayi= scanner.nextInt();
        while (sayi<0 || sayi>750){
            System.out.println("yanlış aralıkta bir sayı girdiniz lütfen 1 ile 750 arasında bir sayı giriniz ");
            sayi=scanner.nextInt();
        }
        return sayi;

    }
    public static boolean sayiKontrol(int sayi1,int randomSayi,int hak){
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

 public static int [] sayiTahminEt(){
     int randomsayi= rastgeleSayiUret();
     int sayac=5;
     int [] tahminler=new int[sayac];
     System.out.println(randomsayi);
     for (int i = 0; i < tahminler.length ; i++) {
         tahminler[i]= sayiAl();
          if (sayiKontrol(tahminler[i],randomsayi,i)){
              break;
          };
         sayac--;
         if (sayac==0){
             System.out.println("üzgünüz tahmin hakkınız bitti tahmin edilmesi gereken sayi===>"+randomsayi);
         }
     }
     return  tahminler;
 }

 public static void  tahminEdilenSayilar(int []  dizi){
     System.out.println("Tahmin ettiğiniz sayılar");
        for (int sayi:dizi){
            if (sayi!=0){
                System.out.println(sayi);
            }

        }
 }

    public static void main(String[] args) {
        int [] tahminler=sayiTahminEt();
        tahminEdilenSayilar(tahminler);
    }

}
