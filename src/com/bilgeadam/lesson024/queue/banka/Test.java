package com.bilgeadam.lesson024.queue.banka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(5,1,8,4,9));


        Comparator<Integer> buyuktenKucuge= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

        Collections.sort(list,buyuktenKucuge);

        list.forEach(System.out::println);
        List<String> list2=new ArrayList<>(List.of("c","b","a","f","e"));

        Collections.sort(list2);

        list2.forEach(System.out::println);

    }
}
