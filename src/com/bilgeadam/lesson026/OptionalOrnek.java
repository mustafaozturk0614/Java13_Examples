package com.bilgeadam.lesson026;

import java.util.Optional;
import java.util.Scanner;

/*

    Urun sınıfında bir nesne yaratmak için urunyarat metodu yazalım
    bu metot bize optional bir urun donsun
    metodun için kullanıcadan bilgiler alacagız
    eger urun ismi  boş ise veya fiyat 0 ve 0dan kucuk ise bos bir optional eger değil ise optional urun donelim
 */
public class OptionalOrnek {

    public static Optional<Urun> urunYarat(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir urun ismi giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lütfen bir urun fiyatı giriniz");
        double fiyat=Double.parseDouble( scanner.nextLine()) ;
        if (fiyat<=0||isim.isBlank()){
            //Optional.empty();
            return Optional.ofNullable(null);
        }
            return Optional.of(new Urun(fiyat,isim));
    }
    public static Optional<Urun> urunYarat2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir urun ismi giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lütfen bir urun fiyatı giriniz");
        double fiyat=Double.parseDouble( scanner.nextLine()) ;
        Urun urun;
        if (fiyat<=0||  isim.isBlank()){
            urun=null;
        }else {
            urun=new Urun(fiyat,isim);
        }
        return Optional.ofNullable(urun);
    }


    public static void main(String[] args) {
        Optional<Urun> urun1=urunYarat();

        Optional<Urun> urun2=urunYarat2();
        System.out.println(urun1);
        System.out.println(urun2);
        //eger urun varsa urun ismini yazdırsın yoksa urun bulunamadı yazdırsın
        if (urun1.isPresent()){
            System.out.println(urun1.get().isim);
        }else {
            System.out.println("urun bulunmadı");
        }

        if (urun2.isPresent()){
            System.out.println(urun2.get().isim);
        }else {
            System.out.println("urun bulunmadı");
        }

        urun2.ifPresent(System.out::println);
        urun1.ifPresentOrElse(System.out::println,()-> System.out.println("urun bulunamadı"));
      Urun urun3;
        //  xx,10
        urun3=urun2.orElse(new Urun(10,"xx"));
        System.out.println(urun3);

    }

}
