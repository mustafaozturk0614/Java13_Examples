package com.bilgeadam.lesson027.sansliNumaralar;

import java.util.*;

public class SansliNumaralar {

    Random random;
    Map<Integer,Integer> map;
    List<Integer> list;

    Set<Integer> set;

    public SansliNumaralar() {
        this.random = new Random();
        this.map=new TreeMap<>();
        this.list=new ArrayList<>();
        this.set=new LinkedHashSet<>();
    }

    public  int rastgeleSayiUret(){
        return  random.nextInt(1,101);

    }

    public void sayilariUret(){
        for (int i = 0; i <10000; i++) {
            int sayi=rastgeleSayiUret(); //5
            if (map.containsKey(sayi)){
                map.replace(sayi,map.get(sayi)+1);
            }else {
                map.put(sayi,1);
            }
        }
    }

    public  void listeOlustur(){
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry  :entrySet){
            for (int i = 0; i <entry.getValue(); i++) {
                list.add(entry.getKey());
            }
        }
    }
    public  void listeOlustur2(){
        Set<Integer> set=map.keySet();
        for (Integer key :set){
            int value=map.get(key);
            for (int i = 0; i <value; i++) {
                list.add(key);
            }
        }
    }

    public  void listeOlustur3(){
        map.forEach((k,v)->{
            for (int i = 0; i <v ; i++) {
                list.add(k);
            }
        });
    }

    public void  sansliNumaraliBul(){
        Collections.shuffle(list);
        int count=0;

        while (set.size()<10) {
            int index=random.nextInt(list.size());
             set.add(list.get(index));
             count++;
        }
        System.out.println("dongu calısma sayısı==>"+ count);

    }
}
