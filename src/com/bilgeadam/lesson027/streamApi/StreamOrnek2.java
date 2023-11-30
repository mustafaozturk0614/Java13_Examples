package com.bilgeadam.lesson027.streamApi;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOrnek2 {
 /*
        distinct()
        reduce()
        limit()
        skip()
        max()
        min()
        count()
        sorted();
        toMap()
        groupingBy()
        doubleAveraging()
        mapToInt() ,mapToDouble()
  */

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(List.of(50,80,75,24,93));
        // bu degerlerin toplamını bulalım
        Optional<Integer> toplam1 = list.stream().reduce((x, y) -> x + y);
        toplam1.ifPresent(System.out::println);
        //bu degelerin carpımını bulalım
        list.stream().reduce((x,y)->x*y).ifPresent(System.out::println);
        // 5 sayısını uzerine listedeki elamanları toplayarak gidelim 
         Integer toplam2 = list.stream().reduce(5, (x, y) -> x + y);
         System.out.println(toplam2);
         int toplam3 =list.stream().mapToInt(x -> x+10).sum();

        OptionalDouble toplam4 = list.stream().mapToDouble(x -> x.doubleValue()).average();
        OptionalDouble toplam5 = list.stream().mapToDouble(x -> x).average();
        OptionalDouble toplam6= list.stream().mapToDouble(Integer::doubleValue).average();
        //list.forEach(System.out::println);

        System.out.println(toplam3);
        System.out.println(toplam4);
        System.out.println(toplam5);
        System.out.println(toplam6);
        List<String> list2=new ArrayList<>(List.of("50","80","75","24","33"));

        list2.stream().mapToDouble(x->Double.parseDouble(x)).average().ifPresent(System.out::println);
        list2.stream().mapToDouble(Double::parseDouble).average().ifPresent(System.out::println);
        Double ortalama = list2.stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
        System.out.println(ortalama);

        list.stream().max((x,y)->x-y).ifPresent(System.out::println);
        list.stream().min((x,y)->x-y).ifPresent(System.out::println);
        list.stream().min(Integer::compareTo).ifPresent(System.out::println);
        list.stream().max(Integer::compareTo).ifPresent(System.out::println);
        list.stream().reduce(Integer::min).ifPresent(System.out::println);
        list.stream().reduce(Integer::max).ifPresent(System.out::println);

       long deger =list.stream().filter(x->x>50).count();
        System.out.println(deger);


        List<String> stringList2=new ArrayList<>(List.of("Mustafa","Ozge","Serkan","Zeliha","Ayse"));
        // adan z ye sıralama
        stringList2.stream().sorted().forEach(System.out::println);
        //z den aya sıralama
        stringList2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("///////////////////////");
        // isim uzunluklarına gore sıralayalım kucukten buyuge
        stringList2.stream().sorted(Comparator.comparingInt(x->x.length())).forEach(System.out::println);
        System.out.println("///////////////////////");
        // isim uzunluklarına gore sıralayalım buyukten kucuge
        stringList2.stream().sorted((x,y)->y.length()-x.length()).forEach(System.out::println);

        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        stringList2.stream().sorted(comparator).forEach(System.out::println);
        System.out.println("//////////////");
        stringList2.stream().limit(3).forEach(System.out::println);
        System.out.println("//////////////");
        stringList2.stream().limit(2).forEach(System.out::println);
        System.out.println("//////////////");
        stringList2.stream().skip(2).forEach(System.out::println);
        System.out.println("//////////////");
        stringList2.stream().skip(1).limit(2).forEach(System.out::println);


       // uzunluklara gore isimleri  map 4 uzunluguna sahip {Ayse,Ozge}

        Map<Integer, List<String>> map = stringList2.stream().collect(Collectors.groupingBy(x->x.length()));
        System.out.println(map);

        // isimlere karsılık uzunluklar gelcek sekilde bir mapte toplayalım (burda isimlerin tekrar etmediğni dusunuyoruz)

        Map<String ,Integer> map2 = stringList2.stream().collect(Collectors.toMap(x->x,v->v.length()));
        System.out.println(map2);
         //distinct()
        stringList2.add("Mustafa");
        Map<String ,Integer> map3 = stringList2.stream().distinct().collect(Collectors.toMap(x->x,v->v.length()));
        System.out.println(map3);
    }
}
