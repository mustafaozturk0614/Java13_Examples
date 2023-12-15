package com.bilgeadam.lesson037.designPatterns.factoryPattern.pizzaApp;
/*
    Bir Pizza siparis uygulaması
    kullanıcı dısardan Pizzanın
    hamur tipini
    boyutunu
    turunu daha sonra bunu bir factory sınıfı uzerinden pizza olusturup bize donmesini bekliyoruz

    Pizza ==> hamur tipi==>ince normal,kalın  boyutu==>kucuk orta buyuk    turu==> Akdeniz,Karısık,TonBalıkllı
    pizzamızında ikitane alt sınıf olsun

        hamurTipiSec metoduyazalım==> kullanıcıya hamur tiplerini gosterecek 1-İnce 2-Normal -3-Kalın
        kullanıcı secimine gore bir hamur tipi deonecek

 */
public class PizzaSiparis {

    public  EHamurTipi hamurTipiSec(){
        for (EHamurTipi hamurTipi:EHamurTipi.values()){
            System.out.println((hamurTipi.ordinal()+1)+"-"+hamurTipi);
        }
      int index=Utility.intDegerAlma("Lütfen bir hamur tipi seciniz")-1;
        return EHamurTipi.values()[index];
    }
    public  ETur turSec(){
        for (ETur tur:ETur.values()){
            System.out.println((tur.ordinal()+1)+"-"+tur);
        }
        int index=Utility.intDegerAlma("Lütfen bir tur seciniz")-1;
        return ETur.values()[index];
    }
    public  EBoyut boyutSec(){
        for (EBoyut boyut:EBoyut.values()){
            System.out.println((boyut.ordinal()+1)+"-"+boyut);
        }
        int index=Utility.intDegerAlma("Lütfen bir boyut seciniz")-1;
        return EBoyut.values()[index];
    }

    public Pizza pizzaSec(){
        EBoyut boyut=boyutSec();
        EHamurTipi hamurTipi=hamurTipiSec();
        ETur tur=turSec();
        return PizzaFactory.pizzaOlustur(tur,hamurTipi,boyut);
    }

    public void menu(){
        System.out.println("Pizza Sipariş Menusu");
        Pizza pizza=pizzaSec();
        siparisHazirlama(pizza);
    }

    public void siparisHazirlama(Pizza pizza) {
        System.out.println("Sipraziniz hazırlanıyor detayları: ");
        System.out.println(pizza);

    }

}
