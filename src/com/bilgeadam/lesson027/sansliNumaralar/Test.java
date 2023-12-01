package com.bilgeadam.lesson027.sansliNumaralar;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        SansliNumaralar sansliNumaralar=new SansliNumaralar();
        sansliNumaralar.sayilariUret();
      //  sansliNumaralar.map.forEach((k,v)-> System.out.println(k+"==>"+v));
        sansliNumaralar.listeOlustur();
      //  sansliNumaralar.list.forEach(System.out::println);
      //  System.out.println(sansliNumaralar.list.size());
        sansliNumaralar.sansliNumaraliBul();
        sansliNumaralar.set.forEach(System.out::println);
        System.out.println("size==>"+sansliNumaralar.set.size());
       // a)42 den buyuk sayıları getiren bir akış
        System.out.println("42 den buyuk saıylar");
        sansliNumaralar.set.stream().filter(x->x>42).forEach(System.out::println);
       List<Integer> list =sansliNumaralar.set.stream().filter(x->x>42).collect(Collectors.toList());

     //   b)Butun sayıların toplamını getiren bir akış
        System.out.println("Butun sayıların toplamı");
        // 5,6,7,8,9
        Optional<Integer> toplam = sansliNumaralar.set.stream().reduce((x, y) -> x + y);
        toplam.ifPresent(System.out::println);
      Integer toplam2=sansliNumaralar.set.stream().mapToInt(x->x).sum();
        System.out.println(toplam2);
        Integer toplam3=sansliNumaralar.set.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(toplam3);
      //  c)Butun sayıların ortalamasını getiren bir akış
        System.out.println("Ortalama");
        sansliNumaralar.set.stream().mapToDouble(x->x).average().ifPresent(System.out::println);
      double ort =sansliNumaralar.set.stream().collect(Collectors.averagingDouble(Integer::doubleValue));
        System.out.println(ort);
      //  d)42 den buyuk sayıların toplamını getiren bir akış
        System.out.println("42 den buyuk sayıların toplamı");
        sansliNumaralar.set.stream().filter(x->x>42).reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(sansliNumaralar.set.stream().filter(x->x>42).mapToInt(Integer::intValue).sum()); ;
      //  e)42den buyuk sayıların ortalamasnı getiren bir akış
      double ort2   =sansliNumaralar.set.stream().filter(x->x>102).mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println(ort2);
        double ort3=sansliNumaralar.set.stream().filter(x->x>42).collect(Collectors.averagingDouble(Integer::doubleValue));
        System.out.println(ort3);

       // f)En buyuk değeri getiren bir akış
            sansliNumaralar.set.stream().max(Integer::compareTo).ifPresent(System.out::println);
        BinaryOperator<Integer> max=Math::max;
        Optional<Integer> sonuc = sansliNumaralar.set.stream().reduce(max);
        System.out.println(sonuc.get());
        sansliNumaralar.set.stream().reduce(Integer::max).ifPresent(System.out::println);
      //  g)En kucuk deger değeri getren bir akış
            sansliNumaralar.set.stream().min(Integer::compare).ifPresent(System.out::println);
            sansliNumaralar.set.stream().reduce(Integer::min).ifPresent(System.out::println);
       // h)50 den buyuk değerlerin sayısını getiren bir akış
        System.out.println ("50 den buyuk değerlerin sayısı==>"+ sansliNumaralar.set.stream().filter(x->x>50).count()); ;
      //  j)Bu 10 sayıyı stringe çevirip bir string listede toplayalım
            List<String> stringList=sansliNumaralar.set.stream().map(String::valueOf).collect(Collectors.toList());
            List<String> stringList2=sansliNumaralar.set.stream().map(x->x.toString()).collect(Collectors.toList());
            System.out.println(stringList);
            System.out.println(stringList2);
      //  g)Daha sonra bu string listesini tek bir string deger de aralına virgül koyarak toplayalım
        String string=sansliNumaralar.set.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(string);
        sansliNumaralar.set.stream().map(String::valueOf).reduce((x, y) -> x + "," + y).ifPresent(System.out::println);
        Collections.shuffle(sansliNumaralar.list);

      //  h)Boyutu 10 000 olan listeyi önce karıştıralım karıştıralım daha sonra 250 deger atlayıp
      //  20 tane deger alalım
            List<Integer> sayilar=sansliNumaralar.list.stream().skip(250).limit(20).collect(Collectors.toList());
            sayilar.forEach(System.out::println);
       // ı)daha sonra bu 20 deger içinde 50 sayısı bulunuyormu onu kontrol edip bize true false
       // donene akışı oluşturun
        boolean kontrol=sayilar.contains(50);
        System.out.println(kontrol);
        boolean kontrol2 = sansliNumaralar.list.stream().skip(250).limit(50).anyMatch(x -> x == 50);
        System.out.println(kontrol2);
        System.out.println(sansliNumaralar.list.stream().anyMatch(x -> x == 50));
        System.out.println(sansliNumaralar.list.stream().allMatch(x -> x == 50));
        System.out.println(sansliNumaralar.list.stream().allMatch(x -> x < 105));

//        List<Integer> yeniList=new ArrayList<>(List.of(50,6,7));
//        List<Integer> liste=yeniList;
//
//        System.out.println(yeniList.equals(50)); ;
//        System.out.println(yeniList.equals(liste)); ;

    }
}
