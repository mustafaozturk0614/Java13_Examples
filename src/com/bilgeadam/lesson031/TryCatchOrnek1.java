package com.bilgeadam.lesson031;

import java.util.List;

public class TryCatchOrnek1 {


    public static void main(String[] args) {

        List<String> list=null;


        try {
            list.add("Mustafa");
            System.out.println("Mustafa listeye eklendi");
        }catch (NullPointerException exception){
            System.out.println("hata olustu:"+ exception.getMessage());
            System.out.println("hata olustu:"+ exception.toString());
            System.out.println("Listeye veri eklenmedi");
        }



        System.out.println("Program devam ediyor");
        try {
        list.add("Ozge");
            System.out.println("Ozge listeye eklendi");
        }catch (Exception exception){
            exception.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Program devam ediyor");
        System.out.println("Program devam ediyor");
        System.out.println("Program devam ediyor");
        System.out.println("Program devam ediyor");
        System.out.println("Program devam ediyor");
        System.out.println("Program devam ediyor");
        System.out.println("Program devam ediyor");
    }

}
