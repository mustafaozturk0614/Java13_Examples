package com.bilgeadam.lesson021.utility;

import com.bilgeadam.lesson021.entity.Kullanici;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Database {
   // public  static  Kullanici[] kullanicilar=new Kullanici[15];

    public  static List<Kullanici> kullanicilar=new ArrayList<>();


    public static  int index;




//    public static void   baslangicVerisiOlustur(){
//        Kullanici kullanici1=new Kullanici( index+1 ,"Mustafa","musty","123");
//        kullanicilar[index]=kullanici1;
//        index++;
//        Kullanici kullanici2=new Kullanici( index+1, "Tuba","tuba","123");
//        kullanicilar[index]=kullanici2;
//        index++;
//        Kullanici kullanici3=new Kullanici( index+1, "Mert","mert","123");
//        kullanicilar[index]=kullanici3;
//        index++;
//    }


//    public static boolean kullanciEkle(Kullanici kullanici) {
//            kullanici.setId(index+1);
//            kullanicilar[index]=kullanici;
//            index++;
//            return  true;
//    }

//    public static Kullanici kullanıciAdiveSifreIleKullanıciGetir(String username, String password) {
//        for (int i = 0; i <index ; i++) {
//            if (kullanicilar[i].getUsername().equals(username)&&kullanicilar[i].getPassword().equals(password)){
//                return kullanicilar[i];
//            }
//        }
//            return  null;
//    }
//
//    public static Kullanici kullanıciAdiIleKullanıciGetir(String username) {
//        for (int i = 0; i <index ; i++) {
//            if (kullanicilar[i].getUsername().equals(username)){
//                return kullanicilar[i];
//            }
//        }
//        return  null;
//    }

//    public static Kullanici[] kullanicilariGetir() {
//     Kullanici [] kullaniciListesi=new Kullanici[index];
//        for (int i = 0; i <index ; i++) {
//            kullaniciListesi[i]=kullanicilar[i];
//        }
//        return kullaniciListesi;
//    }
}
