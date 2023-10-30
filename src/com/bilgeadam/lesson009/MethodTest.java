package com.bilgeadam.lesson009;

public class MethodTest {


    public static void main(String[] args) {

     metot1();
        System.out.println("///////////////////////");
    int result=metot2();
        System.out.println("Main sonuc"+(result+5));
        System.out.println(metot2());

        // void metotlar sout içinde yazdırılamazlar cunku geri donus verisi yoktur
      //   System.out.println(metot1());

        metot3("Mustafa",1987);

        String a="Özge";
        int b=1996;
        metot3(a,b);

        System.out.println(metot4("Mustafa",1987));
        String value=metot4("Mustafa",1987);
        System.out.println(value);
    }

    // Geri donusu olmayan parametresiz metot
    public  static void  metot1(){
        int sayi1=5;
        int sayi2=15;
        int sonuc=sayi1-sayi2;
        System.out.println("Metot1 çalıştı");
        System.out.println("sonuc: "+sonuc);


    }

    // Geri donusu olan parametresiz metot
    public  static int  metot2(){
        int sayi1=5;
        int sayi2=15;
        int sonuc=sayi1-sayi2;
        System.out.println("Metot2 çalıştı");
        System.out.println("sonuc: "+sonuc);
        return  sonuc;
    }

    // Geri donusu olmayan parametreli metot
    public  static void  metot3(String isim,int dogumYili){
        System.out.println("Metot3 calıstı");
        System.out.println(isim+" adlı kullanıcının yaşı ===>"+(2023-dogumYili ));
    }

    // Geri donusu olan parametreli metot

    public  static String  metot4(String isim,int dogumYili){
        System.out.println("Metot4 calıstı");
     return   isim+" adlı kullanıcının yaşı ===>"+(2023-dogumYili );
    }

//    public  static void metot5(MethodTest test){
//
//    }
}
