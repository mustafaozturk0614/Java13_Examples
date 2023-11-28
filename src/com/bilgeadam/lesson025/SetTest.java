package com.bilgeadam.lesson025;

import java.util.*;

public class SetTest {


    public static void main(String[] args) {
    //   Set<Integer> set= new HashSet<>();
       // Set<Integer> set= new LinkedHashSet<>();
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

       Set<Integer> set= new TreeSet<>();
        set.add(5);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(3);
        set.add(9);
        set.add(5);
        set.add(5);
        set.forEach(System.out::println);

    }

}
