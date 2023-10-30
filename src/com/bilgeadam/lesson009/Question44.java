package com.bilgeadam.lesson009;

import java.util.Scanner;

/*
    dışarıdan 2 sayı alacagız bunun en buyuk ortak bolenini bulacagız (ebob) bir metot yazıp bulalım
    daha sonra mainde en kcuk ortak katı bulalım
    ekok=(sayi1*sayi2)/ebob



 */
public class Question44 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayi1= scanner.nextInt();;
        System.out.println("2.sayıyı giriniz");
        int sayi2= scanner.nextInt();;

      int ebob= ebobBul(sayi1,sayi2); ;
        int ekok=(sayi1*sayi2)/ebob;
        System.out.println("ebob==>"+ebob);
        System.out.println("ekok==>"+ekok);

        System.out.println(ebobBul2()); ;

    }

    public static int ebobBul2() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayi1= scanner.nextInt();;
        System.out.println("2.sayıyı giriniz");
        int sayi2= scanner.nextInt();
        int ebob=1;
        int enKucuk=sayi1;
        if (sayi1==sayi2){
            ebob=sayi2;
            return  ebob;
        } else if (sayi1<sayi2) {
            enKucuk=sayi1;

        } else {
            enKucuk=sayi2;
        }
            while (enKucuk>0){
                if (sayi1%enKucuk==0&&sayi2%enKucuk==0){
                    ebob=enKucuk;
                    break;
                }
                enKucuk--;
            }
        return  ebob;
    }


    public static int ebobBul(int sayi1,int sayi2){
        int ebob=1;
        int enKucuk=sayi1;
        if (sayi1==sayi2){
            ebob=sayi2;
            return  ebob;
        } else if (sayi1<sayi2) {
            enKucuk=sayi1;

        } else {
            enKucuk=sayi2;
        }
        for (int i = 2; i <=enKucuk ; i++) {
            if (sayi1%i==0&&sayi2%i==0){
                ebob=i;
            }
        }
        return  ebob;
    }
}
