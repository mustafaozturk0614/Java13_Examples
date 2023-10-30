package com.bilgeadam.lesson003;

import java.util.Scanner;
/*
    dışarıdan bir taban degeri birde us degeri alalım  ve bu işlemin sonucu bulan algoritmoayı yazalım
   ( 2 üzeri 3)=8
 */
public class Question9 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int taban,us,islem=1;
        System.out.println("Lütfen bir taban değeri giriniz");
        taban= scanner.nextInt();
        System.out.println("Lütfen bir us değeri giriniz");
        us= scanner.nextInt();
        for (int i=0;i<us;i++){
            islem*=taban;
        }
        System.out.println(taban+"^"+us+"="+islem);
    }
}
