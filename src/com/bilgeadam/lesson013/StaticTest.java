package com.bilgeadam.lesson013;

public class StaticTest {

    public static void main(String[] args) {
        System.out.println(StaticOrnek.numara2);
        //System.out.println(StaticOrnek.numara1);
        StaticOrnek staticOrnek1=new StaticOrnek();
        StaticOrnek staticOrnek2=new StaticOrnek();
        staticOrnek1.numara=5;
        staticOrnek2.numara=10;
        System.out.println(staticOrnek1.numara);
        System.out.println(staticOrnek1.numara2);
        System.out.println("====================");
        System.out.println(staticOrnek2.numara);
        System.out.println(staticOrnek2.numara2);


    }
}
