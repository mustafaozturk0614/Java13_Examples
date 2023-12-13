package com.bilgeadam.lesson035.taksi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
    Taksilerimizin her biri thread olacak
    taksilerde id ,aldığımusteri sayısı, aldıgı musterilerin idsini tuanbir liste bekleme suresi gibi değişkenler olacak
    bekleme suremiz random bir değişken olacak 1000-5000 arasında
    birde duragımız olacak
    bu durakda taksilerimiz olacak
    birde musteri kuyrugumuz olacak( musteri id degerlerini tuttgunu varsayalım)
    Musteriler için ayrı bir sınıf yapmayacagız!!!
    uygumalmızda 100 tane musteri olustracagız
    ve 10 tane taksi
    bunlar için durak sınıfında musteriolustur() ve taksi olustur metotları yazalım
    musteri kuyrugu olusturken sırayla 1 den 100 e kadar id leri tuttugmuzu varsayalım

      kuyrugumuz bosalana kadar taksilerimiz kuyruktan musteri alacaklar

      1 taksi kuyruktan bir musteri nosunu kendi içinde tuttugu musteriıdleri listesine eklesin
      her musteri arasında beklem suresi kadarda beklesin
      1.nolu taksi 1. musterisini aldı==> museteri no==>2
      .
      .
      1. nolu taksi 5.mustersini aldı==> musteri no ==>8
      2.nolu taksi 15.mustersini aldı==> musteri no ==>28
        durakda musteri kalmayınca asagıdaki cıktıyı verelim
       1 nolu taksi toplamda 20 musteri aldı ve mesaisi sona erdi
       2 nolu taksi toplamda 18 musteri aldı ve mesaisi sona erdi




 */
public class Taksi implements Runnable {
    Random random;
    private  int id;
    private int musteriSayisi;
    private long beklemeSuresi;
    private List<Integer> musteriIdList;
    private Durak durak;

    public Taksi(int id,Durak durak) {
        this.id = id;
        this.durak=durak;
        this.musteriIdList=new ArrayList<>();
        this.random=new Random();
        this.beklemeSuresi=random.nextLong(1000,5001);
    }



    public Durak getDurak() {
        return durak;
    }

    public void setDurak(Durak durak) {
        this.durak = durak;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMusteriSayisi() {
        return musteriSayisi;
    }

    public void setMusteriSayisi(int musteriSayisi) {
        this.musteriSayisi = musteriSayisi;
    }

    public long getBeklemeSuresi() {
        return beklemeSuresi;
    }

    public void setBeklemeSuresi(long beklemeSuresi) {
        this.beklemeSuresi = beklemeSuresi;
    }

    public List<Integer> getMusteriIdList() {
        return musteriIdList;
    }

    public void setMusteriIdList(List<Integer> musteriIdList) {
        this.musteriIdList = musteriIdList;
    }

    @Override
    public String toString() {
        return "Taksi{" +
                "id=" + id +
                ", musteriSayisi=" + musteriSayisi +
                ", beklemeSuresi=" + beklemeSuresi +
                ", musteriIdList=" + musteriIdList +
                ", durak=" + durak +
                '}';
    }

    @Override
    public void run() {
        while (!this.durak.musteriler.isEmpty()){
            int musteriId=this.durak.musteriler.poll();
            musteriIdList.add(musteriId);
            musteriSayisi++;
            System.out.println(id+" nolu taksi "+musteriSayisi+". musterisini aldı ==> musteri no ==>"+musteriId);
            try {
                Thread.sleep(beklemeSuresi);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("===================================================================");
        System.out.println(id+" nolu taksi toplamda "+ musteriSayisi +" musteri aldı ve mesaisi sona erdi");

    }
}
