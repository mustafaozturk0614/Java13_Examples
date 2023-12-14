package com.bilgeadam.lesson037.okulapp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
    static String file="E:\\java13-workspace\\fileornekleri\\";
     static  String path=file+"ogrenciler.txt";

    public static List<Ogrenci> dosyadanVeriOku(String ogretmenIsmi,BufferedReader bufferedReader){
        List<Ogrenci> list=new ArrayList<>();
        try {
            String veri=null;
            String [] dizi;
            while ((veri= bufferedReader.readLine())!=null){
            dizi=veri.split(",");
           // double ort=ortalamaHesapla2(Integer.parseInt(dizi[1]),Integer.parseInt(dizi[2]),Integer.parseInt(dizi[3]));
            double ort2=ortalamaHesapla(Arrays.asList(dizi).subList(1,4));
            LocalDate date=Utility.formatliLocalDateCevirme("dd/MM/yyy",dizi[4]).get();
            Ogrenci ogrenci=new Ogrenci(dizi[0],ort2,date);
            list.add(ogrenci);
                System.out.println(ogretmenIsmi+" adlı ogretmen===>"+ogrenci.getIsim()+" adlı ogrencinin notlarını okudu");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return list;
    }

    private static double ortalamaHesapla2(double... notlar) {
        double toplam=0;
        for (int i = 0; i < notlar.length ; i++) {
            toplam+=notlar[i];
        }
        return toplam/ notlar.length;
    }

    public static double ortalamaHesapla(List<String> notlar) {
        return notlar.stream().collect(Collectors.averagingDouble(x->Double.parseDouble(x)));
    }
    /*
        ogretmen ismi.txt diger bir dosya olustrup
        gelen ogrenci listesini o dosyaya serlestrip yazdıracak
     */
    public static void ogretmenDosyasıOlsutur(List<Ogrenci> ogrenciListesi,String ogretmenIsmı){
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream(file+ogretmenIsmı+".txt"));
            oos.writeObject(ogrenciListesi);
            System.out.println("Ogrenciler başarı ile kayıt edildi");
        } catch (IOException e) {
            System.out.println(e.toString()+": ogrenci kayıt işlemi başarısız !!!");
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Ogrenci> ogrencileriGetir(String ogretmenIsmı){
        ObjectInputStream ois=null;
        List<Ogrenci> ogrenciListesi=new ArrayList<>();
        try {
            ois=new ObjectInputStream(new FileInputStream(file+ogretmenIsmı+".txt"));
           ogrenciListesi=(List<Ogrenci>) ois.readObject();
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return ogrenciListesi;
    }
}
