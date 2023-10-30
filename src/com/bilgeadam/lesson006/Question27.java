package com.bilgeadam.lesson006;

public class Question27 {


    public static void main(String[] args) {
        /*
            bu string degeri virgullerden ayırıp her kelimeyi alt alata yazdıralım
         */
        String kelime="Java,React,Css,Html";

        //1.çözüm
        for (int i = 0; i <kelime.length() ; i++) {
            int loc1=kelime.indexOf(",");
            if (loc1!=-1){
                System.out.println(kelime.substring(0,loc1));
                kelime=kelime.substring(loc1+1);
            }
        }
        System.out.println(kelime);
        kelime="Java,React,Css,Html";
        //2.cozum
        int index=0;
        for (int i = 0; i <kelime.length() ; i++) {
             if (kelime.charAt(i)==','){
                 System.out.println(kelime.substring(index,i));
                 index=i+1;
             }
        }
        System.out.println(kelime.substring(index));

        //3.çözüm
        System.out.println("3.çözüm");
        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)==','){
                System.out.println();
            }else{
                System.out.print(kelime.charAt(i));
            }
        }
        System.out.println();
        //4.çözüm
        System.out.println("4.çözüm");
        System.out.println(kelime.replace(",","\n"));
    }
}
