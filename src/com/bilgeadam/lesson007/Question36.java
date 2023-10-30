package com.bilgeadam.lesson007;
/*
    bir dizideki max min en buyuk ikinci degeri bulalım

 */
public class Question36 {
    public static void main(String[] args) {
       // int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 240, 81, 14 };
        int[] sayilar = {4,1,5,6};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondMax=Integer.MIN_VALUE;
        //toplu yorum ctr /
//        int max=sayilar[0];
//        int min=sayilar[0];
//        int secondMax=sayilar[0];
        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]>max){
                secondMax=max;
                max=sayilar[i];
            } if (sayilar[i]<min) {
                min=sayilar[i];
            }
            if (sayilar[i]>secondMax&&sayilar[i]<max){
                secondMax=sayilar[i];
            }
        }

        System.out.println("max= "+max);
        System.out.println("min= "+min);
        System.out.println("secondMax= "+secondMax);

        ///
        int [] dizi= {4,1,2,3};
        int enbuyuk = Integer.MIN_VALUE;
        int ikinci =Integer.MIN_VALUE ;

        for(int i=0;i<dizi.length;i++){
            if(dizi[i]>enbuyuk)
            {
                ikinci=enbuyuk;
                enbuyuk=dizi[i];
            }
            else if(dizi[i]>ikinci){
                ikinci = dizi[i];
            }
        }
        System.out.println("İkinci büyük sayı: " +ikinci);
        System.out.println("en buyuk "+ enbuyuk );


    }
}
