package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
Girilen bir sayının  5in kuvveti olu olmadıgını bulalım
 */
public class Question19 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scanner.nextInt();
        int k=0;
        while (true){
            if (sayi%5==0){
                sayi=sayi/5;
                k++;
            }else if(sayi==1){
                System.out.println("5 in kuvvetidir");
                break;
            }else{
                System.out.println("5 in kuvveti değildir");
                break;
            }
        }
        System.out.println(k);



    }
}
