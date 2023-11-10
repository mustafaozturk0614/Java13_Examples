package com.bilgeadam.lesson020.polimorfizm;

import java.util.Random;
import java.util.UUID;

public class Test2 {

    public static void main(String[] args) {
        Random random=new Random();
        int id= random.nextInt(1,200);
        String id2= UUID.randomUUID().toString();
        System.out.println(id2);
        System.out.println(id);


    }
}
