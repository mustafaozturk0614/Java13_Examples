package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
    dışarıdan bir kelime girelim bu kelim içerisinde
    a harfi kac defa geçiyor bize sonucunu versin
 */
public class Question23 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scanner.nextLine();
        int sayac=0;

        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)=='a'){
                sayac++;
            }
       //     System.out.println(kelime.indexOf("a",i));
        }
        System.out.println(sayac);
    }
}
