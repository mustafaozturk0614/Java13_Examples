package com.bilgeadam.lesson010;

import java.util.Arrays;
import java.util.Scanner;

/*
        1- dısarıdan girilen harfle baslayan illeri yazdıralım;
        2- illeri plaka kodları ile yazdıralım 01-Adana  02-Adıyaman .....

        3- girdiğimiz sehrin ismine gore plaka kodu donen metot yazalım
        4-ilk harf haric sesli harflari slip yazdıran bir fonksiyon yazalım ( bir arraye atayalım) ==>Adn ,Adymn
        5-bir onceki metotdan donen degerlerin ilk uc harfini alsın ve sonuna ...(üç tane nokta eklesin)
         Adn... Ady...
        6-bir onceki metotdan donen dizide B ile baslayan illerin basına sıra no 1-Blk 2-Blc 3-Bng
        7-ikinci harfi a olanların sadce ilk 3 harfini buyuk yazdırın (Çankırı==>ÇAN,manisa===>MAN)
          ÇAN
          MAN



 */
public class Question48 {


    public static void main(String[] args) {
        String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
                "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
                "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
                "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
                "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
                "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
                "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
                "Kilis", "Osmaniye", "Düzce" };
       // ilBul(iller);
      //  plakaSehirYazdır(iller);
      //  ileGorePlakaKodu(iller,"Batman");
      String [] array  =sesliHarfleriSil3(iller);
        //  ;
        String [] array2=   kisaltma(array);
       // bIleBaslayanlar(array2);
       // bIleBaslayanlar2(array2);
        System.out.println(Arrays.toString(ilkUcHarf(iller)));
    }

    //2.soru
    public static void  plakaSehirYazdır(String [] dizi){
//        for (int i = 0; i < dizi.length ; i++) {
//            //01-Adana
//            if (i<9){
//                System.out.println("0"+(i+1)+"-"+dizi[i]);
//            }else{
//                System.out.println(i+1+"-"+dizi[i]);
//            }
//        }
        int sayi=1;
        for (String il:dizi){
            if (sayi<10){
               System.out.println("0"+sayi+"-"+il);
           }else{
                System.out.println(sayi+"-"+il);
           }
            sayi++;
        }
    }

    //1.soru
    public static void ilBul(String [] myString){
      //  String []  sonuc= new String[myString.length];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String harf= scanner.nextLine();
      //  int sayac=0;
        System.out.println(harf.toUpperCase().substring(0,1)+" ile başlayan iller");
        for(String il: myString){
            if (il.startsWith(harf.toUpperCase().substring(0,1))){
                System.out.println(il);
               // sonuc[sayac]=il;
              //   sayac++;
            }
        }
       // return  sonuc;
    }

    //3.soru

    public  static void ileGorePlakaKodu(String [] array,String il){
        boolean kontrol=false;
        for (int i = 0; i <array.length ; i++) {
            if (il.equalsIgnoreCase(array[i])){
                System.out.println(i+1);
               kontrol=true;
                break;
            }
        }

        if (!kontrol){
            System.out.println("Aradığınız il bulunamadı");
        }
    }

    // 4.soru 1.çözüm
    public  static  String [] sesliHarfleriSil(String [] dizi){

        String [] sessiz=new String[dizi.length];
       // String [] sesli={"a","e","ı","i","o","ö","u","ü"};
        int i=0;
        for (String kelime:dizi) {
            String yeniKelime=kelime.replaceAll("[aeıioöuü]","");
            sessiz[i]=yeniKelime;
            i++;
        }
       return sessiz;
    }

    // 4. soru 2.çözüm
    public  static  String [] sesliHarfleriSil2(String [] dizi){

        String [] sessiz=new String[dizi.length];
         String [] sesli={"a","e","ı","i","o","ö","u","ü"};
         String metin="";
        for (int i = 0; i < dizi.length ; i++) {
            boolean varMi=false;
            metin="";
            metin+=dizi[i].substring(0,1);
            for (int j = 1; j <dizi[i].length() ; j++) {
                for (int k = 0; k < sesli.length ; k++) {
                    if (dizi[i].substring(j,j+1).equalsIgnoreCase(sesli[k])){
                        varMi=true;
                        break;
                    }else {
                        varMi=false;
                        continue;
                    }
                }

                if (varMi==false){
                    metin+=dizi[i].substring(j,j+1);
                }
                sessiz[i]=metin;
            }

        }
        return sessiz;
    }

    //.soru4 3.çözüm
    public  static  String [] sesliHarfleriSil3(String [] dizi){
        String [] sessiz=new String[dizi.length];
        String [] sesli={"a","e","ı","i","o","ö","u","ü"};
        String metin="";
        for (int i = 0; i < dizi.length ; i++) {
            metin=dizi[i];
            for (int j = 0; j <sesli.length ; j++) {
                if (dizi[i].contains(sesli[j])){
                    metin=metin.replace(sesli[j],"");
                    sessiz[i]=metin;
                }
            }
        }
        return sessiz;
    }
// 5.soru
    public  static  String [] kisaltma(String[] array){
        String [] yeniString=new String [array.length];
        int sayac=0;
        for(String ifade:array){
            if (ifade.length()>=3){
                yeniString[sayac]=ifade.substring(0,3)+"...";
            }else {
                yeniString[sayac]=ifade+"...";
            }
            sayac++;
        }
        return  yeniString;
    }
    // 6.Soru 1.çözümü
    public  static  void  bIleBaslayanlar(String [] dizi){
        //Blk...
        int sayac=1;
        for (int i = 0; i < dizi.length ; i++) {
               if( dizi[i].startsWith("B")){
                   if(dizi[i].indexOf(".")<3){
                       System.out.println(sayac+"-"+dizi[i].substring(0,2));
                   }else{
                       System.out.println(sayac+"-"+dizi[i].substring(0,3));
                   }
                   sayac++;
               }
        }



    }
 // 6.Soru 2.çözümü
    public  static void bIleBaslayanlar2(String [] dizi){
        int sayac=1;
        for (String il:dizi){
            if( il.startsWith("B")){
                System.out.println(sayac+"-"+il.replace(".",""));
                sayac++;
            }
        }
    }

    ///7.soru çözümü
    public  static  String [] ilkUcHarf(String [] array){
        String metin="";
        for (int i = 0; i < array.length ; i++) {
            if (array[i].charAt(1)=='a'){
              //  metin+=array[i].replace(array[i].substring(0,3),array[i].substring(0,3).toUpperCase()).substring(0,3)+" ";
                metin+=array[i].substring(0,3).toUpperCase()+" ";
            }
        }
        metin=metin.strip();
        String [] yeniDizi=metin.split(" ");
        return yeniDizi;
    }

    ///7.soru 2.çözümü
    public  static  void  ilkUcHarf2(String [] array){
        for (int i = 0; i < array.length ; i++) {
            if (array[i].charAt(1)=='a'){
                System.out.println(array[i].substring(0,3).toUpperCase());
            }
        }
    }
}
