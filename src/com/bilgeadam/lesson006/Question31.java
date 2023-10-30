package com.bilgeadam.lesson006;

import java.util.Scanner;

/*
    Dışarıdan girilen kelimen Palindrom olup olmadıgını kontrol edelim
    Palindrom  kek kabak iyi
    stack bellek heap bellek
    referans tur primite tur
    wrapper class nedir
    Unboxing Autoboxing  nedir

 */
public class Question31 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scanner.nextLine();

        String kelime1="";

        for (int i=kelime.length()-1;i>=0;i--){
            char harf=kelime.charAt(i);
            kelime1+=harf;
        }

        if (kelime.equals(kelime1)){
            System.out.println("Palindromdur");
        }else {
            System.out.println("Palindrom değildir");
        }

        //2.çözüm kabak merhaba
        boolean kontrol=true;
        for (int i=0;i<kelime.length()/2;i++){
            if (kelime.charAt(i)!=kelime.charAt(kelime.length()-1-i)){
                kontrol=false;
                break;
            }
        }
        if (kontrol){
            System.out.println("Palindromdur");
        }else {
            System.out.println("Palindrom değildir");
        }

    }
}
