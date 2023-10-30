package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    Dışarıdan bir isim ve bir dogum yılı alalım
    daha sonra  Mustafa 35 yasında Ehliyet alabilir veya Musatfa 17 yasında Ehliyet alamaz
    ehliyet alma kosulumuz 18 yasından buyuk olma olsun (if else kullanmadan yapalım)
 */
public class Question3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String isim= scanner.nextLine();
        System.out.println("Lütfen dogum yılınızı giriniz");
        int yil= scanner.nextInt();
        int yas=2023-yil;
        //Tenary kullanımı
        String durum=  yas>=18 ?"Ehliyet Alabilir":"Ehliyet Alamaz";
        System.out.println("Mustafa "+yas+ " yasında "+ durum );

    }
}
