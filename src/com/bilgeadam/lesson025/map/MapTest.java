package com.bilgeadam.lesson025.map;


import java.util.*;


public class MapTest {

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
//        Map<String,String> map2=new TreeMap<>();
//        Map<String,String> map3=new LinkedHashMap<>();
        map.put("06","Ankara");
        map.put("05","Amasya");
        map.put("08","Artvin");
        map.put("08","Aydın");
        map.put("08","Antalya");
        map.put("08","artvin");
    // plakası 06 olan şehrin ismini nasıl yazdırırım?
        System.out.println(map.get("08"));
        map.replace("06","ANKARA");
        System.out.println(map.get("06"));

        // key degerleri içerisinde 06 varmı ?
        System.out.println(map.containsKey("06"));
        System.out.println(map.containsKey("09"));
        // value degerleri içerisinde Amasya varmı
        System.out.println(map.containsValue("Amasya"));
        System.out.println(map.containsValue("Bolu"));

        map.forEach((k,v)-> System.out.println(k+"-"+v));
        System.out.println(map);
        // key set ile yazdırma yontemi
      Set<String> keySet=map.keySet();
     // keySet.forEach(System.out::println);

      for (String  key : keySet){
          System.out.println(key+"==>"+ map.get(key));
      }

        for (String  key : map.keySet()){
            System.out.println(key+"==>"+ map.get(key));
        }

        Set<Map.Entry<String, String>> entriySet = map.entrySet();

        for (Map.Entry<String, String>  entry  : entriySet){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

        Map<Integer,String> map2=new TreeMap<>();

        map2.put(1,"Mustafa");
        map2.put(3,"Özge");
        map2.put(2,"Serkan");

        map2.forEach((k,v)-> System.out.println(k+"-"+v));

        Map<Integer,List<String>> map3=new LinkedHashMap<>();

        Map<Boolean,List<String>> map4=new HashMap<>();
        Map<Integer,Map<String,String>> map5=new LinkedHashMap<>();
        Map<List<String>,String> map6=new LinkedHashMap<>();

        List<String> list=new ArrayList<>(List.of("1","2","a"));
        List<String> list2=new ArrayList<>(List.of("5","9","ş"));
        map6.put(list,"Mustafa");
        map6.put(list2,"Serkan");
        List<String> list3=new ArrayList<>();
        list3.add("1");
        list3.add("2");
        list3.add("a");
        System.out.println(map6.get(list3));
        System.out.println(map6.get(list));



    }
}
