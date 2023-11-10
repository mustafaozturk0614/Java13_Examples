package com.bilgeadam.lesson020.abstractOrnek3;
/*
    1 Database sınıfımız var
     database sınıfı baglantı için username ve password degerleini barındırıyor
     ayrıca databsse sınıfımızın davranısları olarak

      veri ekle
      verisil
      veri guncelle
      verileri getir
       1- Databse ve gerekli alt sınıfları olsuturalım databeslerimizn metotlarını yazalım bu metotlar
   -her sınıfda farklı bir işlem gorecek şekilde dusunulmelidir;
bizim şirketimizde kullanılabilecek databselerde PostgreSlq MongoDb olsun
  2-     birde databseleri yoneten bir manger sınıfmız olsun
       bu manager sınıfnda databse e baglantı (login olalaım )
       ve bu sınıfımızda bir menu ile yukardaki işlemleri secelim
       1- veri ekle
       2-veri sil
       3-veri guncelle
       4-veri verileri getir
       0-Çıkış
     daha sonra bu menuden işlem sectiğimiz zaman bizim şirketimiz hangi databsei kullanıyorsa o databsein veriekle veri sil ....
     gibi metotlarından biri çalışacak
   App sınıfında bir databse sec metodu olsun ( dısarıdan String bir databse ismi alalım  ) kullanıcıya databse sectiriyoruz
   eger Postgre girmiş ise database manager postrgreyi yonetsin
   eger Mongo db girmiş ise mongoDbyi yonetsin
   önce app sınıfınn main metodunda secimi yapcagız daha sonra manager sınıfındaki calıstır metodunu calıstıracagız
   calıstır metodumuzda menumuz ve yişlem secimlerimiz olacak





 */
public class App {
}
