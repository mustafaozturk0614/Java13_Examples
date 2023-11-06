package com.bilgeadam.lesson015.kutuphaneApp;



import java.util.Scanner;

/*
    1- Kutuphanemiz olacak kutuphaneyi (database gibi dusuneceğiz)
       //uygulamada tek bir kutuphane olacak kutuphane nesnesi olsutramayacagız
    2- Kitaplarımız olacak
    3- Yazarlarmız olacak

    4- app sınıfımızda bir menu olusturacagız===>
       1-Kitap Ekle
       2-Kitap Çıkar
       3-Kitapları Listele
       4-KitapBul( kitap ismine gore kita bulacagız)
       5-Yazar İsmine gore kitapları bul
       0-Çıkış;

    5- bir işlem secip bize geri donen bir metot yazalım

    6- uygulamyıBaslat metodumuz ==> butun işlemler bu metotda yapılacak
      ==> sectiğimiz işleme göre o işlem yapılacak
      kullanıcı dısarıdan bir iselem sececek
      ve o işlem gerceklescek
      daha sonra menuye tekrar donulecek
      eğer kullanıcı cıkısa basmadıyda bu işlemler tekrarlanacak
      kullanıcı çıkış işlemini seçiş ise program sonlanacak
      şimdilik çıktılarımız şöyle olsun
      1. işlemi sectiği zman console a şu cıktıyı yazdıralım => Kitap eklendi
      2. işlemi sectiği zman console a şu cıktıyı yazdıralım => Kitap çıkarıldı
      3. işlemi sectiği zman console a şu cıktıyı yazdıralım => Kitaplar listelendi
      ... gibi çıktılar verelim

     7- bu sınıfta kitapbilgilerini gir adlı bir metot yazalım
     bu metot dısarıdan gerekli kitap bilgileri alıp bir kitap olustursun
     8- kitapları gir metodunda olusturdugumuz kitabı kutuphaneMAnager sınıfında olusturcagımız kitap ekle metoduna gonderelim
        daha sonra kitapEkle metodunda gelen kitabı kutuphandeki kitaplar arrayine ekleyelim

    9 - app sınıfında bir kitapListele metodu olsun o metot bize
    kutuphane managerda olusturdugumuz kitaplarıGetir metodundan donen arrayı yazdırsın

    10- Kitap bul metodu yazacagız
    ==> APP deki metot ==> burda dısarıdan bir kitap ismi alan bir metot tasarlayacagız
    bu metot
      ===>KutuphaneMAnagerdaki metot==>  kutuphane managerla iletşime geçip kitaplar arayinde bu kitap varmı diye kontrol edecek
    eger var ise kitabı donsun yok ise null donsun
    APP deki metot dun devamı===>   daha sonra eger kitap var ise kitabbilgileri goster metodu calıssın  eger yok ise kitap bulunamadı

    11- Kitap ismine gore arayimizden kitabı sileceğiz
     ==> App sınıfında kitapCıkar diye bir metot yazalım ve bu kullanıcıdan bir kitap ismi alsın
        daha sonra o kitap varmı diye kontrol etsin varsa  kitaplar arayinden silen metoda gitsin
        yoksa kitap bulunamadı çıktısı //

 */
public class App {
    Scanner scanner=new Scanner(System.in);
    KutuphaneManager kutuphaneManager=new KutuphaneManager();

// Alternatif manager olusturma yontemi
//    public  KutuphaneManager getKutuphaneManager(){
//        if (kutuphaneManager==null){
//            kutuphaneManager=new KutuphaneManager();
//        }
//        return  kutuphaneManager;
//    }



    public void menu(){
        System.out.println("=====Kütüphane Uygulaması=====".toUpperCase());
        System.out.println("1-Kitap Ekle");
        System.out.println("2-Kitap Çıkar");
        System.out.println("3-Kitapları Listele");
        System.out.println("4-Kitap Bul( İsme göre)");
        System.out.println("5-Yazar ismine Göre Kitapları Bul");
        System.out.println("0-Çıkış");
    }
    public int secimYap(){
        System.out.println("Lütfen bir seçim yapınız");
        int secim= scanner.nextInt();
        scanner.nextLine();
        return  secim;
    }
    public  void  uygulamayiBaslat(){
        int secim;
        do {
            menu();
            secim=secimYap();
            switch (secim){
                case 1:
                    kitapBilgileriniGir();
                    break;
                case 2:
                    kitapÇıkar();
                    break;
                case 3:
                    kitaplariListele();
                    break;
                case 4:
                   kitapBul();
                    break;
                case 5:
                    System.out.println("Yazar ismine göre Kitaplar bulunud");
                    break;
                case 0:
                    System.out.println("Program sonlanıyor .....");
                    break;
                default:
                    System.out.println("Lütfen Geçerli bir secim yapınız");
                    break;
            }
        }while (secim!=0);

    }

    public void kitapBilgileriniGir(){
        Kitap kitap=new Kitap();
        System.out.println("Lütfen bir kitap ismi giriniz");
        kitap.ad =scanner.nextLine();
        System.out.println("Lütfen kitap türünü giriniz");
        kitap.tur=scanner.nextLine();
        System.out.println("Lütfen bir yazar ismi giriniz");
        kitap.yazarIsmi= scanner.nextLine();
        System.out.println("Lütfen sayfa sayisi giriniz");
        kitap.sayfaSayisi= scanner.nextInt();
        kitap.id=Kutuphane.kitapIndex+1;
        kutuphaneManager.kitapEkle(kitap);
//        Kutuphane.kitapIndex++;
//        Kutuphane.kitaplar[Kutuphane.kitapIndex]=kitap;
    }

    public  void  kitaplariListele(){
    Kitap[]  kitaplar =kutuphaneManager.kitaplariGetir();
    for (Kitap kitap :kitaplar){
        if (kitap!=null){
            kitap.bilgileriGoster();
        }else{
            System.out.println("null");
        }

    }
        System.out.println("///////////2.metot///////////////");
//        for (int i = 0; i <Kutuphane.kitapIndex; i++) {
//          kitaplar[i].bilgileriGoster();
//        }
    }

    public  Kitap kitapBul(){
        System.out.println("Lütfen bir kitap ismi giriniz");
        String kitapIsmi= scanner.nextLine();
        Kitap kitap= kutuphaneManager.kitapVarmi(kitapIsmi);
        if ( kitap!=null){
            kitap.bilgileriGoster();
        }else{
            System.out.println("Aradığınız kitap bulunamadı");
        }
        return  kitap;
    }

    public  void kitapÇıkar(){
        System.out.println("Lütfen bir kitap ismi giriniz");
        String kitapIsmi= scanner.nextLine();
        int index= kutuphaneManager.kitapVarmi2(kitapIsmi);
        if ( index!=-1){
            // silme işlemine gideceğiz
            KutuphaneManager.kitapSil2(index);
        }else{
            System.out.println("Aradığınız kitap bulunamadı");
        }
    }

    public  void kitapÇıkar2(){
       Kitap kitap=kitapBul();
       if (kitap!=null){
           // silme işlemi
           KutuphaneManager.kitapSil(kitap);
       }else{
           System.out.println("Aradığınız kitap bulunamadı");
       }
    }

}
