package com.bilgeadam.lesson022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

    1 tane liste olustualım
    Ankara
    Bursa
    Antalya
    Artvin
    Erzurum
    Karaman
    An ile başlayan şehirleri silelim;
 */
public class ArrayListOrnek {

    public static void main(String[] args) {

        List<String> sehirler=new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Antalya");
        sehirler.add("Bursa");
        sehirler.add("Artvin");
        sehirler.add("Erzurum");
        sehirler.add("Karaman");
        List<String> sehirler3=new ArrayList<>( List.of("Ankara","Antalya","Bursa"));

//        String[] array={"Ankara","Antalya","Bursa"};
//        List<String> sehirler2= new ArrayList<>(Arrays.asList(array))  ;
//        System.out.println(sehirler2);



        System.out.println("Silinmeden önce şehirler");
        System.out.println(sehirler);
       AnIleBaslayanSehirleriSil(sehirler3);
        AnIleBaslayanSehirleriDegistir2(sehirler);
        // foreach asekron yapıda calıstıgı için silme ve ekleme işlemleri foreach uzerinde yapılamaz
//        for (String sehir:sehirler){
//            if (sehir.startsWith("An")){
//                sehirler.remove(sehir);
//            }
//        }

        System.out.println("Silindikten önce şehirler");
        System.out.println(sehirler);





    }

    // An ile baslayan sehirleri xxx ile değiştirleim
    public  static  void AnIleBaslayanSehirleriDegistir(List<String> sehirler){
        for (int i = 0; i < sehirler.size() ; i++) {
            if (sehirler.get(i).startsWith("An")){
                sehirler.set(i,"xxx");
            }
        }
    }
    public  static  void AnIleBaslayanSehirleriDegistir2(List<String> sehirler){
        for (int i = 0; i < sehirler.size() ; i++) {
            if (sehirler.get(i).startsWith("An")){
                sehirler.remove(i);
                sehirler.add(i,"xxx");
            }
        }
    }

    private static void AnIleBaslayanSehirleriSil(List<String> sehirler) {
        for (int i = 0; i < sehirler.size() ; i++) {
            String sehir= sehirler.get(i);
            if (sehir.startsWith("An")){
                 sehirler.remove(i);
                 i--;
            }
        }
    }
}
