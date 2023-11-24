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
            sehirManager.bolgeAta(sehir);
          //  sehir.setIsim(Database.iller[i]);
            list.add(sehir);
        }

    }

    // nufusu 5 000 000 dan fazla olan illeri bir listeye toplayalım

    public ArrayList<Sehir> nufusuBesMilyondanFazlaOlanlar(ArrayList<Sehir> sehirler){
        ArrayList<Sehir> yeniListe=new ArrayList<>();
        for (int i = 0; i <sehirler.size() ; i++) {
            if (sehirler.get(i).getNufus()>5000000){
                yeniListe.add(sehirler.get(i));
            }
        }
        return  yeniListe;
    }

    // 1 önceki metoddan donen(nufusuBesMilyondanFazlaOlanlar)
    // listede {Ankara,Bolu,Amasya} illeri varmı yok mu  geri donen bir metot yazalım
    public  boolean listedeVarMi(){
        ArrayList<Sehir> yeniListe=new ArrayList<>(List.of(list.get(5),list.get(4),list.get(13)));
        list.get(5).setNufus(6000000);
       list.get(4).setNufus(6000000);
        list.get(13).setNufus(6000000);
        if (nufusuBesMilyondanFazlaOlanlar(list).containsAll(yeniListe)){
            return  true;
        }else {
            return  false;
        }
    }

    public  boolean listedeVarMi2(){
        ArrayList<String> yeniListe=new ArrayList<>(List.of("Ankara","Bolu","Amasya"));
        list.get(5).setNufus(6000000);
        list.get(4).setNufus(6000000);
        list.get(13).setNufus(6000000);
      ArrayList<Sehir>  sehirler=nufusuBesMilyondanFazlaOlanlar(list);
      ArrayList<String> liste2=new ArrayList<>();
      for (Sehir sehir:sehirler){
          liste2.add(sehir.getIsim());
      }
        if (liste2.containsAll(yeniListe)){
            return  true;
        }else {
            return  false;
        }

    }


    public static void main(String[] args) {
//        List<String> liste=new ArrayList<>(Arrays.asList(Database.iller));
//        System.out.println(liste);

        App app=new App();
        app.sehirleriOlustur();
      //  app.list.forEach(s-> System.out.println(s));



      // app.nufusuBesMilyondanFazlaOlanlar(app.list).forEach(System.out::println);  ;
       // app.nufusuBesMilyondanFazlaOlanlar(app.list).forEach(x-> System.out.println(x));  ;
        System.out.println(app.listedeVarMi2()); ;

    }
}
