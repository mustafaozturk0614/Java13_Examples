package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
    dışarıdan girlen 0 ile 100 arasındaki(100 dahil)
    5 adet sayıdan en buyuk ve ne kucuk olanı bulup ekrana yazdıralım
 */
public class Question21 {


    public static void main(String[] args) {

        int max=-1;
        int min=101;
        int min1=Integer.MIN_VALUE;
        int max1=Integer.MAX_VALUE;

        System.out.println("5 adet sayı giriniz");
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<5;i++){
            int sayi=scanner.nextInt();
            if (sayi>100||sayi<0){
                System.out.println("0 ile 100 arasında bir sayı giriniz");
                i--;
            }else{
                if (sayi>max){
                    max=sayi;
                }
                if (sayi<min){
                    min=sayi;
                }
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
