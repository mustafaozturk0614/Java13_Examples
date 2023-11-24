package com.bilgeadam.lesson023;

import java.util.Stack;

public class StackOrnek {

    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        Integer sayi = stack.push(5);
        System.out.println(sayi);
        stack.push(8);
        boolean deger = stack.add(15);
        System.out.println(deger);
        stack.push(25);

        System.out.println(stack.get(1));
        System.out.println(stack.peek());
        int sayi2=stack.peek();
        System.out.println(sayi2);
        System.out.println("pop metodu==>"+stack.pop());
        System.out.println(stack.peek());






    }
}
