package com.bilgeadam.lesson031;
/*
    2 tane int deger alan bir metot yazalım bu metot
    aslında bize pozitif tam sayı degerlenin toplamını veren bir metot olsun
    eger girdimiz sayılar pozitif sayılar ise toplamı bize geri donsun
    değilse kendi yazdıgımız bir exception sınıfından hata olusturalım (EksiDegerException)

 */
public class InfinityTest {


    public static void bolme2(Double bolunen,Double bolen){
            if (bolen==0){
                throw  new InfinityException("Bolen 0 olamaz");
            }
            double bolum=bolunen/bolen;
            System.out.println("sonuc==>"+bolum);
    }

    public  static int pozitifToplama(int sayi1,int sayi2){
        if (sayi1<0 || sayi2<0){
            throw  new EksiDegerException("Girilen sayılar pozitif tam sayi değildir");
        }
        return  sayi1+sayi2;
    }

    public static void main(String[] args) {
        try {
            bolme2(50D,0D);
        }catch (InfinityException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(pozitifToplama(-5,7));
        }catch (EksiDegerException e){

            System.out.println("hata olustu: "+e.toString());
        }


        System.out.println("program devam ediyor");

    }
}
