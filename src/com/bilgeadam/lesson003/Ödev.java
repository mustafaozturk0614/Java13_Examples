package com.bilgeadam.lesson003;
//Dışarıdan dogum gununuzun ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre

//burc hesabı yapan program

//Koç Burcu : 21 Mart - 20 Nisan
//
//Boğa Burcu : 21 Nisan - 21 Mayıs
//
//İkizler Burcu : 22 Mayıs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//
//Başak Burcu : 23 Ağustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak

import java.util.Scanner;

//Kova Burcu : 22 Ocak - 19 Şubat
//
//Balık Burcu : 20 Şubat - 20 Mart
public class Ödev {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int gun,ay;
        System.out.println("Lütfen dogdunuz gunu giriniz");
        gun= scanner.nextInt();
        System.out.println("Lütfen dogdunuz  ayı giriniz");
        ay= scanner.nextInt();

          switch (ay){
              case 1:
                  if (gun>31 ||gun<1){
                      System.out.println("Ocak Ayının son gunu 31 Ocaktır ilk gunu 1 ocaktır luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=21) {
                      System.out.println("Burcunuz Oğlak");
                  }else {
                      System.out.println("Burcunuz Kova");
                  }
                  break;
              case 2:
                  if (gun>29 ||gun<1){
                      System.out.println("Şubat Ayının son gunu 29 Şubattır ilk gunu 1 şubattır luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=19) {
                      System.out.println("Burcunuz Kova");
                  }else {
                      System.out.println("Burcunuz Balık");
                  }
                  break;
              case 3:
                  if (gun>31 ||gun<1){
                      System.out.println("Mart Ayının son gunu 31 Mart ilk gunu 1 Mart luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=20) {
                      System.out.println("Burcunuz Balık");
                  }else {
                      System.out.println("Burcunuz Koç");
                  }
                  break;
              case 4:
                  if (gun>30 ||gun<1){
                      System.out.println("Nisan Ayının son gunu 30 Nisan ilk gunu 1 Nisan luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=20) {
                      System.out.println("Burcunuz Koç");
                  }else {
                      System.out.println("Burcunuz Boğa");
                  }
                  break;
              case 5:
                  if (gun>31 ||gun<1){
                      System.out.println("Mayıs Ayının son gunu 31 Mayıs ilk gunu 1 Mayıs luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=21) {
                      System.out.println("Burcunuz Boğa");
                  }else {
                      System.out.println("Burcunuz İkizler");
                  }
                  break;
              case 6:
                  if (gun>30 ||gun<1){
                      System.out.println("Haziran Ayının son gunu 30 Haziran ilk gunu 1 Haziran luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=22) {
                      System.out.println("Burcunuz İkizler");
                  }else {
                      System.out.println("Burcunuz Yengeç");
                  }
                  break;

              case 7:
                  if (gun>31 ||gun<1){
                      System.out.println("Temmuz Ayının son gunu 31 Temmuz ilk gunu 1 Temmuz luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=22) {
                      System.out.println("Burcunuz Yengec");
                  }else {
                      System.out.println("Burcunuz Aslan");
                  }
                  break;

              case 8:
                  if (gun>31 ||gun<1){
                      System.out.println("Ağustos Ayının son gunu 31 Ağustos ilk gunu 1 Ağustos luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=22) {
                      System.out.println("Burcunuz Aslan");
                  }else {
                      System.out.println("Burcunuz Başak");
                  }
                  break;
              case 9:
                  if (gun>30 ||gun<1){
                      System.out.println("Eylul Ayının son gunu 30 Eylul ilk gunu 1 Eylul luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=22) {
                      System.out.println("Burcunuz Başak");
                  }else {
                      System.out.println("Burcunuz Terazi");
                  }
                  break;

              case 10:
                  if (gun>31 ||gun<1){
                      System.out.println("Ekim Ayının son gunu 31 Ekim ilk gunu 1 Ekim luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=22) {
                      System.out.println("Burcunuz Terazi");
                  }else {
                      System.out.println("Burcunuz Akrep");
                  }
                  break;
              case 11:
                  if (gun>30 ||gun<1){
                      System.out.println("Kasım Ayının son gunu 30 Kasım ilk gunu 1 Kasım luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=21) {
                      System.out.println("Burcunuz Akrep");
                  }else {
                      System.out.println("Burcunuz Yay");
                  }
                  break;
              case 12:
                  if (gun>31 ||gun<1){
                      System.out.println("Aralık Ayının son gunu 31 Aralık ilk gunu 1 Aralık luten bu tarihler arasında bir gun giriniz");
                  } else if (gun<=21) {
                      System.out.println("Burcunuz Yay");
                  }else {
                      System.out.println("Burcunuz Oğlak");
                  }
                  break;

              default:
                  System.out.println("Bir yılda 12 ay vardır lütfen 1 ile 12 arasında bir sayı giriniz");
                  break;

          }

    }


}
