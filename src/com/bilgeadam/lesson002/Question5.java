package com.bilgeadam.lesson002;

import java.util.Scanner;

/*

    1 den giridğimiz sayıya kadar olan sayıların toplamını yazdıran prgram

 */
public class Question5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int toplam=0;
        System.out.println("bir sayı giriniz");
        int sayi=scanner.nextInt();
        for (int i=1;i<=sayi;i++){
            toplam+=i;
            System.out.println("i===>"+i);
        }
        System.out.println(toplam);

    }

}
