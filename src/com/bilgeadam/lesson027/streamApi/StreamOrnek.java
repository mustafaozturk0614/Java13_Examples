package com.bilgeadam.lesson027.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
        foreach
        map
        filter



 */
/*
        COLLECT
          Stream yapısındaki verileri herhangi bir collectionda toplamya yarıyor
          collect metodu toplama collect(Collectors.toList()) ==> bu metod listede toplamaya yarar
          collect metodu toplama collect(Collectors.toSet()) ==> bu metod set de toplamaya yarar

        FOREACH
        foreach metodu herhangi bir deger dondurmez(return degeri yoktur)
        foreach metodu stream akışını sonlandırı foreachden sonra herhangi bir stream metodunu kullanılamaz

        MAP
        map metodu bize bir deger dondurur. ve mutlaka return bekler
        map metodunda sonra başka stream metodlarnı kullanabiliriz
        map metodunu çalıstırdımgız listeden bagımsız farklı veri turlerinde listeler donebilir

        FİLTER
        filter filreleme işlemleri için kullanılır
        mutlaka bir koşul gerektirir
        bize bir stream yapısı done biz bunu collection da toplyabilirz
        filter içinde kullancagımız kosulların donus tipleri mutlaka true yada false olmalıdır
        filter sadece uzerinde calıstıgı collection turunde bir collectşon doner
        filter stream akısını sonlandırmaz devamınada stream metodları kullanilabilir
      */

public class StreamOrnek {

    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(10,20,30);

     //   stream.forEach(System.out::println);
      //  stream.forEach(c-> System.out.println(c));

        List<Integer> list=new ArrayList<>(List.of(25,32,45,84,67));

        /*
                listedeki tek ve çift elamları yazdrıalım eger gelen eleman çift ise 10 fazlasını yazdrıalım

         */

   list.stream().forEach(x->{
       if (x%2==0){
           System.out.println(x+10);
       }else {
           System.out.println(x);
       }
   } );
   /*
                listedeki elamanları baska bir listeye toplayalım
                fakat teklerin 5 eksiğini çiftlerinden 15 fazlasını
         */
     List<Integer> yeniListe=new ArrayList<>();

        list.stream().forEach(x->{
            if (x%2==0){
                  yeniListe.add(x+15);
            }else {
               yeniListe.add(x-5);
            }
        } );
        System.out.println("Yeniliste");
        System.out.println(yeniListe);

     List<Integer> yeniListe2=list.stream().map(x-> x%2==0?x+15:x-5).collect(Collectors.toList());

     List<Integer> yeniListe3=list.stream().map(x-> {
         if (x%2==0){
            return  x+15;
         }else {
           return x-5;
         }
     }).collect(Collectors.toList());

     /*
        foreach metodu herhangi bir deger dondurmez(return degeri yoktur)
        foreach metodu stream akışını sonlandırı foreachden sonra herhangi bir stream metodunu kullanılamaz
        map metodu bize bir deger dondurur. ve mutlaka return bekler
        map metodunda sonra başka stream metodlarnı kullanabiliriz
        collect metodu toplama collect(Collectors.toList()) ==> bu metod listede toplamaya yarar

      */

//     List<Integer> yeniListe4= list.stream().forEach(x->{
//            if (x%2==0){
//                return (x+15);
//            }else {
//                return (x-5);
//            }
//        } );
     /*
        collect metodu toplama collect(Collectors.toList()) ==> bu metod listede toplamaya yarar
 collect metodu toplama collect(Collectors.toSet()) ==> bu metod set de toplamaya yarar
     */
        Stream<Integer> y = list.stream().map(x -> x % 2 == 0 ? x + 15 : x - 5);
        Set<Integer> yListe= list.stream().map(x -> x % 2 == 0 ? x + 15 : x - 5).collect(Collectors.toSet());
        list.stream().map(x -> x % 2 == 0 ? x + 15 : x - 5).forEach(z-> System.out.println("-"+z));

//        System.out.println("list="+list);
//        System.out.println(yeniListe2);
//        System.out.println(yeniListe3);


        // filter
        List<String> stringList=new ArrayList<>(List.of("Java","React","Html","Css","JavaScript"));

            // J ile başlayanları yazdıralım
            stringList.stream().filter(s-> s.startsWith("J")).forEach(System.out::println);
       Stream <String>  stream1=stringList.stream().filter(s-> s.startsWith("J"));
       List <String> stringList1=stringList.stream().filter(s-> s.startsWith("J")).collect(Collectors.toList());
        System.out.println(stringList1);
        // string listemdeki her degerin uzunlugunu bir listede toplamak istiyorum
     List<Integer>uzunluklar  =stringList.stream().map(s-> s.length()).collect(Collectors.toList());
        System.out.println(uzunluklar);

        List<String> stringList2=stringList.stream().filter(s->{
            if (s.startsWith("J")){
               return true;
            }else{
               return false;
            }
        }  ).collect(Collectors.toList());
        System.out.println(stringList2);

        //

        stringList.stream().filter(s->s.startsWith("J")).map(x->x.length()).forEach(a-> System.out.println(a));
        List<Integer> uzunluk2=stringList.stream().filter(s->s.startsWith("J")).map(x->x.length()).collect(Collectors.toList());
        System.out.println(uzunluk2);
          stringList.stream().
                filter(s->s.startsWith("J")).
                map(x->x.length()).
                filter(b->b>5)
                .forEach(a-> System.out.println(a));

 List<Integer>  uzunluk3 =stringList.stream().
                filter(s->s.startsWith("J")).
                map(x->x.length()).
                filter(b->b>5)
                .collect(Collectors.toList());

        System.out.println("uzunluk3===>"+uzunluk3);
    }
}
