package com.bilgeadam.lesson020.enums;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println(EAylar.EYLUL);
        EAylar  ay1=EAylar.AGUSTOS;
        System.out.println(ay1);
        String ay1String1=ay1.toString();
        String ay1String2=ay1.name();
        System.out.println(ay1String1);
        System.out.println(ay1String2);
        System.out.println(EAylar.HAZIRAN.ordinal());
        System.out.println(EAylar.TEMMUZ.ordinal());
        System.out.println(EAylar.AGUSTOS.ordinal());
        System.out.println(EAylar.EYLUL.ordinal());

      EAylar [] aylar=EAylar.values();

      for(EAylar ay :aylar ){
          System.out.println(ay.ordinal()+"-"+ay.name()+"====>"+ay.getGunSayisi()+"-"+ay.getMevsim());
      }
        System.out.println(EAylar.HAZIRAN.getMevsim());
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir ay giriniz");
        String ay2=scanner.nextLine();
        EAylar ay3=EAylar.valueOf(ay2);
        System.out.println(ay3);



    }
}
