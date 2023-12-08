package com.bilgeadam.lesson032;

import java.util.Locale;
import java.util.Optional;

/*
    1-Bir limanımız olacak bu limanda yuk yerleştirlecek alanlar olacak
    limanda yuk yerleştirelcek alanlar liman olusturken belilenebilir
    veya standart her liman için 10 adet yuk yeri olabilir
    Her yukun ==> bir ağırlıgı bir kabul tarihi olsun (String)

    2-Kendi Exception sınıfımızı yaratalım
    -- yukYerisec Metodu olacak ==> bu metot dısarıdan bir yuk yeri secimi alacak
    (metot içinde kullanıcıya bir yuk yeri sectirelim ) ve bu yuk yeri dolu ise bize
    yuk yeri dolu diye bir hata fırlatacak bu metodu çalıstırmadna once default olarak 2 tane yukyerini elle dolduralım
    daha sonra bu metodu calıstıralım

    --yukYerisec2==> yuk yeri secimi yapacak ve bize sectiği yuk yerinin int degerini donecek
    yerleştirme işleminibu metot yapmayacaktır!!!! yine yuk yeri doluysa hata fırlatsın ayrıca sınırların
    dısında bir deger girmiş isekde başka bir hata fırlatsın

    3- agırlıkBelirle ==> limanımız 250 kilonun altını kabul etmiyor  kullanıcadan bir agırlık degeri alalım
    eger 250 nin altındaysa yetersiz ağırlık oldugnu belirten bir hata fırlatalım
        Ödev
    4- tarihBelirleMetodu==>
        a) girilen tarih bugunden öncemi önce ise bir hata fırlatacagız
        b)Cumartesi ve Pazar mesai saatleri dısındadır eger yuk girisi
        cumartesi ve ya pazar gerçekleştirilmek isteniyorsa bununla ilgili bir hata fırlatacagız
        eger bu kosullardan geçmiş isede

 */
public class Uygulama {

  private    Liman liman;
  private   final long GUN=24*60*60*1000;

    public Uygulama() {
        this.liman = new Liman();
        this.liman.getYukler()[0]=new Yuk("Hurda",11750,new MyDate(System.currentTimeMillis()-GUN,EGun.CARSAMBA));
        this.liman.getYukler()[1]=new Yuk("Buğday",55000,new MyDate(System.currentTimeMillis()-2*GUN,EGun.SALI));
    }

    public void   yukYeriSec(Yuk yuk){
        System.out.println("Boş Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
                if (liman.getYukler()[i]==null){
                    System.out.println((i+1)+". alanı secebilirsiniz");
                }
        }
        int index=Utility.intDegerAlma("Lütfen bir yuk alanı seciniz");
        if (liman.getYukler()[index-1]==null){
            liman.getYukler()[index-1]=yuk;
            System.out.println("işlem başarılı");
        }else{
            throw  new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
    }
    public int   yukYeriSec2(){
      boolean kontrol=false;
        int index=-1;
       do {
           index=Utility.intDegerAlma("Lütfen bir yuk alanı seciniz");
           try {
               kontrol=indexKontrol(index);
           }catch (LimanException e){
               System.out.println(e.toString());
           }
       }while (!kontrol);
            return index;
    }
    public boolean indexKontrol(int index){
        if (index>liman.getAlanSayisi()||index<0){
            throw new LimanException(ErrorType.SINIRLAR_DISINDA);
        }
        if (liman.getYukler()[index]!=null){
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
        return  true;
    }

    public  double agirlikBelirle(){
        double agirlik=Utility.doubleDegerAlma("Lütfen yukunuzun agırlıgını giriniz");
        if (agirlik<250){
            throw  new LimanException(ErrorType.YETERSIZ_AGIRLIK);
        }
        return  agirlik;
    }

    /*
       4- tarihBelirleMetodu==>
        a) girilen tarih bugunden öncemi önce ise bir hata fırlatacagız
        b)Cumartesi ve Pazar mesai saatleri dısındadır eger yuk girisi
        cumartesi ve ya pazar gerçekleştirilmek isteniyorsa bununla ilgili bir hata fırlatacagız
        eger bu kosullardan geçmiş isede

     */

    public  MyDate tarihBelirle(){
        long bugun=System.currentTimeMillis();
        // kullanıcadan bugune kıyasla oncesinde veya sonrasında bir gun sayısı istiyoruz eger bugunden once ise kullancı - degerle girecek
        int gunSayısı=Utility.intDegerAlma("Lutfen tarih giriniz + veya - kullanarak kac gun once veya sonra işlem yapmak istediğinizi belirtin");
        long tarih=bugun+(gunSayısı*GUN);
        EGun gun=gunBelirle();
        if (tarih<bugun){
            throw  new LimanException(ErrorType.GECERSIZ_KABUL_TARIHI);
        }
        if (gun.equals(EGun.CUMARTESI)||gun.equals(EGun.PAZAR)){
            throw  new LimanException(ErrorType.GECERSIZ_KABUL_TARIHI,"Hafta sonu kabul yapılmamaktadır");
        }
        return new MyDate(tarih,gun);
    }

    public  EGun gunBelirle(){
        boolean kontrol=false;
        EGun gun=null;
        do {
            String stringGun=Utility.stringDegerAlma("Lütfen Gun degerini giriniz").toUpperCase(Locale.ENGLISH);
            try {
             gun =EGun.valueOf(stringGun);
             kontrol=false;
            }catch (IllegalArgumentException e){
                System.out.println("Hata olustu:" +e.toString());
                kontrol=true;
            }

        }while (kontrol);

            return  gun;
    }
    /*
    yuk olustur meotdu bize optional<Yuk> donecek
    tarih belirle agırlık belirle
    daha sonra tarih eger bunlarda hata yoksa yuk olusturulup geri donucelek hata varsa boş optional donulecek;
     */

    public Optional<Yuk> yukOlustur(){
        Yuk yuk=null;
        try {
            String isim=Utility.stringDegerAlma("Lütfen yuk ismini giriniz");
            MyDate date=tarihBelirle();
            double agirlik=agirlikBelirle();
            yuk=new Yuk(isim,agirlik,date);
        }catch (LimanException e){
            System.out.println("hata olustu: " +e.toString());
        }catch (Exception e){
            System.out.println("Beklenmeyen bir hata olustu: "+e.toString());
        }
        return Optional.ofNullable(yuk);
    }
    /*
        once bir yuk yeri secimi yapacagız ==> yukYeriSec2
        daha sonra bir yuk Olusturacagız==>yukOlustur()
        eger bu yuk var ise yukunuz kabul olmustur eger bu yuk yoksa yukunuz kabul olmamıstır cıktısını verelim

     */
    public  void  yukKabul(){
        int index=-1;
        index=yukYeriSec2();
        Optional<Yuk> yuk=yukOlustur();
        if (yuk.isEmpty()){
            System.out.println("Yukunuz Kabul olmamıştır");
        }else{
            System.out.println("Yukunuz Kabul olmuştur===>"+yuk.get().getIsim());
            System.out.println("Yukunuz Kabul olmuştur===>"+yuk.map(x->x.getIsim()));
            liman.getYukler()[index]=yuk.get();
        }

    }
    public static void main(String[] args) {
        Uygulama uygulama=new Uygulama();
      //  uygulama.yukYeriSec(new Yuk("Yuk3",5000,System.currentTimeMillis(),EGun.PERSEMBE));
      //  uygulama.yukYeriSec2();
       // System.out.println(uygulama.tarihBelirle()); ;
     //   System.out.println(uygulama.yukOlustur());
        uygulama.yukKabul();
        uygulama.yukKabul();
        uygulama.yukKabul();
    }

}
