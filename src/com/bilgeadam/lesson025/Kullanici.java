package com.bilgeadam.lesson025;

import java.util.Objects;

public class Kullanici {

     static int kullaniciSayisi;
    private  String kullaniciAdi;
    private String şifre;
    private String email;
    private int yas;

    public Kullanici(String kullaniciAdi, String şifre, String email, int yas) {
        this.kullaniciAdi = kullaniciAdi;
        this.şifre = şifre;
        this.email = email;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "kullaniciAdi='" + kullaniciAdi + '\'' +
                ", şifre='" + şifre + '\'' +
                ", email='" + email + '\'' +
                ", yas=" + yas +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Kullanici kullanici = (Kullanici) o;
//        return yas == kullanici.yas && Objects.equals(kullaniciAdi, kullanici.kullaniciAdi) && Objects.equals(şifre, kullanici.şifre) && Objects.equals(email, kullanici.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(kullaniciAdi, şifre, email, yas);
//    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
