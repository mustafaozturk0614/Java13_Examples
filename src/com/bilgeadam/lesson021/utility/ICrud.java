package com.bilgeadam.lesson021.utility;

import com.bilgeadam.lesson021.entity.Kullanici;

import java.util.List;

// kullanıcı için yaptıgımız bir interface
public interface ICrud {
    boolean kayitEt(Kullanici kullanici);
    List<Kullanici> kullaniclariGetir();
    // kullanıcı adı,id
    void sil(int id);
    void  guncelle(int id);


}
