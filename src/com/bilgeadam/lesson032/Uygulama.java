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




 */
public class Uygulama {

    Liman liman;

    public Uygulama() {
        this.liman = new Liman();
        this.liman.getYukler()[0]=new Yuk("Hurda",11750,System.currentTimeMillis()-24*60*60*1000,EGun.CARSAMBA);
        this.liman.getYukler()[1]=new Yuk("Buğday",55000,System.currentTimeMillis()-2*24*60*60*1000,EGun.SALI);
    }

    public void   yukYeriSec(Yuk yuk){
        System.out.println("Boş Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
                if (liman.getYukler()[i]==null){
                    System.out.println((i+1)+". alanı secebilirsiniz");
                }
        }
        int index=Utility.intDegerAlma("Lütfen bir yuk alanı seciniz");
        if (liman.getYukler()[index]==null){
            liman.getYukler()[index]=yuk;
            System.out.println("işlem başarılı");
        }else{
            throw  new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
    }

    public static void main(String[] args) {
        Uygulama uygulama=new Uygulama();
        uygulama.yukYeriSec(new Yuk("Yuk3",5000,System.currentTimeMillis(),EGun.PERSEMBE));
    }

}
