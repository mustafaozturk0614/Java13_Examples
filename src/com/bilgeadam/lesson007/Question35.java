package com.bilgeadam.lesson007;
/*
    bir dizideki max min en buyuk ikinci degeri bulalım

 */
public class Question35 {
    public static void main(String[] args) {
       // int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 240, 81, 14 };
        int[] sayilar = { 0,1,2,3 };
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
//        int max=sayilar[0];
//        int min=sayilar[0];
        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]>max){
                max=sayilar[i];
            } if (sayilar[i]<min) {
                min=sayilar[i];
            }

        }

        System.out.println("max= "+max);
        System.out.println("min= "+min);
    }
}
