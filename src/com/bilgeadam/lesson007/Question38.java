package com.bilgeadam.lesson007;
/*
    dizi içerisindeki 1 ve 4 un adeti
    ve 1 sayısnın adeti 4 sayısının adetinden buyuk ise true değil ise false yazdıran algoritma
    eşit ise de eşit yazdırsın

 */
public class Question38 {
    public static void main(String[] args) {
        int[] sayilar = { 1,4, 4, 4, 1, 1, 4, 8 };
        int adet1=0;
        int adet4=0;
        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]==1){
                adet1++;
            }
           else if (sayilar[i]==4){
                adet4++;
            }

        }

        System.out.println("1 lerin adeti==>"+adet1);
        System.out.println("4 lerin adeti==>"+adet4);
        if (adet4>adet1){
            System.out.println(false);
        } else if (adet1>adet4) {
            System.out.println(true);
        }else{
            System.out.println("Eşittir");
        }


    }
}
