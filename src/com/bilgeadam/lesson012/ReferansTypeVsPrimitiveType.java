package com.bilgeadam.lesson012;

public class ReferansTypeVsPrimitiveType {


    public static void main(String[] args) {
        // primitive ==> int , long double, char,boolean byte ...
        // Referans==> Scanner sınıfı ,Arrayler , Wrapper==> String ,Integer, Double ...

        int a=5;
        int b=4;
        System.out.println(a);
        System.out.println(b);
        a=b;
        b=12;

        System.out.println(a);// 4
        System.out.println(b);//12

        String [] sehirler={"Ankara","İstanbul","İzmir"};
        String [] sehirler2={"Bursa","Konya","Mersin"};
        System.out.println(sehirler[0]);
        System.out.println(sehirler2[0]);
        System.out.println("===============");
        sehirler2=sehirler;
        System.out.println(sehirler2[0]); // Ankara,
        sehirler[0]="Bolu";
        System.out.println(sehirler2[0]);// Ankara,Bolu
        System.out.println(sehirler[0]);// Bolu
        sehirler2[1]="Edirne";
        System.out.println(sehirler[1]);//İstanbul,Edirne
        System.out.println(sehirler2[1]);//Edirne

    }

}
