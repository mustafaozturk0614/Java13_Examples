package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
    dısarıdan girilen asyının mukemmel sayı olup olmadıgını bulalım
    mukemmel sayı  kendisi haric bölenlerinin toplamı kendise eşit olan sayı
    6=1+2+3;

 */
public class Question20 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int i=1;
        int sum=0;
        System.out.println("Lütfen bir sayi giriniz");
        int num= scanner.nextInt();

        while (i<num){
            if (num%i==0){
                sum+=i;
            }
            i++;
        }
        if (sum==num){
            System.out.println("Mukemmel Sayıdır");
        }else {
            System.out.println("Mukemmel Sayı değildir");
        }
    }
}
