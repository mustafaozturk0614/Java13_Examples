package com.bilgeadam.lesson021.controller;

import com.bilgeadam.lesson021.entity.Kullanici;
import com.bilgeadam.lesson021.entity.Sepet;
import com.bilgeadam.lesson021.enums.EUrun;
import com.bilgeadam.lesson021.service.KullaniciServis;
import com.bilgeadam.lesson021.utility.Database;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1- Kullanıcı sınıfımız olacak
kullanıcılarımız username ve password ile uygulamaya giriş yapacaklar
daha sonra sepetlerine urun ekleyecekler

2- kullanıcılarımız database adında bir sınıf yaratıp orda tutalım
uygulama başlarken default 3 tane kullanıcmız olsun
 uygulma içinde kayıt ol seceneği ile beraber database kullanıcı ekleyelim
 giriş yap metodu ile berberde kullkanıc kontrolunden sonra eger boyle bir kullanıcı varsa kulalnıcı menusu acılsın
 uygulama menusu==>  Kayıt ol
                     giriş yap
                     kullanıcları goster

 3-Sepet==> sepetimize  kullanıcın eklediği urunlerin tutuldugu ve genel bilgilerin gosterildiği yer

 4- Urunlerimiz  sabit olsun uygulama boyunca urun ekleyip cıkarmayalım

  CIPS,KOLA,SEKER,YAG,UN,EKMEK,CAY,YUMURTA,YOGURT,SUT

  5-Kullanıcı menusunde ==> Sepeti goster
                            Urun ekle
                            çıkış

     Sepeti goster metodu=> eğer kullanıcın sepeti boş işse sepetniz boş yazsın eger dolu ise urunleri yazdırsın

     sepete urun ekle ==> once urun listemizi gorecegiz daha sonra urun listemizden bir urun secip sepetimize ekleyeceğiz

     ödev==>
     her urunun bir fiyatı olsa ve sepeti goster metodu calıstığı zaman urun listelemeyle beraber
     sepetteki urunlerin toplamını bana yazdırsa
 */
public class KullaniciController {
    Scanner scanner=new Scanner(System.in);

    private  Kullanici aktifKullanici;

    private   KullaniciServis kullaniciServis;

    public KullaniciController() {
      this.kullaniciServis = new KullaniciServis();
    }

    public KullaniciController(KullaniciServis kullaniciServis) {
        this.kullaniciServis = kullaniciServis;
    }

    public void uygulamayiBaslat(){
        kullaniciServis.baslangicVerisiOlustur();

        while (true){
            menu();
            int secim=scanner.nextInt();
            scanner.nextLine();
            switch (secim){
                case 1:
                    kayitOl();
                    break;
                case 2:
                    girisYap();
                    break;
                case 3:
                    kulaniclariGoster();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }

    }
    public void sepetiGoster(){
        //aktifKullanici.setSepet(new Sepet());
        if (aktifKullanici.getSepet().getUrunler().isEmpty()){
            System.out.println("Sepetiniz bos");
        }else {
            System.out.println("Sepetinizdeki urunler");
            for (EUrun urun :aktifKullanici.getSepet().getUrunler()){
                System.out.println(urun);
            }
        }

    }
    public void sepetiGoster2(Kullanici kullanici){
        if (kullanici.getSepet().getUrunler().isEmpty()){
            System.out.println("Sepetiniz bos");
        }else {
            System.out.println("Sepetinizdeki urunler");
            for (EUrun urun :kullanici.getSepet().getUrunler()){
                System.out.println(urun);
            }
        }

    }

    private void kulaniclariGoster() {
   List<Kullanici> kullaniclar=kullaniciServis.kullaniclariGetir();
        for (Kullanici kullanici:kullaniclar){
            System.out.println(kullanici);
        }
    }

    public void kayitOl() {
        System.out.println("Lütfen bir isim giriniz");
        String ad=scanner.nextLine();
        System.out.println("Lütfen bir kullanıcı adı giriniz");
        // kullanıcı adını kontrol edip geçerli bir kullancı adı donen metot
        String username=kullaniciAdiKontrol();
        System.out.println("Lütfen bir şifre giriniz");
        String password=scanner.nextLine();
        Kullanici kullanici=new Kullanici(ad,username,password);
      //  kullanici.setSepet(new Sepet());
        kullaniciServis.kayitEt(kullanici);

    }

    public  void  menu(){
        System.out.println("1-Kayıt ol");
        System.out.println("2-Giriş yap");
        System.out.println("3-Kullanıcıalrı goster");
        System.out.println("4-Çıkış");
    }
    public void  kullaniciMenusu(){
        System.out.println("====Kullanici Menusu====");
        System.out.println("1-Sepeti Goster");
        System.out.println("2-Sepete ürün Ekle");
        System.out.println("3-Ana menuye dön");
    }
    public void  kullaniciMenusuBaslat(){
        int secim=3;
        do {
            kullaniciMenusu();
            secim= scanner.nextInt();
            switch (secim){
                case 1:
                    sepetiGoster();
                    break;
                case 2:
                    urunEkle();
                    break;
                case 3:
                    System.out.println("Üst menuye donuluyor...");
                    break;
            };
        }while (secim!=3);

    }
    public void  kullaniciMenusuBaslat2(Kullanici kullanici){
        int secim=3;
        do {
            kullaniciMenusu();
            secim= scanner.nextInt();
            switch (secim){
                case 1:
                    sepetiGoster2(kullanici);
                    break;
                case 2:
                    urunEkle();
                    break;
                case 3:
                    System.out.println("Üst menuye donuluyor...");
                    break;
            };
        }while (secim!=3);

    }
    public  void girisYap(){
        System.out.println("Lütfen kullanıcı adını giriniz");
        String username=scanner.nextLine();
        System.out.println("Lütfen şifrenizi giriniz");
        String password=scanner.nextLine();
        Kullanici kullanici =kullaniciServis.kullanıciAdiveSifreIleKullanıciGetir(username,password);
        if (kullanici!=null){
            aktifKullanici=kullanici;

            kullaniciMenusuBaslat();
          //  kullaniciMenusuBaslat2(kullanici);
        }

    }
    // kullanıcı adını kontrol edip geçerli bir kullancı adı donen metot
    public String kullaniciAdiKontrol(){
        Kullanici kullanici=null;
        String username=null;
        do {
            username=scanner.nextLine();
            kullanici=kullaniciServis.kullanıciAdiIleKullanıciGetir(username);
        }while (kullanici!=null);
        return username;
    }

    public void  urunListesi(){
        System.out.println("Urunler".toUpperCase());
        EUrun [] urunler=EUrun.values();
        for (EUrun urun:urunler){
            System.out.println((urun.ordinal()+1)+"-"+urun.toString());
        }
        System.out.println("Üst menüye donmek için 0 a basın ");
    }

    public void  urunEkle(){
        int secim;
        urunListesi();
        while ((secim=scanner.nextInt())!=0){
            EUrun urun=EUrun.values()[secim-1];
//            Sepet sepet=aktifKullanici.getSepet();
//            List<EUrun> urunler=aktifKullanici.getSepet().getUrunler();
//            List<EUrun> urunler2=sepet.getUrunler();
            aktifKullanici.getSepet().getUrunler().add(urun);
            System.out.println(urun + " basarı ile eklendi");
            urunListesi();
       }
    }
}
