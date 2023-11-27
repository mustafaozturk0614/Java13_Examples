package com.bilgeadam.lesson024.queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {

    public static void main(String[] args) {

        Queue<Integer> kuyruk1= new LinkedList<>();
        Queue<Integer> kuyruk2= new ArrayBlockingQueue<>(5);
        kuyruk1.add(20);
        kuyruk1.add(30);
        kuyruk1.add(40);
        kuyruk1.add(50);
        kuyruk1.add(60);
        kuyruk1.add(70);

      while (!kuyruk1.isEmpty()){
          System.out.println(kuyruk1.poll());
      }
      kuyruk2.offer(50);
      kuyruk2.offer(60);
      kuyruk2.offer(70);
      kuyruk2.offer(80);
      kuyruk2.offer(90);
      kuyruk2.offer(100);
      kuyruk2.offer(110);
      kuyruk2.offer(120);
        System.out.println("///////////////////////////");
        while (!kuyruk2.isEmpty()){
            System.out.println(kuyruk2.poll());
        }
        kuyruk2.offer(800);
        kuyruk2.offer(850);
        kuyruk2.offer(950);
        System.out.println(kuyruk2.peek());

        Queue<Integer> kuyruk3= new PriorityQueue<>();

        kuyruk3.add(500);
        kuyruk3.add(600);
        kuyruk3.add(400);
        kuyruk3.add(300);
        kuyruk3.add(800);
        kuyruk3.add(700);
        kuyruk3.add(100);
        kuyruk3.add(750);
        System.out.println("Oncelikli kuyruk");

        for (Integer sayi:kuyruk3){
            System.out.println(sayi);
        }
        System.out.println("///////////////");
        while (!kuyruk3.isEmpty()){
            System.out.println(kuyruk3.poll());
        }

        Queue<String> kuyruk4= new PriorityQueue<>();
        kuyruk4.offer("Mustafa");
        kuyruk4.offer("Ayşe");
        kuyruk4.offer("Serkan");
        kuyruk4.offer("Zeliha");
        kuyruk4.offer("Pınar");
        while (!kuyruk4.isEmpty()){
            System.out.println(kuyruk4.poll());
        }

    }
}
