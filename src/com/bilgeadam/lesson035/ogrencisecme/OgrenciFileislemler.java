package com.bilgeadam.lesson035.ogrencisecme;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
    isimlistesi.txt dosyamız olacak
    bu dosyayı okuyp baska bir dosyaya yazacagız  secilecekler.txt dosyasına
    daha sonra islemler yapıp birtane veri secip bu veri secilmisler.txt dosyasına ekleyeceğiz

    bu 3 dosya isçin bir sabitler sınıfı olusturalım

    OgrenciFileISlemler sınfımız olsun bu sınıfda bir ogrenci listesi tutalım
    1- dosyadan veri okuma ==> dosyadan okudugumuz(isimlistesi.txt) veriyi listeye ekleyeceğiz
    2-ogrenci listemizdeki verileri secilecekler.txt dosyasına yazdıracagız;
    3-ogrenci sec metodu yazalım==> buda listemizden rastgele ogrenci secmek için bir index degeri donsun
    4-secilen ogrenciyi  secilmisler.txt dosyasına yazdıralım ve aynı zmanda secilecler.txt de dosyasından cıkartalım
    rastgele ogrenci secilecek rastgele ogrenci sec metodu ile beraber gelen indexden daha sonra bu veri secilmisler.txt aktarılacak
    secilecekler.txt guncellenecek

 */
public class OgrenciFileislemler {
    List<String> ogrenciler;
    File file;
    BufferedWriter bufferedWriter;
    BufferedReader bufferedReader;
    Random random;
    public OgrenciFileislemler() {
        this.ogrenciler=new ArrayList<>();
        this.random=new Random();
    }

    public void dosyadanVeriOku(String dosyaYolu){
        try {
            file=new File(dosyaYolu);
            bufferedReader=new BufferedReader(new FileReader(file));
            String ogrenci;
            while ((ogrenci=bufferedReader.readLine())!=null ){
                ogrenciler.add(ogrenci);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void listeyiDosyayaYazdirma(String dosyaYolu){
        try {
            bufferedWriter=new BufferedWriter(new FileWriter(dosyaYolu));
            for (String ogrenci:ogrenciler){
                bufferedWriter.write(ogrenci);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public String ogrenciSec(){
        int index=random.nextInt(ogrenciler.size());
    return  ogrenciler.get(index);
    }

    public void secilenOgrenciyiDosyayYazdir(String dosyaYolu,String ogrenci){
        try {
            bufferedWriter=new BufferedWriter(new FileWriter(dosyaYolu,true));
            bufferedWriter.write(ogrenci);
            bufferedWriter.newLine();
            System.out.println("Secilen ögrenci===>"+ogrenci);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
