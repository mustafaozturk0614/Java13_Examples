package com.bilgeadam.lesson023;

import java.util.Scanner;
import java.util.Stack;

/*
    dışarıdan bir kelime alıp bu kelimeyi bri stack e ekleyelim
    daha sonra bu stack uzerinde calısıp kelimenin palindrom olup olmadıgını kontrol edelim
 */
public class PalindromStack {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelim giriniz:");
        String kelime=scanner.nextLine();

        Stack<Character> stack=new Stack<>();

        char[] array=kelime.toCharArray();
      // string kelimeden bir stack olusturduk
        for (int i = 0; i <array.length ; i++) {
            stack.push(array[i]);
        }
       // palindromMu1(kelime, stack);
        palindromMu2(kelime, stack);

    }

    private static void palindromMu2(String kelime, Stack<Character> stack) {
        boolean kontrol=true;
        for (int i = 0; i <kelime.length()/2 ; i++) {
            if (stack.pop()!=kelime.charAt(i)){
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

    private static void palindromMu1(String kelime, Stack<Character> stack) {
        String tersKelime="";
        while (!stack.isEmpty() ){
            tersKelime+= stack.pop();
        }
        if (kelime.equals(tersKelime)){
            System.out.println("Palindromdur");
        }else {
            System.out.println("Palindrom değildir");
        }
    }


}
