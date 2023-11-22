package com.bilgeadam.lesson021.repository;

import com.bilgeadam.lesson021.entity.Kullanici;
import com.bilgeadam.lesson021.utility.Database;
import com.bilgeadam.lesson021.utility.ICrud;

import java.util.List;

public class KullaniciRepository  implements ICrud {
    @Override
    public boolean kayitEt(Kullanici kullanici) {
        kullanici.setId(Database.index+1);
        Database.kullanicilar.add(kullanici);
        Database.index++;
        return  true;
    }

    @Override
    public List<Kullanici> kullaniclariGetir() {
      //  Kullanici [] kullaniciListesi=new Kullanici[Database.index];
//        for (int i = 0; i <Database.index ; i++) {
//            kullaniciListesi[i]=Database.kullanicilar[i];
//        }
        return Database.kullanicilar;
    }

    @Override
    public void sil(int id) {

    }

    @Override
    public void guncelle(int id) {

    }

    public  Kullanici kullanıciAdiveSifreIleKullanıciGetir(String username, String password) {
        for (int i = 0; i <Database.kullanicilar.size(); i++) {
            if (Database.kullanicilar.get(i).getUsername().equals(username)&&Database.kullanicilar.get(i).getPassword().equals(password)){
                return Database.kullanicilar.get(i);
            }
        }
        return  null;
    }

    public  Kullanici kullanıciAdiIleKullanıciGetir(String username) {
        for (int i = 0; i <Database.kullanicilar.size() ; i++) {
            if (Database.kullanicilar.get(i).getUsername().equals(username)){
                return Database.kullanicilar.get(i);
            }
        }
        return  null;
    }

    public  void   baslangicVerisiOlustur(){
        Kullanici kullanici1=new Kullanici( Database.index+1 ,"Mustafa","musty","123");
        Database.kullanicilar.add(kullanici1);
        Database.index++;
        Kullanici kullanici2=new Kullanici( Database.index+1, "Tuba","tuba","123");
        Database.kullanicilar.add(kullanici2);
        Database.index++;
        Kullanici kullanici3=new Kullanici( Database.index+1, "Mert","mert","123");
        Database.kullanicilar.add(kullanici3);
        Database.index++;
    }
}
