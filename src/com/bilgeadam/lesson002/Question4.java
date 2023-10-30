package com.bilgeadam.lesson002;

public class Question4 {

    public static void main(String[] args) {

        System.out.println("Merhaba");
        System.out.println("Merhaba");
        System.out.println("Merhaba");
        System.out.println("Merhaba");
        System.out.println("Merhaba");
        System.out.println("Merhaba");
        System.out.println("Merhaba");

        // for
        for(int i=0; i<7 ; i++){
            System.out.print("Hello");
            System.out.print("World");
        }
        System.out.println();
        for (int i=0; i<7 ; i++)  System.out.print("Hello");
        System.out.print("World");
        //while
        int sayac=0;
        System.out.println();
        while (sayac<7){
            System.out.println("Mustafa -->" +sayac);
            sayac++;
        }
        // do while
        sayac=0;
        do {
            System.out.println("Öztürk-->" +sayac);
            sayac++;
        }while (sayac<7);
    }
}
