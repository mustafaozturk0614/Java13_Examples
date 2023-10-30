package com.bilgeadam.lesson008;


/*
 *
 *   Türkçe karakterleri inglizce karakterler çevirme
    'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'
    dışarıdan bir kelime gireceğiz
	bu kelime içerisinde geçen türkçe karakterleri ing karakterlere dönüştüreceğiz ;
 *
 */

import java.util.Scanner;

public class Question40 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scanner.nextLine();
        char [] turkceKarakterler={ 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'};
        char [] ingilizceKarakterler={ 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};

        for (int i = 0; i <kelime.length() ; i++) {
            for (int j = 0; j <turkceKarakterler.length ; j++) {
                if (kelime.charAt(i)==turkceKarakterler[j]){
                   kelime=kelime.replace(kelime.charAt(i),ingilizceKarakterler[j]);
                   break;

                }
            }
        }
        System.out.println(kelime);
        System.out.println("tekrar bir kelime giriniz");
        kelime= scanner.nextLine();

        for (int i = 0; i <turkceKarakterler.length ; i++) {
            kelime=kelime.replace(turkceKarakterler[i],ingilizceKarakterler[i]);
        }
        System.out.println(kelime);
    }
}
