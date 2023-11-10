package com.bilgeadam.lesson020.enums;

import java.util.Random;
import java.util.Scanner;

public class TasKagıtMakasApp {

    public static void main(String[] args) {
        oyun();
    }

    public static void oyun(){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        ESecenek [] secenekler=ESecenek.values();
        for(ESecenek secenek:secenekler){
            System.out.println( (secenek.ordinal()+1)+"-"+secenek.name() );
        }
        System.out.println("Lütfen bir secim yapınız");
        int index=scanner.nextInt()-1;
        ESecenek secim=secenekler[index];
        ESecenek pcSecim=secenekler[random.nextInt(secenekler.length)];
        System.out.println("pcsecim==>"+pcSecim);

        if (pcSecim==secim){
            System.out.println("Beraberlik");
        } else if (secim.kazanır.equalsIgnoreCase(pcSecim.name())) {
            System.out.println("Kazandınız");
        }else {
            System.out.println("Kaybettiniz");
        }


    }
}
