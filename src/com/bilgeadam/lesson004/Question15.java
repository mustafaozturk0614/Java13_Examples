package com.bilgeadam.lesson004;
/*
    1 den 100e kadar (100 de dahil) olan sayılardan  çift sayıların toplamının
    tek sayıların toplamına oranı
    tek sayılar toplamı:
    çiftsayılar toplamını:
    oran :
 */
public class Question15 {


    public static void main(String[] args) {

        double tekToplam=0;
        double çiftToplam=0;


        for (int i=1;i<=100;i++){
            if (i%2==0){
                çiftToplam+=i;
            }else {
                tekToplam+=i;
            }
        }
        System.out.println("oran: "+(çiftToplam/tekToplam));
        System.out.println("tek toplam: "+(tekToplam));
        System.out.println("çift toplam: "+(çiftToplam));
    }
}
