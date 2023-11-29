package com.bilgeadam.lesson026;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    dışarıdan bir kelime alacağız

    her bir harfin frekansını(kelime içinde kaç kere geçtiğini) bulacagız ve bir map yapısı içinde tutacagız
     merhaba
    m=1
    e=1
    r=1
    h=1
    a=2
    b=1

 */
public class MapOrnek2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scanner.nextLine();
        Map<Character,Integer> frekanslar=new HashMap<>();

//        for (char harf:kelime.toCharArray()) {
//            frekanslar.put(harf, frekanslar.getOrDefault(harf,0)+1);
//
//        }

        for (char harf:kelime.toCharArray()) {
            if (frekanslar.containsKey(harf)){
                int value=frekanslar.get(harf);
                frekanslar.replace(harf, value+1);
               // frekanslar.put(harf, frekanslar.get(harf)+1);
            }else{
                frekanslar.put(harf,1);
            }
        }
        frekanslar.forEach((k,v)-> System.out.println(k+"="+v));

    }
}
