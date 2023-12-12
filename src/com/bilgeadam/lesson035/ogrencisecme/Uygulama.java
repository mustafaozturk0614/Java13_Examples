package com.bilgeadam.lesson035.ogrencisecme;

import java.io.*;

public class Uygulama {

    public static void main(String[] args) {
        OgrenciFileislemler ogrenciFileislemler=new OgrenciFileislemler();
     //  baslangicVerisiOlusturma(ogrenciFileislemler);
      //  ogrenciFileislemler.secilenOgrenciyiDosyayYazdir(FileSabitler.SECILENLER);
        listedenOgrenciSecme(ogrenciFileislemler);
    }

    public static void baslangicVerisiOlusturma(OgrenciFileislemler ogrenciFileislemler){
        ogrenciFileislemler.dosyadanVeriOku(FileSabitler.OGRENCI_LISTESI);
        ogrenciFileislemler.listeyiDosyayaYazdirma(FileSabitler.SECILECEKLER);
        System.out.println("baslangıc verisi olusturuldu");
    }

    public static void listedenOgrenciSecme(OgrenciFileislemler ogrenciFileislemler){
        ogrenciFileislemler.dosyadanVeriOku(FileSabitler.SECILECEKLER);
        if (ogrenciFileislemler.ogrenciler.isEmpty()){
            System.out.println("Secilecek ogrenci kalmadı");
            baslangicVerisiOlusturma(ogrenciFileislemler);
            File file=new File(FileSabitler.SECILENLER);
            file.delete();
            listedenOgrenciSecme(ogrenciFileislemler);
        }else{
            String ogrenci=ogrenciFileislemler.ogrenciSec();
            ogrenciFileislemler.secilenOgrenciyiDosyayYazdir(FileSabitler.SECILENLER,ogrenci);
            ogrenciFileislemler.ogrenciler.remove(ogrenci);
            ogrenciFileislemler.listeyiDosyayaYazdirma(FileSabitler.SECILECEKLER);
        }



    }

}
