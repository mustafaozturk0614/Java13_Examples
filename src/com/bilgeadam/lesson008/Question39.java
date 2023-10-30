package com.bilgeadam.lesson008;

import java.util.Scanner;

/*
 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün katı
 * ise bilge 5'in ise adam hem3 ve hem 5 in katı ise bilgeadam yazdıralım
 * int start=2; int
 * end=22;
 * çıktı [2,bilge,4,adam,bilge,7,8,bilge,adam,11....14,bilgeadam......bilge,22]
 *
 */
public class Question39 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Baslangıc degeri giriniz");
        int start= scanner.nextInt();
        System.out.println("Bitis degeri giriniz");
        int end= scanner.nextInt();

        int sayac=0;
        String [] array=new String[end-start+1];

        for (int i = start; i <=end ; i++) {
            if (i%3==0&&i%5==0){
                array[sayac]="bilgeadam";
            } else if (i%3==0) {
                array[sayac]="bilge";
            } else if (i%5==0) {
                array[sayac]="adam";
            }else{
                array[sayac]=String.valueOf(i);
//                array[sayac]=Integer.toString(i);
//                array[sayac]=i+"";
            }
            sayac++;
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+",");
        }

        array=new String[end-start+1];

        for (int i = 0; i < array.length ; i++) {
            int kontrol=i+start;
            if (kontrol%15==0){
                array[i]="bilgeaadam";
            } else if (kontrol%3==0) {
                array[i]="bilge";
            }else if (kontrol%5==0){
                array[i]="adam";
            }else {
                array[i]=Integer.toString(kontrol);
            }
        }
        System.out.println();
        System.out.println("=======2.çözüm======");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+",");
        }

    }

}
