package com.bilgeadam.lesson004;

import java.util.Scanner;

/*

Dışarıdan girilne bir sayının asal sayı olup olmadıgını bulalım asal ise
asaldır çıktısı verelim asal değil ise asal değildir çıktısını verelim
 */
public class Question16 {
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayi giriniz");
        Scanner scanner=new Scanner(System.in);
        int sayi= scanner.nextInt();
        int sayac=0;

            for (int i=2;i<=sayi/2;i++){
                if (sayi%i==0){
                    sayac++;
                    break;
                }
            }

        if (sayac==0&&sayi>=2){
            System.out.println("Sayı Asaldır");
        }else {
            System.out.println("Sayı Asal Değildir");
        }
    }
}
