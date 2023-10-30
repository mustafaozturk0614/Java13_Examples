package com.bilgeadam.lesson008;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiArray {

    /*
              0 1 2 3
          0-  5 6 8 9
          1   7 7 7 7
          2   0 1 2 3
          3
          4
     */


    public static void main(String[] args) {
        int [] [] array= new int[5][4];
        array[0][0]=5;
        array[0][1]=6;
        array[1][0]=7;
        array [0][2]=8;
        array [0][3]=9;
        array[1][1]=7;
        array[1][2]=7;
        array[1][3]=7;
        array[2][0]=0;
        array[2][1]=1;
        array[2][2]=2;
        array[2][3]=3;
        System.out.println("uzunluk==>"+array.length);

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.println(array[i][j]);
            }
        }

        int [] [] array2= {
                {5,7,8,15},
                {63,95,12,18},
                {6,5,2,8}
        };
        System.out.println(Arrays.toString(array2[1]));
        System.out.println(array2[1][3]);

        int [] array3=array2[1];

        System.out.println(array3[3]);

        int[] array4={1,6,7};

    }



}
