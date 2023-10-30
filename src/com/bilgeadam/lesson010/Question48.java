package com.bilgeadam.lesson010;

import java.util.Scanner;

/*
        1- dısarıdan girilen harfle baslayan illeri yazdıralım;
        2- illeri plaka kodları ile yazdıralım 01-Adana  02-Adıyaman .....
        3- girdiğimiz sehrin ismine gore plaka kodu donen metot yazalım
        4-ilk harf haric sesli harflari slip yazdıran bir fonksiyon yazalım ( bir arraye atayalım) ==>Adn ,Adymn
        5-bir onceki metotdan donen degerlerin ilk uc harfini alsın ve sonuna ...(üç tane nokta eklesin)
         Adn... Ady...
        6-bir onceki metotdan donen dizide B ile baslayan illerin basına sıra no 1-Blk 2-Bl
        7-ikinci harfi a olanların ilk sadce ilk 3 harfini buyuk yazdırın (Çankırı==>ÇAN,manisa===>MAN)
          ÇAN
          MAN



 */
public class Question48 {


    public static void main(String[] args) {
        String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
                "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
                "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
                "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
                "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
                "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
                "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
                "Kilis", "Osmaniye", "Düzce" };
       // ilBul(iller);
        plakaSehirYazdır(iller);

    }

    public static void  plakaSehirYazdır(String [] dizi){
//        for (int i = 0; i < dizi.length ; i++) {
//            //01-Adana
//            if (i<9){
//                System.out.println("0"+(i+1)+"-"+dizi[i]);
//            }else{
//                System.out.println(i+1+"-"+dizi[i]);
//            }
//        }
        int sayi=1;
        for (String il:dizi){
            if (sayi<10){
               System.out.println("0"+sayi+"-"+il);
           }else{
                System.out.println(sayi+"-"+il);
           }
            sayi++;
        }
    }

    public static void ilBul(String [] myString){
      //  String []  sonuc= new String[myString.length];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String harf= scanner.nextLine();
      //  int sayac=0;
        System.out.println(harf.toUpperCase().substring(0,1)+" ile başlayan iller");
        for(String il: myString){
            if (il.startsWith(harf.toUpperCase().substring(0,1))){
                System.out.println(il);
               // sonuc[sayac]=il;
              //   sayac++;
            }
        }
       // return  sonuc;
    }
}
