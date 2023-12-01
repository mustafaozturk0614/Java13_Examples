package com.bilgeadam.lesson028.sehirApp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {
        App app=new App();
        app.sehirleriOlustur();
        //app.list.forEach(System.out::println);
       // plakaKodlarınıListedeTopla(app.list).stream().sorted().forEach(System.out::println);
//       bolgeyeGoreGrupla(app.list).forEach((k,v)->{
//           System.out.println(k+"nin sehirleri");
//           for (Sehir sehir:v){
//               System.out.println(sehir.getIsim());
//           }
//           System.out.println("//////////////////////");
//       });

//        System.out.println(plakaKodunaKarsılıkSehirIsmı(app.list));  ;
//        System.out.println(plakaKodunaKarsılıkSehirIsmı(app.list).get("14"));  ;

//        ismeGoreSehirBul("Ankara",app.list).ifPresent(System.out::println);
//        ismeGoreSehirBul("Ankarax",app.list).ifPresentOrElse(x-> System.out.println(x),()-> System.out.println("Sehir Bulunamadı"));
        isimHaricSehirleriListele("Ankara",app.list).stream().sorted((x,y)->x.getPlakaNo().compareTo(y.getPlakaNo())).forEach(System.out::println);
    }

    //Sehirler listemdeki sehirlerin  plaka kodlarını integer bir setde tutatlım ve bu listeyi donelim

    public static Set<String> plakaKodlarınıListedeTopla(List<Sehir> sehirler){
          Set<String> plakaKodlari= sehirler.stream().map(y->y.getPlakaNo()).collect(Collectors.toSet());
       //   Set<String> plakaKodlari=sehirler.stream().forEach(y->y.getPlakaNo());
       //   List<Sehir> plakaKodlari2=sehirler.stream().filter(y->Integer.parseInt(y.getPlakaNo())>20).collect(Collectors.toList());
        return plakaKodlari;
    }

    // bolgelere gore sehirleri mapleyen ve bu mapi geri donen bir metot yazalım
    public static Map<EBolge,List<Sehir>> bolgeyeGoreGrupla(List<Sehir> sehirler){
        Map<EBolge,List<Sehir>> sehirBolge=sehirler.stream().collect(Collectors.groupingBy(Sehir::getBolge));
     //   Map<EBolge,List<Sehir> sehirBolge2=sehirler.stream().collect(Collectors.groupingBy(x->x.getBolge()));
        return  sehirBolge;
    }
    // plaka koduna karslık sehir isimlerini mapleyelim
    public static   Map<String, String>   plakaKodunaKarsılıkSehirIsmı(List<Sehir> sehiler){
        Map<String, List<Sehir>> map = sehiler.stream().collect(Collectors.groupingBy(x -> x.getPlakaNo()));
        Map<String, String> map2 = sehiler.stream().collect(Collectors.toMap(Sehir::getPlakaNo,Sehir::getIsim));
       // sehiler.get(0).setPlakaNo("06");
        Map<String, String> map3 = sehiler.stream().collect(Collectors.toMap(k->k.getPlakaNo(),v->v.getIsim()));
        return map2;
    }

    /// isme gore sehir bulan fonksiyon yazalım

    public  static  Optional<Sehir> ismeGoreSehirBul(String sehirIsmi,List<Sehir> sehirler){
      List<Sehir> sehirStream=sehirler.stream().filter(x->x.getIsim().equalsIgnoreCase(sehirIsmi)).collect(Collectors.toList());
      //sehirStream.get(0);
      Optional<Sehir> sehir=sehirler.stream().filter(x->x.getIsim().equalsIgnoreCase(sehirIsmi)).findFirst();
    return  sehir;
    }

    // ismi girdiğimiz sehir haricindeki sehirleri bir listede toplayalım
    public  static List<Sehir> isimHaricSehirleriListele(String sehirIsmi,List<Sehir> sehirler){
    return sehirler.stream().filter(x->!x.getIsim().equals(sehirIsmi)).collect(Collectors.toList());
    }

}
