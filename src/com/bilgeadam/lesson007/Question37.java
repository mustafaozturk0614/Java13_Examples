package com.bilgeadam.lesson007;
/*
 bir dizide ard arad gelen 2 indexdeki sayı değeri 2 ise
 true yazdırıp donguyu sonlandıralım yoksa false yazdıralım

 */
public class Question37 {
    public static void main(String[] args) {
        int[] sayilar = { 2, -256, 16, 1258,25, 2 };
        boolean kontrol=false;
        for (int i = 0; i < sayilar.length-1 ; i++) {
            if (sayilar[i]==2&&sayilar[i+1]==2){
                kontrol=true;
                break;
            }
        }
        System.out.println(kontrol);
        // 2.çözüm
        kontrol=false;
        for (int i = 1; i < sayilar.length ; i++) {
            if (sayilar[i]==2&&sayilar[i-1]==2){
                kontrol=true;
                break;
            }
        }
        System.out.println(kontrol);

        // 3.çözüm

        int ilkdeger=sayilar [0];
        boolean esitmi=false;

        for(int a=1; a<sayilar.length; a++) {
            if (sayilar[a] ==2 && ilkdeger==2) {
                esitmi = true;
                break;
            } else{
                esitmi = false;}
            ilkdeger=sayilar[a];
        }

        System.out.println(esitmi);
    }
}
