package com.bilgeadam.lesson002;
/*

    1 den başlayarak sırayla sayıları toplayalım toplamımız 50den buyuk olana kadar programımız çalışşın  program sonunda
    toplamı ve programın kaç kere çalıştıgını yazdıralım
 */
public class Question8 {

    public static void main(String[] args) {
        // for
        int toplam=0;
        int i;
        for (i=1;toplam<=50;i++){
            toplam+=i;
            System.out.println(i);
        }
        System.out.println("toplam="+toplam);
        System.out.println("sayac="+(i-1));

        //while
        toplam=0;
        i=0;
        while (toplam<=50){
            i++;
            toplam+=i;
            System.out.println(i);

        }
        System.out.println("//////////////////////////////////////");
        System.out.println("toplam="+toplam);
        System.out.println("sayac="+i);
    }
}
