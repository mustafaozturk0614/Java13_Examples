package com.bilgeadam.lesson010;

import java.util.Arrays;

/*
    metot veya metotlar yazarak bu araydeki tek sayıları baska bir tek boyutlu arrayde toplamanızı istiyorum

 */
public class Question47 {

    public static void main(String[] args) {
        int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
                { 189, 35, 56, 89, 8 } };

      int [] array  =tekSayimi2(matris);
        System.out.println("array uzunlugu==>"+array.length);
//        for (int i = 0; i <array.length ; i++) {
//
//                System.out.println(array[i]);
//
//        }

   //     tekSayimi3(matris);
        for(int sayi: array){
            System.out.println(sayi+10);
        }

      String [] array2 =tekSayimi3(matris).split(",");
        System.out.println("///////////////////////////////////");
        for (String deger: array2){
            System.out.println(deger);
        }

    }


    public  static int [] tekSayimi(int [][] dizi){
        int [] yeniDizi=new int[dizi.length* dizi[0].length];
        int sayac=0;
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi[i].length ; j++) {
                if (dizi[i][j]%2!=0){
                    yeniDizi [sayac] =dizi[i][j];
                    sayac++;
                }
            }
        }
        return  yeniDizi;
    }
    public  static int [] tekSayimi2(int [][] dizi){
        int uzunluk=tekSayiSayisiniBul(dizi);
        int [] yeniDizi=new int[uzunluk];
        int sayac=0;
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi[i].length ; j++) {
                if (dizi[i][j]%2!=0){
                    yeniDizi [sayac] =dizi[i][j];
                    sayac++;
                }
            }
        }
        return  yeniDizi;
    }
    public  static int  tekSayiSayisiniBul(int [][] dizi){
        int sayac=0;
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi[i].length ; j++) {
                if (dizi[i][j]%2!=0){
                    sayac++;
                }
            }
        }
        return  sayac;
    }

    public  static String tekSayimi3(int [][] dizi){

        int sayac=0;
        String deger="";
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi[i].length ; j++) {
                if (dizi[i][j]%2!=0){
                    deger+=dizi[i][j] +",";

                }
            }
        }
        System.out.println(deger);
        String [] array2=deger.split(",");
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i <array2.length ; i++) {
            System.out.println(array2[i]);
        }
        return  deger;
    }

}
