package com.bilgeadam.lesson009;

import java.util.Arrays;

/*

    dizideki elamlar arasında ki farkın en küçük oldugu değer nedir bir metoto içinde yazalım

 */
public class Question43 {

    public static void main(String[] args) {
        int [] array={9,10,-40,30,2,4,56};
     //   System.out.println(Math.abs(-4));

        int [] array2=new int[21];
        System.out.println(enKucukFarkiBul(array,array2));   ;
        System.out.println(Arrays.toString(array2));
    }

    public  static int enKucukFarkiBul(int [] array ,int [] array2){
        if (array.length<2){
            return 0;
        }else {
            int sayac=0;
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j <array.length ; j++) {
                    int fark=Math.abs(array[i]-array[j]);
                    array2[sayac]=fark;
                    sayac++;
                    if (fark<min){
                        min=fark;
                    }
                }
            }

            return  min;
        }



    }
}
