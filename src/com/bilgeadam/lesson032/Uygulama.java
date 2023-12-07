package com.bilgeadam.lesson032;
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
        int index=Utility.intDegerAlma("Lütfen bir yuk alanı seciniz");
        boolean kontrol=false;
            if (index>liman.getAlanSayisi()||index<0){
                throw new LimanException(ErrorType.SINIRLAR_DISINDA);
            }
            if (liman.getYukler()[index]!=null){
                throw new LimanException(ErrorType.DOLU_YER_SECIMI);
            }
            return index;
    }

    public  double agirlikBelirle(){
        double agirlik=Utility.doubleDegerAlma("Lütfen yukunuzun agırlıgını giriniz");
        if (agirlik<250){
            throw  new LimanException(ErrorType.YETERSIZ_AGIRLIK);
        }
        return  agirlik;
    }
    public static void main(String[] args) {
        Uygulama uygulama=new Uygulama();
      //  uygulama.yukYeriSec(new Yuk("Yuk3",5000,System.currentTimeMillis(),EGun.PERSEMBE));
      //  uygulama.yukYeriSec2();
        System.out.println(uygulama.agirlikBelirle()); ;
    }

}
