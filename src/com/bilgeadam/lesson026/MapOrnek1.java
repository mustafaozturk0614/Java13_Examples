package com.bilgeadam.lesson026;

import java.util.*;

/*
    1- isme karşılık not gelecek şekilde bir map yapısı kurup bu mapi dolduralım
    2-her ogrenciye karsılık notlarını tutan bir map yapısı kuralım
    3- her ogrencinin not ortalamasını hesaplayalım (hesapladıgmız satırda yazdıralım)

 */
public class MapOrnek1 {


    public static void main(String[] args) {
        String [] ogrenciler={"Mustafa","Ece","Özge"};
        int [] not={60,80,78};
        int [] [] notlar2={{60,80,78},{80,92,50},{48,68,94}};

        Map<String,Integer> notMap=new LinkedHashMap<>();

        for (int i = 0; i < ogrenciler.length ; i++) {
            notMap.put(ogrenciler[i],not[i]);
        }

        notMap.forEach((k,v)-> System.out.println(k+"==>"+v));

        Map<String,int[]> notMap2=new HashMap<>();

//        for (int i = 0; i < ogrenciler.length ; i++) {
//            for (int j = 0; j <=i ; j++) {
//                notMap2.put(ogrenciler[i],notlar2[i]);
//            }
//        }
        //int [] [] notlar2={{60,80,78},{80,92,50},{48,68,94}};

        for (int i = 0; i < ogrenciler.length ; i++) {
                notMap2.put(ogrenciler[i],notlar2[i]);
        }


        notMap2.forEach((k,v)-> System.out.println(k+"="+ Arrays.toString(v)));
        System.out.println(Arrays.toString(notMap2.get("Mustafa"))  );

//        int [] mustafa=notMap2.get("Mustafa");
//        double toplam=0;
//        for (int i = 0; i < mustafa.length ; i++) {
//            toplam+=mustafa[i];
//        }
//        System.out.println("ortalama="+(toplam/mustafa.length));
//        int [] ece=notMap2.get("Ece");
//       toplam=0;
//        for (int i = 0; i < ece.length ; i++) {
//            toplam+=ece[i];
//        }
//        System.out.println("ortalama="+(toplam/ece.length));
//        int [] ozge=notMap2.get("Özge");
//        toplam=0;
//        for (int i = 0; i < ozge.length ; i++) {
//            toplam+=ozge[i];
//        }
//        System.out.println("ortalama="+(toplam/ozge.length));
        // key     = value
        // mustafa={60,80,78},
        // ece= {...}

        notMap2.forEach((k,v)-> {
            double toplam=0;

            for (int n :v){
                toplam+=n;
            }
            System.out.println(k+" nın not ortalaması ==> "+(toplam/v.length));
        } );

        Set<Map.Entry<String, int[]>> x = notMap2.entrySet();
        // key     = value
        //      [ mustafa={60,80,78},
        //        ece= {...},
        //        ozge={...}
        //
        //        ]

        for (Map.Entry<String,int[]> entry :notMap2.entrySet()){
            double toplam=0;
            for (int n:entry.getValue()){
                toplam+=n;
            }
            System.out.println(entry.getKey()+" nın not ortalaması ==> "+(toplam/entry.getValue().length));
        }

        // Set =["Mustafa","Ece","Özge"]

        for (String isim:notMap2.keySet()){
            double toplam=0;
            int [] array=notMap2.get(isim);
            for (int n: array){
                toplam+=n;
            }
            System.out.println(isim+" nın not ortalaması ==> "+(toplam/notMap2.get(isim).length));
        }

    }


}
