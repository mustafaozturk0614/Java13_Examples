package com.bilgeadam.lesson022.sehirApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
    Sehirlerimiziin isimleri plaka kodları nufusları ve bolgeleri olsun
    Sehirmanager diye bir sınıfmıız olsun bu sınıf bizim için sehir sınıfn yoneten bir sınıf olacak
    burda sehir sınıfını yoneten metotlar yazacagız
    plaka kodu uret metodumuz olsun==>
    Sehir manager sınıfımızda

    uygulama sınıfımızda bir şehirler listem olsun
    sehirleri olustur metodumuz olsun bu metot  dısarıdan bir arraylist alsın
    ve databaseden gelen String sehirler arrayındeki verilerle bu listeyi dolduralım (Sehir Listesi)


1- bölgelerimiz  1.bölge 2.bölge 3.bölge  ve 4.bölge olsun

 */
public class App {
   ArrayList<Sehir> list;
   SehirManager sehirManager;

    public App() {
        list=new ArrayList<>();
        sehirManager=new SehirManager();
    }

    //her gelen sehir isminden bir sehir olustrup listeye ekleyeceğim (şimdlik nufus bolge ve plaka kodları olmasın)
    public  void sehirleriOlustur(){
        for (int i = 0; i <Database.iller.length ; i++) {
            Sehir sehir=new Sehir(Database.iller[i]);
            sehirManager.randomNufusAta(sehir);
            sehirManager.plakaKoduAta(sehir,i+1);
          //  sehir.setIsim(Database.iller[i]);
            list.add(sehir);
        }

    }

    public static void main(String[] args) {
//        List<String> liste=new ArrayList<>(Arrays.asList(Database.iller));
//        System.out.println(liste);

        App app=new App();
        app.sehirleriOlustur();
        app.list.forEach(s-> System.out.println(s));

    }
}
