package com.bilgeadam.lesson009;

import java.util.Arrays;
import java.util.Scanner;

/*
    bir metoto yazacagız bu metot bize dışarıdan  2 tane sayı alacak ve bunları bir arraye atayacak daha sonra
    arrayin ilk 2 elamnın carpımını donecek


 */
public class Question42 {


    public  static  int []  diziyeEkle(int sayi1,int sayi2){
        int [] array={sayi1,sayi2};
       // int carpim=array[0]*array[1];
        return array;
    }
    public  static  int carpim(int [] array){
        int sonuc=0;
        if (array.length>=2){
          sonuc=array[0]*array[1];
        }else {
            System.out.println("Arrayimizin boyutu 2 den kucuk ");
        }
        return   sonuc;
    }
    public  static  int carpim2(int sayi1,int sayi2){
        int [] array=diziyeEkle(sayi1,sayi2);
        int sonuc=0;
        if (array.length>=2){
            sonuc=array[0]*array[1];
        }else {
            System.out.println("Arrayimizin boyutu 2 den kucuk ");
        }
        return   sonuc;
    }
    public  static  int sayiAl(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scanner.nextInt();
        return  sayi;
    }

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Lütfen bir sayı giriniz");
//        int sayi1= scanner.nextInt();
//        System.out.println("Lütfen bir sayı giriniz");
//        int sayi2= scanner.nextInt();
           int sayi1=sayiAl();
           int sayi2=sayiAl();
       //    int sayi3=sayiAl();
        int [] dizi=diziyeEkle(sayi1,sayi2);
        int sonuc=carpim(dizi);
        System.out.println(sonuc);
        System.out.println("//////////////// carpim2 metodu////////////////");
        System.out.println(carpim2(sayi1,sayi2));

     //  int [] array=new int[2];
//
//        for (int i = 0; i <array.length ; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                int [] array2=new int[2];
//                array2[j]=sayiAl();
//                System.out.println(Arrays.toString(array2));
//            }
//            array[i]=sayiAl();
//
//        }
//
//        System.out.println(Arrays.toString(array));

    }




}
