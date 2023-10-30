package com.bilgeadam.lesson007;

import java.util.Scanner;

/*
    öncelikle dısarıdan bir dizi uzunlugu alalım
    ve bir dizi tanımlayıp
    o diziyi sırayla gezerek dolduralım
    ve daha sonrada  butun elamanlarını yazdıralım
 */
public class Question33 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen dizinin boyutunu giriniz");
        int boyut= scanner.nextInt();

        int [] dizi=new int[boyut];
        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("Lütfen "+(i+1)+". sayıyı giriniz");
            int sayi= scanner.nextInt();
            dizi[i]=sayi;
        }

        for (int i = 0; i < dizi.length ; i++) {
            System.out.println(dizi[i]);
        }

    }
}
