package com.bilgeadam.lesson035.taksi;

public class Uygulama {

    public static void main(String[] args) {
        Durak durak=new Durak();
       // durak.taksiler.forEach(System.out::println);

        for (int i = 0; i <durak.taksiler.size() ; i++) {
            Thread thread=new Thread(durak.taksiler.get(i));
            thread.start();
        }
    }
}
