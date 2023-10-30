package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
    dışardıdan bir metin girelim daha sonra bu metinin tersini yazdıralım
    Java ====> avaJ
 */
public class Question26 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime=scanner.nextLine();
        int d=kelime.length();
        String tersKelime="";

        for (int i = d-1; i >=0 ; i--) {
            System.out.print(kelime.charAt(i));
        }
        System.out.println();

        for (int i = d-1; i >=0 ; i--) {
          tersKelime+=kelime.charAt(i);

        }
        System.out.println(tersKelime.toUpperCase());
    }
}
