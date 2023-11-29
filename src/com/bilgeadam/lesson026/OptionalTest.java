package com.bilgeadam.lesson026;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Integer sayi1=5;
        Optional<Integer> sayi2=Optional.of(10);
        Optional<Integer> sayi3=Optional.of(sayi1);
        String deger=null;
        String deger4="Mustafa";
      // Optional<String> deger2=Optional.of(deger);-- Optional.of() ile bir optional nesne olusturmak istiyorsak null degerler alamaz
        Optional<String> deger3=Optional.ofNullable(deger);
        // Optional.ofNullable metoduna null deger gelmiş ise
        // bos bir optional olusturur dolu bir deger gelmiş ise o deger ile bir optinal olusturr
        Optional<String> deger5=Optional.ofNullable(deger4);
        Optional<String> deger6=Optional.of(deger4);
        System.out.println(sayi2);
        System.out.println(sayi3);
      // System.out.println(deger2);
        System.out.println(deger3);
        System.out.println(deger5);
        System.out.println(deger6);
/*
   Optional<Integer> sayi2=Optional.of(10);
        Optional<Integer> sayi3=Optional.of(sayi1);
 */
        int toplam=sayi2.get()+sayi3.get();
        System.out.println(toplam);
        System.out.println(deger6.get().toUpperCase());
        System.out.println(deger3);

        if (deger3.isEmpty()){
            System.out.println("Boş");
        }else{
            System.out.println(deger3.get());
        }
        sayi2=Optional.empty();
        if (sayi2.isPresent()){
            System.out.println(sayi2.get());
        }else{
            System.out.println("boş");
        }

         sayi3.ifPresent(x-> System.out.println(x+50));
         sayi2.ifPresent(x-> System.out.println(x+50));

        Integer x = sayi2.orElse(0); // var ise sayının kendisni donuyor yok ise 0  degerini atıyor
        Integer y = sayi3.orElse(0); // var ise sayının kendisni donuyor yok ise 0  degerini atıyor

        System.out.println(x);
        System.out.println(y);
        sayi2.ifPresentOrElse(s-> System.out.println(s+100),()-> System.out.println("sayı boş") );
        sayi3.ifPresentOrElse(s-> System.out.println(s+100),()-> System.out.println("sayı boş") );
        System.out.println(sayi3.filter(s->s>2));



    }
}
