package com.bilgeadam.lesson022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();

        arrayList1.add(6);
        arrayList1.add(5);
        System.out.println(arrayList1);
        arrayList1.add(1,8);
        System.out.println(arrayList1);
        System.out.println(arrayList1.get(2));
       // System.out.println(arrayList1.get(3));
        // set metodu o indexdeki degeri değiştiri ve değiştirdiği değeri geri dondurur
        System.out.println(arrayList1.set(1,96));
        System.out.println(arrayList1);
        System.out.println(arrayList1.get(2));
        System.out.println(arrayList1.remove(new Integer(96)));
        System.out.println(arrayList1.remove(1));

        System.out.println(arrayList1);
        arrayList1.add(26);
        arrayList1.add(32);
        arrayList2.add(6);
        arrayList2.add(100);
        arrayList2.add(200);
        arrayList2.add(300);

        System.out.println(arrayList2);
       arrayList2.addAll(arrayList1);
      //  arrayList2.addAll(1,arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList1);
        arrayList2.removeAll(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList2.removeAll(arrayList1));

        System.out.println(arrayList2.size());
        System.out.println(arrayList2.contains(100));
        System.out.println(arrayList2.contains(180));
        arrayList2.addAll(arrayList1);
         //arraylist2 listesi arraylist1 listesini içeriyor mu
        System.out.println(arrayList2.containsAll(arrayList1));

        // Listeyi Arraye çevirme metodu
       Integer [] array= arrayList1.toArray(new Integer[0]);
        Integer [] array2= arrayList2.toArray(new Integer[arrayList2.size()]);

       System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        Integer [] array3={400,500,600};
        // bu değiştirlemez bir yapı yaratıyor arraylist3 bir array gibi davranıyor
//        List<Integer> arrayList3=Arrays.asList(array3);
//        arrayList3.add(700);
        // Arrayden listeye cevirme işlemi
        List<Integer> arrayList4=new ArrayList<>(Arrays.asList(array3)) ;
        arrayList4.add(700);
        System.out.println(arrayList4);
        List<Integer> arrayList5=new ArrayList<>(arrayList1);

        List<Integer> arrayList6=arrayList4.subList(1,3);
        System.out.println(arrayList6);



    }
}
