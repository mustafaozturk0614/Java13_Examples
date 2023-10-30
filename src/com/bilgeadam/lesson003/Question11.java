package com.bilgeadam.lesson003;

import java.util.Scanner;

/**
 *
 * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
 *
 * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için kod
 * alacağız
 *
 * eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim
 *
 * eğer mail kodu hatalı ise mail kodu hatalı çıktısını verelim
 *
 * 2- mail dogru ise mail kodu dogru
 *   tel dogru ise tel kdou dogru cıktısı verelim
 */
public class Question11 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=10;
        int t=12;
        System.out.println("Telefon kodu giriniz");
        int telKod=scanner.nextInt();
        System.out.println("Mail kodu giriniz");
        int mailKod=scanner.nextInt();

        if (mailKod!=m){
            System.out.println("Mail kodu hatalı");
        }else {
            System.out.println("Mail kodu dogru");
        }

        if (telKod!=12) {
            System.out.println("Tel kodu hatalı");
        }else {
            System.out.println("Tel kodu dogru");
        }

    }

}
