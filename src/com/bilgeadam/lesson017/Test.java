package com.bilgeadam.lesson017;
/*
    Çalışanlarımız olacak  bu calısanlarımız isim soy isim is unvanı maas gibi degerleri olsun
    iki tane ayrı const istiyorum (isim,soyisim) digeride (isim soyisim maas)
   iş unvanları ==> Muhendis ve ofis calısanı
   Buradan bir kalıtım içeren yapı cıkarmanızı bekliyorum
   daha sonra bu kalıtımla beraber
   muhendis için ==>
   eger maaş girilmez ise default deger =20.000
   eger maaş 20 000 ile 25 000 arasında ise Muhendis
   25 000 - 35 000 arasında ise kidemli muhendis
   35 0000 ustunde ise yuksek muhendis olsun  eger 20 000 altında bir maas girilmiş ise en dusuk maas 20 000 dir
   personel maası 20 000 olarak ayarlandı

   ofıs calısnı için
   eger maaş girilmez ise default deger =18 000
   eger maaş 18 000 ile 27 000 arasında ise Calısan
  27 000 ustunde ise kıdemli çalışan  olsun  eger 18 000 altında bir maas girilmiş ise en dusuk maas 18 000 dir
   personel maası 18 000 olarak ayarlandı

 ödev==> maas zammı metodu istiyorum  dıasrıdan bir oran alacak o aranı maas ile işleme sokup maası guncelleyeceğzi
 buna ek olarak muhendislere +250 tlde bonus ekleyelim
 ödev 2==>
    Bir bilgisayar sınıfı soyutlayacagız
    bu bilgisayar sınıfnı kalıtım uygulayarak alt sınıflarını olusturalım (en az 2 tane sınıf)
    ve bilgisayarlarımızın
    anakart
    ram ..mouse gibi 5 6 tane ozellik yazıp bu ozellikler içinde sınıflar yaratalım
    test sınıfndada denemelerle nesnelerimiz olusturalım

 */

import com.bilgeadam.lesson017.altsınıflar.Muhendis;
import com.bilgeadam.lesson017.altsınıflar.OfisCalisani;

public class Test {

    public static void main(String[] args) {
        OfisCalisani calisan=new OfisCalisani("Mustafa","Öztürk",20000);
        calisan.zamYap(0.2);

        System.out.println(calisan.toString());
        Muhendis muhendis=new Muhendis("Zeliha","Aydoğdu",30000);
        muhendis.zamYap(0.2);
        System.out.println(muhendis.toString());
        Tekniker tekniker=new Tekniker("","",20000);
        tekniker.zamYap(0.3);
        System.out.println(muhendis.getMaas());
       // System.out.println(muhendis.setMaas(500000));


    }


}
