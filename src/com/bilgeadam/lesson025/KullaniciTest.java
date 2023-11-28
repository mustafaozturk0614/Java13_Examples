package com.bilgeadam.lesson025;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KullaniciTest {

    Set<Kullanici> kullanicilar;
    Set<String> kullaniciAdlari;


    public KullaniciTest() {
        this.kullanicilar = new HashSet<>();
        this.kullaniciAdlari=new TreeSet<>();
        this.kullanicilar.add(new Kullanici("yk1","123","yk1@gmail.com",25));
        this.kullanicilar.add(new Kullanici("yk2","123","yk2@gmail.com",35));
        this.kullanicilar.add(new Kullanici("yk3","123","yk3@gmail.com",28));
        this.kullanicilar.add(new Kullanici("yk4","123","yk4@gmail.com",32));
        this.kullaniciAdlari.add("yk1");
        this.kullaniciAdlari.add("yk2");
        this.kullaniciAdlari.add("yk3");
        this.kullaniciAdlari.add("yk4");
    }

    public void  kullaniciEkle(){
        Kullanici kullanici1=new Kullanici("yk4","123","yk4@gmail.com",32);
        Kullanici kullanici2=new Kullanici("yk5","123","yk5@gmail.com",36);
        Kullanici kullanici3=new Kullanici("yk6","123","yk6@gmail.com",21);
        Kullanici kullanici4=kullanici1;
        System.out.println(kullanicilar.add(kullanici1));    ;
        kullanicilar.add(kullanici2);
        kullanicilar.add(kullanici3);
        System.out.println(kullanicilar.add(kullanici4));    ;
        this.kullaniciAdlari.add(kullanici1.getKullaniciAdi());
        this.kullaniciAdlari.add(kullanici2.getKullaniciAdi());
        this.kullaniciAdlari.add(kullanici3.getKullaniciAdi());
    }

    public  void kullaniciEkle2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adı giriniz");
        String kullaniciAdi=scanner.nextLine();
        System.out.println("Lütfen şifre giriniz");
        String sifre=scanner.nextLine();
        System.out.println("Lütfen email giriniz");
        String email=scanner.nextLine();
        System.out.println("Lütfen yasınızı giriniz");
        int yas=Integer.parseInt(scanner.nextLine());
        Kullanici yeniKullanici=new Kullanici(kullaniciAdi,sifre,email,yas);
        boolean kontrol=false;
        for (Kullanici kullanici :kullanicilar){
            kontrol=false;
            if (kullanici.getKullaniciAdi().equals(yeniKullanici.getKullaniciAdi())){
                System.out.println("Daha once eklenmiş");
                break;
            }else{
                kontrol=true;
            }
        }
        if (kontrol){
            kullanicilar.add(yeniKullanici);
        }

    }
    public  void kullaniciEkle3(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adı giriniz");

        String kullaniciAdi=scanner.nextLine();
        while (!kullaniciAdlari.add(kullaniciAdi)){
            System.out.println("Kullanici adı daha once eklenmiştir lütfen yeni bir kulalnıcı adı giriniz");
            kullaniciAdi=scanner.nextLine();
        }
        System.out.println("Lütfen şifre giriniz");
        String sifre=scanner.nextLine();
        System.out.println("Lütfen email giriniz");
        String email=scanner.nextLine();
        System.out.println("Lütfen yasınızı giriniz");
        int yas=Integer.parseInt(scanner.nextLine());
        Kullanici yeniKullanici=new Kullanici(kullaniciAdi,sifre,email,yas);
        kullanicilar.add(yeniKullanici);
    }
    public static void main(String[] args) {
    KullaniciTest kullaniciTest=new KullaniciTest();
    kullaniciTest.kullaniciEkle3();
    kullaniciTest.kullanicilar.forEach(x-> System.out.println(x.getKullaniciAdi()+"-"+x.hashCode()));

    }
}
