package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
    iki tane sayı değişkenimiz olsun
    daha sonra dışarıdan bir işlem sececeğiz (toplama bölme cıkarma ve carpma (+,-,/,*)
    dısarıdan sectiğimiz işleme gore bize o işlemi yapıp sonucu yazdıran algoritma
 */
public class Question18 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
    // scanner.next() scanner.nextLine() arasındaki fark  nextLine() tum satırı alıyor
        // next() metodu ise sadece bosluga kadar olan tek bir kelimeyi alıyor
//        String deger1=scanner.nextLine();
//        String deger2=scanner.next();
//        System.out.println(deger1);
//        System.out.println(deger2);

        System.out.println("Lütfen birinci sayıyı giriniz");
        double sayi1=scanner.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        double sayi2=scanner.nextDouble();
        System.out.println("Hangi işlemi yapmak istersiniz?");
        scanner.nextLine();
        String secim=scanner.nextLine();
        switch (secim){
            case "+":
                System.out.println("sonuc= "+(sayi1+sayi2));
                break;
            case "-":
                System.out.println("sonuc= "+(sayi1-sayi2));
                break;
            case "*":
                System.out.println("sonuc= "+(sayi1*sayi2));
                break;
            case "/":
                System.out.println("sonuc= "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Gecerli bir işlem seciniz");
                break;
        }


    }
}
