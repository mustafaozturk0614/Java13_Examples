package com.bilgeadam.lesson008;

import java.util.Arrays;

/*

1 ile 10 arasındaki sayıların çarpım tablosunu çift boyutlu bir arrayde toplayalım

0 0 =1x1=1  1 0 =2x1=2
0 1=1x2=2    1 1 =2x2=4
.              .
.              .
.
0 9 =1x10=10
 */
public class Question41 {
    public static void main(String[] args) {

        String [] [] carpimTablosu=new String[10][10];

        for (int i = 0; i <carpimTablosu.length ; i++) {
            for (int j = 0; j <carpimTablosu[i].length ; j++) {
                carpimTablosu[i][j]=(i+1) +"X" +(j+1) +"="+((i+1)*(j+1));
              //  System.out.println(carpimTablosu[i][j]);
            }
        }

        System.out.println(carpimTablosu);
//        for (int i = 0; i <carpimTablosu.length ; i++) {
//            for (int j = 0; j <carpimTablosu[i].length ; j++) {
//                System.out.println(carpimTablosu[i][j]);
//            }
//        }

        int [] dizi={56,89,75,63,12};

        System.out.println(dizi);
        System.out.println(Arrays.toString(dizi));
        /*
            {
                {1x1=1,1x2=2,.......},
                {2x1=2,2x2=4,.......},
                {3x1=3,3x2=6,.......},
            }
         */

        for (int i = 0; i < carpimTablosu.length ; i++) {
            System.out.println(Arrays.toString(carpimTablosu[i]));
        }




    }
}
