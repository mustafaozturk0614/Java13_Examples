package com.bilgeadam.lesson021.service;

import com.bilgeadam.lesson021.entity.Kullanici;
import com.bilgeadam.lesson021.repository.KullaniciRepository;
import com.bilgeadam.lesson021.utility.ICrud;

import java.util.List;

public class KullaniciServis implements ICrud {

    private KullaniciRepository kullaniciRepository;

    public KullaniciServis() {
        this.kullaniciRepository = new KullaniciRepository();
    }


    @Override
    public boolean kayitEt(Kullanici kullanici) {
     boolean kontrol=kullaniciRepository.kayitEt(kullanici);
     if (kontrol){
         System.out.println("Kullanıcı başarı ile kayıt edildi");
     }else{
         System.out.println("Kayıt sırasında hata meydana geldi");
     }
        return  kontrol;
    }

    @Override
    public List<Kullanici> kullaniclariGetir() {
        List<Kullanici> kullanicilar= kullaniciRepository.kullaniclariGetir();
        if (kullanicilar.size()==0){
            System.out.println("Herhangi bir kullanıcı bulunamadı");
        }
        return kullanicilar;
    }

    @Override
    public void sil(int id) {

    }

    @Override
    public void guncelle(int id) {

    }

    public  Kullanici kullanıciAdiveSifreIleKullanıciGetir(String username, String password){
        Kullanici kullanici=kullaniciRepository.kullanıciAdiveSifreIleKullanıciGetir(username,password);
        if (kullanici==null){
            System.out.println("Kullanıcı adı veya şifre hatalı");
        }else{
            System.out.println("Giriş başarılı Hoşgeldiniz====>"+kullanici.getUsername());
        }
        return  kullanici;
    }

    public  Kullanici kullanıciAdiIleKullanıciGetir(String username){
        Kullanici kullanici=kullaniciRepository.kullanıciAdiIleKullanıciGetir(username);
        if (kullanici!=null){
            System.out.println("Boyle bir kullanıcı ismi daha once kayıt edilmiştir");
        }
        return kullanici;
    }

    public  void   baslangicVerisiOlustur(){
        kullaniciRepository.baslangicVerisiOlustur();
    }
}
