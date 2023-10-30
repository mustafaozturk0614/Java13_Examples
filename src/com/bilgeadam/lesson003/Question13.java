package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
    klavyeden 0 grililinceye kadar sayı okumaya devem edeceğiz
    0 girilidiğinde  sayıların toplamını ve ortalamasını ekrana yazdıracagız
 */
public class Question13 {
    public static void main(String[] args) {
        int toplam=0;
        double ort=0;

        Scanner scanner=new Scanner(System.in);

        int i=0;
        int sayi;
        // do-while çözümü
        System.out.println("Do-While");
        do {
            System.out.println("Lütfen bir sayı giriniz");
            sayi=scanner.nextInt();
            i++;
            toplam+=sayi;
        }while (sayi!=0);
        if (i==1){
            System.out.println("işlem yapmak için 0 dan başka sayı giriniz");
        }else{
            ort=toplam/(i-1);
            System.out.println("toplam="+toplam);
            System.out.println("ortalama="+ort);
        }

    // while çözümü
        ort=0;
        i=0;
        toplam=0;
        System.out.println("While");

        System.out.println("Lütfen bir sayı giriniz");
        sayi=scanner.nextInt();
            while (sayi!=0){
                toplam+=sayi;
                i++;
              System.out.println("Lütfen bir sayi giriniz");
                sayi=scanner.nextInt();
            }
        if (i==0){
            System.out.println("işlem yapmak için 0 dan başka sayı giriniz");
        }else{
            ort=toplam/i;
            System.out.println("toplam="+toplam);
            System.out.println("ortalama="+ort);
        }
        // whlie cozum 2
        ort=0;
        i=0;
        toplam=0;
        System.out.println("While-2");

        boolean kontrol=true;
        while (kontrol){
            System.out.println("Lütfen bir sayi giriniz");
            sayi=scanner.nextInt();
            if (sayi==0){
                kontrol=false;
                i--;
            }
            toplam+=sayi;
            i++;
        }
        if (i==0){
            System.out.println("işlem yapmak için 0 dan başka sayı giriniz");
        }else{
            ort=toplam/i;
            System.out.println("toplam="+toplam);
            System.out.println("ortalama="+ort);
        }

        // whlie cozum 3
        ort=0;
        i=0;
        toplam=0;
        System.out.println("While-3");

        while (true){
            System.out.println("Lütfen bir sayi giriniz");
            sayi=scanner.nextInt();
            if (sayi==0){
               // donguyu kırmam lazım
                break;
            }
            toplam+=sayi;
            i++;
        }
        if (i==0){
            System.out.println("işlem yapmak için 0 dan başka sayı giriniz");
        }else{
            ort=toplam/i;
            System.out.println("toplam="+toplam);
            System.out.println("ortalama="+ort);
        }
    }
}
