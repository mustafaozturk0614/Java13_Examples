package com.bilgeadam.lesson003;

import java.util.Scanner;

/**
 *
 * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
 *
 * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
 * alacağız
 *
 * ikiside dogru ise sisteme kayıt oldunuz telefon dogru email yanlış ise =>
 * email kodu hatalıdır email dogru telefon yanlış ise => telefon kodu hatalıdır
 * ikiside yanlış ise => telefon ve email kodu hatalıdır
 */
 public class Question12 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=10;
        int t=12;
        System.out.println("Telefon kodu giriniz");
        int telKod=scanner.nextInt();
        System.out.println("Mail kodu giriniz");
        int mailKod=scanner.nextInt();
 // yanlış çözüm
        if (mailKod!=m&&telKod!=12){
            System.out.println("Mail kodu hatalı ve Tel kodu hatalı");
            System.out.println("1.kontrol");
        }else{
            System.out.println("1.kontrol");
        }
        if (telKod==12&&mailKod==m) {
            System.out.println("Mail kodu dogu ve Tel kodu dogru");
            System.out.println("2.kontrol");
        }else {
            System.out.println("2.kontrol");
        }
        if (telKod!=12&&mailKod==m) {
            System.out.println("Mail kodu dogu ve Tel kodu hatalı");
            System.out.println("3.kontrol");
        }else{
            System.out.println("3.kontrol");
        }
        if (telKod==12&&mailKod!=m) {
            System.out.println("Mail kodu hatalı ve Tel kodu dogru");
            System.out.println("4.kontrol");
        }else{
            System.out.println("4.kontrol");
        }

        //// dogru cozum
        System.out.println("=====Dogru cozum======");
            if (telKod==t&&mailKod==m){
                System.out.println("Mail kodu dogu ve Tel kodu dogru");
                System.out.println("1.kontrol");
            } else if (mailKod!=m&&telKod==t) {
                System.out.println("Mail kodu hatalı ve Tel kodu dogru");
                System.out.println("2.kontrol");
            } else if (mailKod==m&&telKod!=t) {
                System.out.println("Mail kodu dogu ve Tel kodu hatalı");
                System.out.println("3.kontrol");
            }else{
                System.out.println("Mail kodu hatalı ve Tel kodu hatalı");
                System.out.println("4.kontrol");
            }

    }

}
