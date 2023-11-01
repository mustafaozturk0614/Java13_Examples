package com.bilgeadam.lesson013;
/*
    1- Taş kağıt makas uygulaması yapacagız bunun için bir sınıf olusturup
    metotları ve özellikleri bu sınıf içerisinde toplayacagız
    bu sınıfta seceneklerimiz tutalım (TAS,KAGIT,MAKAS) ve
    bu uygulamayı calıstıran kişinin ismini tutatlım
  2- a) Kullanıcı bir secim yapsın
  ( kullanıcıya secim yaptıracak ve bu secim geri denecek bir metot istiyorum);
    b) bilgisayara rastgele secim yaptıracak ve bu secimi donen bir metot istiyorum
 3- uygulama metodu yazalım  bu metotta oyuncuadı (Mustafa)  Hosgeldin Tas kagıt makas oyunu baslıyor
    bu cıktıdan sonra daha once yazdıgımız metotları kullanrak kullanıclara oyunun sonucunu deonelim
    ==> Beraberlik ,Kazandınız ,Kaybettiniz sonuclarından birini yazdıralım
 */
public class App {

    public static void main(String[] args) {
        TasKagitMakas oyun=new TasKagitMakas();
        oyun.oyuncuAdi="Mustafa";
       // System.out.println("App main metot===>"+ oyun.pcSecim());
        oyun.uygulama();

    }
}
