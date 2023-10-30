package com.bilgeadam.lesson004;

import java.util.Scanner;

/*

Dışarıdan girilne bir sayının asal sayı olup olmadıgını bulalım asal ise
asaldır çıktısı verelim asal değil ise asal değildir çıktısını verelim
 */
public class Question17 {
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayi giriniz");
        Scanner scanner=new Scanner(System.in);
        int sayi= scanner.nextInt();
        boolean asalmi=true;

        if (sayi<2){
            asalmi=false;
        }else {
            for (int i=2;i<=sayi/2;i++){
                if (sayi%i==0){
                    asalmi=false;
                    break;
                }
            }
        }
        if (asalmi){
            System.out.println("Asal Sayıdır");
        }else {
            System.out.println("Asal Sayı Değildir");
        }
    }
}
