package com.bilgeadam.lesson024;
/*
 * tabak sınıfımızda tabaklarımızın id sini ve kirli olup olmadıklarını tutalım
 *
 * daha sonra bir manager sınıfı olusturup
 * bu manager sınıfında 10 tane tabak uretelim ve kirli olup olmadıkları rastgele gelsin
 *
 * temizleri bir stackte kirlileri başka bir stackde tutatalım
 *
 * kullan metodu olusturalım ==> temizler stack inden bir tabak alıp kirleteceğiz
 * temizle metodu olustulaım==> kirliler stack inden bir tabak alıp temizleyeceğiz
 *
 */

public class Tabak {
    private int id;
    private boolean kirliMi;

    public Tabak(int id) {
        this.id = id;
    }

    public Tabak(int id, boolean kirliMi) {
        this.id = id;
        this.kirliMi = kirliMi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isKirliMi() {
        return kirliMi;
    }

    public void setKirliMi(boolean kirliMi) {
        this.kirliMi = kirliMi;
    }

    @Override
    public String toString() {
        return "Tabak{" +
                "id=" + id +
                ", kirliMi=" + kirliMi +
                '}';
    }
}
