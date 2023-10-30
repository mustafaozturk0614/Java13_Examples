package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
    dışarıdan bir kelime girelim bu kelim içerisinde
   dışarından bizim girdiğimiz harf kac defa geçiyor bize sonucunu versin
 */
public class Question24 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scanner.nextLine();
        int sayac=0;
        System.out.println("HAngi harfi aratmak istiyorsunuz");
        String harf=scanner.nextLine();

        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)==harf.charAt(0)){
                sayac++;
            }
       //     System.out.println(kelime.indexOf("a",i));
        }
        System.out.println(sayac);

        // 2.çözüm
            sayac=0;
        for (int i = 0; i <kelime.length() ; i++) {
            // chardan Stringe çevirim
           // int sayi1=5;
            String value=Character.toString(kelime.charAt(i));
            String value2=String.valueOf(kelime.charAt(i));
           // String value3=String.valueOf(sayi1);
            if (value.equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
