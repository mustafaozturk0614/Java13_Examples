package com.bilgeadam.lesson035;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
// Dışarıdan String olarak bir alısveris tarihi alalım

// daha sonra her ayın 15 i bizim fatura kesim tarihimiz olsun
1- alısveris tarihi fatura kesim tarihinden oncemi sonramı kontol edip cıktı verelim
fatura tarihine daha 3 gun var  çıktısı sonra ise 19 aralık ise
o zaman fatura kesim tarihini 4 gun geçmissiniz diye bir cıktı verelim

 */
public class SiparisGunu {


    public LocalDate alisverisGunuGir(){
    String gun=Utility.stringDegerAlma("Lütfen alısveris tarihinizi giriniz (yıl-ay-gun) seklinde");
    LocalDate date=LocalDate.parse(gun);
     return  date;
    }
    // her ayın 15 i
    public  LocalDate faturaKesimTarihiBelirle(LocalDate date){
        LocalDate localDate=LocalDate.of(date.getYear(),date.getMonth(),15);
       return  localDate;
    }

    public  void  karsilastir(){
        LocalDate alısverisGunu=alisverisGunuGir();
        LocalDate faturaKesimTarihi=faturaKesimTarihiBelirle(alısverisGunu);
        long fark= ChronoUnit.DAYS.between(alısverisGunu,faturaKesimTarihi);
        if (fark<0){
            System.out.println("fatura Kesim Tarihi "+ Math.abs(fark)  +" gun kadar geçilmiştir");
        } else if (fark==0) {
            System.out.println("fatura kesim tarihi bugundur");
        } else {
            System.out.println("faturaKesimTarihine "+fark +" gun kadar var");
        }
    }
    public  void  karsilastir2(){
        LocalDate alısverisGunu=alisverisGunuGir();
        LocalDate faturaKesimTarihi=faturaKesimTarihiBelirle(alısverisGunu);
        long fark= ChronoUnit.DAYS.between(alısverisGunu,faturaKesimTarihi);
        if (alısverisGunu.isBefore(faturaKesimTarihi)){
            System.out.println("faturaKesimTarihine "+fark +" gun kadar var");
        } else if (alısverisGunu.isEqual(faturaKesimTarihi)) {
            System.out.println("fatura kesim tarihi bugundur");
        }else{
            System.out.println("fatura Kesim Tarihi "+ Math.abs(fark)  +" gun kadar geçilmiştir");
        }


    }
    public static void main(String[] args) {
        SiparisGunu siparisGunu=new SiparisGunu();
     siparisGunu.karsilastir2();

    }
}
