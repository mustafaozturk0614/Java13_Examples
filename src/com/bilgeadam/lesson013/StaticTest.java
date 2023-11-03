package com.bilgeadam.lesson013;

public class StaticTest {

    public static void main(String[] args) {
       // System.out.println(StaticOrnek.numara2);
        //System.out.println(StaticOrnek.numara1);
///////////////////////////////////////////////////////////
        StaticOrnek staticOrnek1=new StaticOrnek();
        StaticOrnek staticOrnek2=new StaticOrnek();
        staticOrnek1.numara1 =5;
        staticOrnek2.numara1 =10;

        System.out.println(staticOrnek1.numara1);
        System.out.println(staticOrnek1.numara2);
        System.out.println("====================");
        System.out.println(staticOrnek2.numara1);
        System.out.println(staticOrnek2.numara2);


/////////////////////////////////////////////////////
        System.out.println(StaticOrnek.numara2);
        System.out.println("///////////////////////");
        staticOrnek1.numaraVer();
        System.out.println(staticOrnek1.numara1);//6
        System.out.println(staticOrnek2.numara1);
        System.out.println("1.nesne===>"+staticOrnek1.numara2);//1
        System.out.println("2. nesne===>"+staticOrnek2.numara2);//1
        System.out.println(StaticOrnek.numara2);//1
  /////////////////////////////////////////////////////////
        StaticOrnek.numaraVer2();
        System.out.println(StaticOrnek.numara2);//2
        staticOrnek2.numaraVer();
        System.out.println(staticOrnek1.numara1);//6
        System.out.println(staticOrnek2.numara1);//11
        System.out.println("1.nesne===>"+staticOrnek1.numara2);//3
        System.out.println("2. nesne===>"+staticOrnek2.numara2);//3
        System.out.println(StaticOrnek.numara2);//3

    }
}
