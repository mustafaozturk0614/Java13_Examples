package com.bilgeadam.lesson022.sehirApp;
import java.text.Collator;
import java.util.*;

/*
   COMPARATOR KULLANIMI İLE İLGİLİ ORNEKLER
 */
public class App2 {
   ArrayList<Sehir> list;
   SehirManager sehirManager;

    public App2() {
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

    // kucukten buyuge sıralama
    public ArrayList<Sehir> nufusaGoreSırala(ArrayList<Sehir> liste){
//        List<String> stringList=new ArrayList<>();
//        Collections.sort(stringList);
        // bu metot ozelinde sıralama olusturmak için bir comparatore ıhtıyacım var
        Comparator<Sehir> comparator=new Comparator<Sehir>() {
            @Override
            public int compare(Sehir sehir1, Sehir sehir2) {
                return (int) (sehir1.getNufus() -sehir2.getNufus());
            }
        };
        Collections.sort(liste,comparator);
        return  liste;
    }

    /// a dan zye
    public ArrayList<Sehir> ismeGoreAdanZyeSırala(ArrayList<Sehir> liste){

//        Comparable<Sehir> comparable=new Comparable<Sehir>() {
//            @Override
//            public int compareTo(Sehir o) {
//                return 0;
//            }
//        };
        Collator collator=Collator.getInstance();
        Comparator<Sehir> comparator= new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return o1.getIsim().compareTo(o2.getIsim());
            }
        };
        Collections.sort(liste,comparator);
        return  liste;
    }

    public ArrayList<Sehir> ismeGoreZdenAyaSırala(ArrayList<Sehir> liste){
//        Comparator<Sehir> comparator= new Comparator<Sehir>() {
//            @Override
//            public int compare(Sehir sehir1, Sehir sehir2) {
//                return sehir1.getIsim().compareTo(sehir2.getIsim());
//            }
//        };
      //  Collator collator=Collator.getInstance();

        Collections.sort(liste, (sehir1,sehir2)-> sehir2.getIsim().toUpperCase(Locale.ROOT).compareTo(sehir1.getIsim().toUpperCase(Locale.ROOT)));
        return  liste;
    }
    public static void main(String[] args) {
        App2 app=new App2();
        app.sehirleriOlustur();
        /*
   COMPARATOR KULLANIMI İLE İLGİLİ ORNEKLER
 */
      //  app.list.forEach(System.out::println);
        //sehir-> System.out.println(sehir) lambda fonksiyon

       // Collections.shuffle(app.list);
      //  app.list.forEach(sehir-> System.out.println(sehir));
        //nufusa gore sıralama yapacagız
//     ArrayList<Sehir>  sehirler= app.nufusaGoreSırala(app.list);
//     sehirler.forEach(System.out::println);
//     // isme gore sıralama
//        System.out.println("////////////////////////////////");
//        ArrayList<Sehir>  sehirler2= app.ismeGoreAdanZyeSırala(app.list);
//        sehirler2.forEach(System.out::println);
//        System.out.println("////////////////////////////////");
//        ArrayList<Sehir>  sehirler3= app.ismeGoreZdenAyaSırala(app.list);
//        sehirler3.forEach(System.out::println);
        //plaka koduna gore
//        ArrayList<Sehir>  sehirler4= app.plakaKodunaGoreSırala(app.list);
//        sehirler4.forEach(System.out::println);
//  Collections.shuffle(app.list);
        ArrayList<Sehir>  sehirler5= app.bolgeyeGoreSıralama(app.list);
        sehirler5.forEach(System.out::println);
    }

    private ArrayList<Sehir> plakaKodunaGoreSırala(ArrayList<Sehir> liste) {
        Comparator<Sehir> comparator=new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return  o1.getPlakaNo().compareTo(o2.getPlakaNo());
            }
        };
        Collections.sort(liste,comparator);
        return  liste;
    }
    private ArrayList<Sehir> bolgeyeGoreSıralama(ArrayList<Sehir> liste) {
        Comparator<Sehir> comparator=new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return  o1.getBolge().ordinal()-o2.getBolge().ordinal();
            }
        };
        Collections.sort(liste,comparator);
        return  liste;
    }

}
