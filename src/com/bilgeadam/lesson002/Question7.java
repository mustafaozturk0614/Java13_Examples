package com.bilgeadam.lesson002;

import java.util.Scanner;

/*

dışarıdan girilen bir sayının faktoriyelini hesaplayalım

 */
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=scanner.nextInt();
        long faktoriyel=1;
        for (int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }
        System.out.println(faktoriyel);
        int k=1;
        faktoriyel=1;
        while (k<=sayi){
            faktoriyel*=k;
            k++;
        }
        System.out.println(faktoriyel);
        faktoriyel=1;
        while (sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println(faktoriyel);
    }
}
