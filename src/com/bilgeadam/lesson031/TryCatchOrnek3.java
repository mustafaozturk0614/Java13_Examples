package com.bilgeadam.lesson031;

import java.util.Scanner;

/*
    1- bir metot yazalım dısarıdan index degeri alsın
     o indexdeki degeri yazdıralım eger hata varsa hatayı yakalayıp mesjını yazdıralım

     2- bi metot yazacagız array uzerinde gezerken toplayabildiğmiz sayıları toplayıp toplam degişkenine ekleyelim ve
     bir toplam sonucu bulalım
     ayrıca bir sayac ile de hata sayını tutalım dongu sonunda toplamı ve hata sayısını yazdıralım
 */
public class TryCatchOrnek3 {


    public static void main(String[] args) {
        String [] array={null,"30","a","20","abc",null,"50"};
//        indexdekiDegeriyazdir(array,1);
//        indexdekiDegeriyazdir(array,8);
//        indexdekiDegeriyazdir(array,0);
        toplamaYap2(array);



    }

    public static void indexdekiDegeriyazdir(String [] array,int index){
        boolean kontrol=false;
//        Scanner scanner=new Scanner(System.in);
//        int index2=scanner.nextInt();
        try {
            System.out.println(array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+"(Lütfen 0 ile "+(array.length-1)+" degerleri arasında bir index degeri giriniz)");
        }
        System.out.println("Program devam ediyor");
    }

    public static void toplamaYap(String [] array){
    int toplam=0;
    int sayac=0;
        for (int i = 0; i < array.length ; i++) {
            try {
                toplam+=Integer.parseInt(array[i]);
            }catch (NumberFormatException e){
                sayac++;
                System.out.println("sayı içermeyen degerler toplanamadı==>"+ e.toString());
            }
        }
        System.out.println("toplam= "+toplam);
        System.out.println("sayac= "+sayac);

    }

    public static String nullKontrol(String string){
        if (string==null){
            throw new NullPointerException();
        }
        return string;
    }
 /*
    1- içine string alan ve null değilse o stringi geri donen eger null isede null pointer exception hatası fırlatan bir metot
    2-String string diye tanımladıgımız degerleri null değilse ve sayı değilse sonuc degerine ekleyelim ve sonuc degerini de yazdıralım
  */

    public static void toplamaYap2(String [] array){
        int toplam=0;
        int sayac=0;
        String sonuc="";
        String string=null;
        //  String [] array={null,"30","a","20","abc",null,"50"};
        for (int i = 0; i < array.length ; i++) {
            try {
                string=nullKontrol(array[i]);
                toplam+=Integer.parseInt(string);
            }catch (NullPointerException exception){
                System.out.println("Null hatası");
            }
            catch (NumberFormatException e){
                sonuc+=string;
                sayac++;
                System.out.println("sayı içermeyen degerler toplanamadı==>"+ e.toString());
            }
        }
        System.out.println("toplam= "+toplam);
        System.out.println("sayac= "+sayac);
        System.out.println("string sonuc= "+sonuc);
    }
}
