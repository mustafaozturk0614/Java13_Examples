package com.bilgeadam.lesson023;

import java.util.Stack;

/*

    ınteger bir stack olusturacagız içerisinde 6 7 tane deger ekleyelim
    100 den buyuk olanları baska bir stackde toplayalım
    100 den kucuk olanlarının toplamını bulalaım;
    daha sonra bu stackleri yazdıralım

 */
public class ParaSayma {


    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        Stack<Integer> yuzdenBuyukler=new Stack<>();
        int toplam=0;

        stack.push(200);
        stack.push(50);
        stack.push(25);
        stack.push(250);
        stack.push(400);
        stack.push(300);
        stack.push(20);

        while (!stack.isEmpty()){
            if (stack.peek()>100){
                yuzdenBuyukler.push(stack.pop());
            }else{
                toplam+=stack.pop();
            }
        }

        System.out.println("toplam==>"+toplam);
        yuzdenBuyukler.forEach(System.out::println);

//        while (!stack.isEmpty()){
//            int sayi=stack.pop();
//            if (sayi>100){
//                yuzdenBuyukler.push(sayi);
//            }else{
//                toplam+=sayi;
//            }
//        }



    }
}
