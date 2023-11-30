package com.bilgeadam.lesson027.sansliNumaralar;

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

    }
}
