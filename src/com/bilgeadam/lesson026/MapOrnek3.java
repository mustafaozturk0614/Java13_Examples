package com.bilgeadam.lesson026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    dışarıdan girilen bir kelimde ki turkce karakteri ingilizce karaktere cevireceğiz
    bunu yaparkende arraylerden bir map olusturup o mapi kullanalım

 */
public class MapOrnek3 {


    public static void main(String[] args) {

        char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
        char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };


        Map<Character,Character> map=new HashMap<>();
        /*

            İ=I
            ı=i
            ş=s

         */
        for (int i = 0; i < turkishWords.length ; i++) {
            map.put(turkishWords[i],englishWords[i]);
        }

      //  map.forEach((k,v)-> System.out.println(k+"-"+v));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scanner.nextLine();
      //  char [] yeniKelme=kelime.toCharArray();
        String sonuc=kelime;
        for (char harf:kelime.toCharArray()) {
            if (map.containsKey(harf)){
                sonuc=sonuc.replace(harf, map.get(harf));
            }
        }
        System.out.println("yeni kelime==> "+sonuc);

    }
}
