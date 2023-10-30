package com.bilgeadam.lesson005;
/*


 */
public class Question25 {

    public static void main(String[] args) {
        String value="1234";
        // value degişkeninin karakterlerinin(sayısal değerlerinin) toplamını bulalaım

        int toplam=0;
        int toplam2=0;
        for (int i = 0; i <value.length() ; i++) {
                // 1.çözüm
                String harf=String.valueOf(value.charAt(i));
                int sayi=Integer.parseInt(harf);
               // Long sayi2=Long.parseLong(harf);
                toplam+=sayi;
                // 2.çözüm
                // karakterden direk int e cevirme metodu
                int sayi2=Character.getNumericValue(value.charAt(i));
                toplam2+=sayi2;

        }

        System.out.println("toplam="+toplam);
        System.out.println("toplam2="+toplam2);
    }
}
