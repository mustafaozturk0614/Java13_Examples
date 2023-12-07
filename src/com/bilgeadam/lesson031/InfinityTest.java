package com.bilgeadam.lesson031;
/*
    2 tane int deger alan bir metot yazalım bu metot
    aslında bize pozitif tam sayı degerlenin toplamını veren bir metot olsun
    eger girdimiz sayılar pozitif sayılar ise toplamı bize geri donsun
    değilse kendi yazdıgımız bir exception sınıfından hata olusturalım (EksiDegerException)

    Checked Exception ==> kontrol edilmesi zorunlu exceptionlardır extends olarak Exception sınıfını alır

    Unchecked Exception ==> kontrol edilmesi zorunlu olmayan exceptionlardır extend olarak RunTimeException sınıfı alır


 */
public class InfinityTest {


    public static void bolme2(Double bolunen,Double bolen) throws  InfinityException{
            if (bolen==0){
                throw  new InfinityException("Bolen 0 olamaz");
            }
            double bolum=bolunen/bolen;
            System.out.println("sonuc==>"+bolum);
    }

    public  static int pozitifToplama(int sayi1,int sayi2) throws EksiDegerException {
        if (sayi1<0 || sayi2<0){
            throw  new EksiDegerException("Girilen sayılar pozitif tam sayi değildir");
        }
        return  sayi1+sayi2;
    }

    public static void main(String[] args) {

        bolme2(50D,1D);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        try {
            System.out.println(pozitifToplama(50,-90));
        } catch (EksiDegerException e) {
            System.out.println(e.toString());
        }
        ;






        System.out.println("program devam ediyor");

    }
}
