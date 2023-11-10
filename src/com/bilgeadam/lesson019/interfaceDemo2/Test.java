package com.bilgeadam.lesson019.interfaceDemo2;
/*
   Bir arac sınfımız olsun
   Daha sonra ucak otomobil komyon gemi gibi sınıflarımızıda olusturalım
   gerekirse bu sınıflara altsınıflar veya ust sınıflar olusturabilirsiniz
   hızlanma yavaslama gibi metotlarımız olsun
   kalkıs yap , iniş yap  yelkenac limana yanas  sur(karatasıtları için gecerli olsun) gibi metotlarımız olsun
    bazı araclar yuk tasıyabilsinler bunun icin yukal yuk bosalt metotları olsun
    bu uygulamyı olsuturrken özellikle interfaclerden yararlanalım
 test sınıfında bir yukAlma ve yukVerme metodu yazalım ;==>
yukAlma===> kamyon yuk aldı ,kargo ucagı yuk aldı  yuk gemisi yuk aldı
yukVerme===> kamyon yuku teslim etti ,kargo ucagı yuku teslim etti  yuk gemisi yuku teslim etti
 */
public class Test {
    public static void main(String[] args) {
        Gemi gemi=new Gemi();
        YukGemisi yukGemisi=new YukGemisi();
        Otomobil otomobil=new Otomobil();
        Ucak ucak=new Ucak();
        KargoUcagi kargoUcagi=new KargoUcagi();
        Kamyon kamyon=new Kamyon();
        IDenizTasiti denizTasiti=new Gemi();
        IDenizTasiti denizTasiti2=new YukGemisi();
        denizTasiti.yelkenAc();
        denizTasiti2.limanaYanas();
        gemi.yelkenAc();
        gemi.hizlan();
        gemi.limanaYanas();
        yukGemisi.yelkenAc();
        yukGemisi.hizlan();
        yukGemisi.yavasla();
        yukGemisi.yukAl();
        yukGemisi.yukBosalt();
        yukGemisi.limanaYanas();
        otomobil.sur();
        otomobil.hizlan();
        otomobil.yavasla();
        kargoUcagi.yukAl();
        kargoUcagi.kalkisYap();
        ucak.kalkisYap();
        ucak.inisYap();
        kamyon.sur();
        kamyon.hizlan();
        kamyon.yavasla();
        kamyon.yukAl();
        kamyon.yukBosalt();


//        yukAlma(otomobil);
//        yukAlma(gemi);
//        yukAlma(ucak);
        yukAlma(yukGemisi);
        yukAlma(kamyon);
        yukAlma(kargoUcagi);
        yukVerme(kargoUcagi);
    }


    public  static void yukAlma(IYuk tasit){
        tasit.yukAl();
    }


    public  static void yukVerme(IYuk tasit){
        tasit.yukBosalt();
    }


}
