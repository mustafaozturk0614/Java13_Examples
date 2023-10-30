package com.bilgeadam.lesson006;
/*


 */
public class Question28 {

    public static void main(String[] args) {
        /*
            String degerinin karakterleri rakam ise toplayalım ve program sonunda toplam degerini yazdıralım
            değil ise bir string de toplayıp program sonunda cıktısını verelim

         */
        String value="125abc96xy8";
        int toplam=0;
        String karakterler="";

        for (int i=0;i<value.length();i++){
            char karakter=value.charAt(i);
            if (Character.isDigit(karakter)){
                int sayi=Character.getNumericValue(karakter);
                toplam+=sayi;
            }else{
                karakterler+=karakter;
            }
        }

        System.out.println(karakterler);
        System.out.println(toplam);
        karakterler="";
        toplam=0;
        for (int i=0;i<value.length();i++){
            char karakter=value.charAt(i);
            if (karakter>=48&&karakter<=57){  // karakter>='0'&&karakter<='9'
                int sayi=Character.getNumericValue(karakter);
                toplam+=sayi;
            }else{
                karakterler+=karakter;
            }
        }
        System.out.println("/////2.çözüm///////");
        System.out.println(karakterler);
        System.out.println(toplam);
    }
}
