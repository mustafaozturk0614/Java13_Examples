package com.bilgeadam.lesson029.streamOgrenciOrnek;

import java.util.*;
import java.util.stream.Collectors;

/*
    burda bir listemiz olsun
    bu listeye default ogrenci verisi dolduracagız

 */
public class OgrenciManager {

    List<Ogrenci> ogrenciler;
    Random random=new Random();

    public  void baslangicVerisi(){
        Ogrenci ogrenci1=new Ogrenci(1,"Mustafa",EBolum.MF);
        ogrenci1.setNotlar(List.of(random.nextDouble(10,101),random.nextDouble(10,101),random.nextDouble(10,101)));
        Ogrenci ogrenci2=new Ogrenci(2,"Ayşe",EBolum.TM);
        ogrenci2.setNotlar(List.of(random.nextDouble(10,101),random.nextDouble(10,101),random.nextDouble(10,101)));
        Ogrenci ogrenci3=new Ogrenci(3,"Hakan",EBolum.TM);
        ogrenci3.setNotlar(List.of(random.nextDouble(10,101),random.nextDouble(10,101),random.nextDouble(10,101)));
        Ogrenci ogrenci4=new Ogrenci(4,"Mert",EBolum.MF);
        ogrenci4.setNotlar(List.of(random.nextDouble(10,101),random.nextDouble(10,101),random.nextDouble(10,101)));
        Ogrenci ogrenci5=new Ogrenci(5,"Özge",EBolum.SOZEL);
        ogrenci5.setNotlar(List.of(random.nextDouble(10,101),random.nextDouble(10,101),random.nextDouble(10,101)));
        Ogrenci ogrenci6=new Ogrenci(2,"Sinem",EBolum.SOZEL);
        ogrenci6.setNotlar(List.of(random.nextDouble(10,101),random.nextDouble(10,101),random.nextDouble(10,101)));
        Ogrenci ogrenci7=new Ogrenci(2,"Mehmet",EBolum.TM);
        ogrenci7.setNotlar(List.of(random.nextDouble(10,101),random.nextDouble(10,101),random.nextDouble(10,101)));
        ogrenciler=new ArrayList<>(List.of(ogrenci1,ogrenci2,ogrenci3,ogrenci4,ogrenci5,ogrenci6,ogrenci7));
    }

    /*
    1- Okuldaki ogenci not ortalamasını bulalım ( her ogrencinin not ortalaması değil!!! okuldaki tum ogrencilerin notlarının ortalamsı)

    // okuldaki her ogrencinin not ortalamısını hesaba katarak okul ortalamısını bulalım
     */

    public void  okulOrt(){
        /*
         1.ögrencinin not ort=50 { 50 ,50 ,50}
         2.not ort 100
         3. not ort 50;
         */
        List<Double> list=List.of(40D,50D,68D);
        list.stream().collect(Collectors.averagingDouble(x->x));
        Double ort1 = ogrenciler.stream().collect(Collectors.averagingDouble(x -> x.getNotlar().stream().collect(Collectors.averagingDouble(y -> y))));
        OptionalDouble ort2 = ogrenciler.stream().mapToDouble(x -> x.getNotlar().stream().mapToDouble(y -> y).average().getAsDouble()).average();
        System.out.println(ort1);
        System.out.println(ort2);

    }
    public void  okulOrt2(){
        /*
         1.ögrencinin not ort=50 { 50 ,50 ,50}
         2.not ort 100
         3. not ort 50;
         */
        Double ort1 =ogrenciler.stream().collect(Collectors.averagingDouble(Ogrenci::ortalamaHesapla));
        //Double ort3 =ogrenciler.stream().collect(Collectors.averagingDouble(x->x.ortalamaHesapla()));
        OptionalDouble ort2 = ogrenciler.stream().mapToDouble(Ogrenci::ortalamaHesapla).average();
        System.out.println(ort1);
        System.out.println(ort2);
    }
    /*
    2- ogrencileri bolume gore mapleyelim
     */

    public Map<EBolum,List<Ogrenci>> bolumeGoreMaple(){
     //   ogrenciler.stream().collect(Collectors.groupingBy(x->x.getBolum()));
        return ogrenciler.stream().collect(Collectors.groupingBy(Ogrenci::getBolum));
    }
    /*
     3- ogrencileri isimlerine karsılık notOrt mapleyelim
     */
    public Map<String,Double> ismeKarsılıkNotOrt(){
        //   ogrenciler.stream().collect(Collectors.groupingBy(x->x.getBolum()));
        ogrenciler.stream().collect
                (Collectors.toMap(k->k.getIsim(),v-> v.getNotlar().stream().mapToDouble(x->x).average().getAsDouble()));
        ogrenciler.stream().collect(Collectors.toMap(Ogrenci::getIsim,Ogrenci::ortalamaHesapla));
        return ogrenciler.stream().collect(Collectors.toMap(k->k.getIsim(),v-> v.ortalamaHesapla()));
    }


    public static void main(String[] args) {
        OgrenciManager ogrenciManager=new OgrenciManager();
        ogrenciManager.baslangicVerisi();
        ogrenciManager.okulOrt();
        ogrenciManager.okulOrt2();
        Map<EBolum,List<Ogrenci>> map=ogrenciManager.bolumeGoreMaple();
        map.forEach((x,y)->{
            System.out.println("Bölüm "+x);
           y.forEach(System.out::println);
        });
        Map<String,Double> map2 =ogrenciManager.ismeKarsılıkNotOrt();
        map2.entrySet().stream().forEach(x-> System.out.println(x));
        System.out.println(map2.get("Mert"));
        //map2 deki degerlerden notların ortalamasın bir listede toplayalım
        List<Double> notlar=map2.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
        List<String> isimler=map2.entrySet().stream().map(x->x.getKey()).collect(Collectors.toList());
        Set<Map.Entry<String,Double>> entrySet=map2.entrySet();
        // [
        //  Mustafa=66,
        //  Ayse=80
        //
        // ]

        System.out.println("/////////////////");
        notlar.forEach(System.out::println);
    }

}
