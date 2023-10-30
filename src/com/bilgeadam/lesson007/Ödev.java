package com.bilgeadam.lesson007;
/*
 Adana adlı sehirin plaka kodu : 01
Adıyaman adlı sehrin plaka kodu :02

 */
public class Ödev {

    public static void main(String[] args) {
        String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
                + "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya;100-Edremit";


        String [] array =sehirler.split(";");
        // array[0]=01-Adana;
        // array[1]=02-Adıyaman;
        for (int i = 0; i <array.length ; i++) {

            int index=array[i].indexOf("-");
            System.out.println(array[i].substring(index+1)+" adlı sehirin plaka kodu :"+ array[i].substring(0,index));

        }

    }
}
