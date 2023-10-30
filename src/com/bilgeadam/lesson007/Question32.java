package com.bilgeadam.lesson007;
/*
    bir dizideki tum sayıların toplamını bulalım
    ve her sayi için bu sayı tektir veya bu sayı çiftir cıktısını verelim

 */
public class Question32 {

    public static void main(String[] args) {
        int [] sayilar={1500,120,5,-256,1296,-462,159,12};
        int toplam=0;
//        String value="Merhaba";
//        for (int i;i<value.length();i++){
//            System.out.println(value.charAt(i));
//        }

        for (int i=0;i< sayilar.length;i++){
            toplam+=sayilar[i];
            if (sayilar[i]%2==0){
                System.out.println(sayilar[i]+" çift sayıdır");
            }else {
                System.out.println(sayilar[i]+" tek sayıdır");
            }
        }

        System.out.println("toplam= "+toplam);

    }
}
