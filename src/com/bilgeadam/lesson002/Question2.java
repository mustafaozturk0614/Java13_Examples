package com.bilgeadam.lesson002;


import java.util.Scanner;

/*
    Dışarıdan iki sayı alıp toplayalım ve daha sonra bu sayi çift ise ekrana true degerini yazdıralım
    (if else yapısı kullanmadan)
 */
public class Question2 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi1=scanner.nextInt();
        System.out.println("Bir sayi giriniz");
        int sayi2=scanner.nextInt();
        int toplam=sayi2+sayi1;
        boolean kontrol=toplam%2==0;
        System.out.println("sayı çift mi = "+kontrol);

    }
}
