package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    1 den giridğimiz sayıya kadar olan çift sayıların sayıların toplamını yazdıran prgram
 */
public class Question6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i;
        int toplam=0;
        System.out.println("bir sayı giriniz");
        int sayi=scanner.nextInt();
        for (i=2;i<=sayi;i+=2){
            toplam+=i;
            System.out.println("i===>"+i);
        }
        System.out.println(toplam);
        toplam=0;
        for (i=1;i<=sayi;i++){
            int ciftSayi=i%2==0?i:0;
            toplam+=ciftSayi;
        }
        System.out.println(toplam);
    }

}
