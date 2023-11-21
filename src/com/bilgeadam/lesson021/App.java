package com.bilgeadam.lesson021;

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


 */
public class App {

    Scanner scanner=new Scanner(System.in);

    public void uygulamayiBaslat(){
        Database.baslangicVerisiOlustur();

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

    private void kulaniclariGoster() {
      Kullanici [] kullaniclar=Database.kullanicilariGetir();
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
        Database.kullanciEkle(kullanici);
        System.out.println(kullanici.getAd()+" database'e basarıyla eklendi");
    }

    public  void  menu(){
        System.out.println("1-Kayıt ol");
        System.out.println("2-Giriş yap");
        System.out.println("3-Kullanıcıalrı goster");
        System.out.println("4-Çıkış");
    }

    public  void girisYap(){
        System.out.println("Lütfen kullanıcı adını giriniz");
        String username=scanner.nextLine();
        System.out.println("Lütfen şifrenizi giriniz");
        String password=scanner.nextLine();
        Kullanici kullanici =Database.kullanıciAdiveSifreIleKullanıciGetir(username,password);
        if (kullanici!=null){
            System.out.println("Giriş başarılı");
        }else{
            System.out.println("Kullanıcı adı veya şifre hatalı");
        }

    }

    // kullanıcı adını kontrol edip geçerli bir kullancı adı donen metot
    public String kullaniciAdiKontrol(){
        Kullanici kullanici=null;
        String username=null;
        do {
            username=scanner.nextLine();
            kullanici=Database.kullanıciAdiIleKullanıciGetir(username);

            if (kullanici!=null){
                System.out.println("Sistemde var olan bir kullanıc adı girdiniz " +
                        "lutfen yeni bir kullancı adı ile deneyiniz");
            }

        }while (kullanici!=null);
        return username;
    }

}
