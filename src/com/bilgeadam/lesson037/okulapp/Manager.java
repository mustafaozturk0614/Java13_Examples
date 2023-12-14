package com.bilgeadam.lesson037.okulapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manager {

    String file="E:\\java13-workspace\\fileornekleri\\";
    String path=file+"ogrenciler.txt";

    public List<Ogrenci> dosyadanVeriOku(String ogretmenIsmi){
        List<Ogrenci> list=new ArrayList<>();
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(path));
            String veri=null;
            String [] dizi;
            while ((veri= bufferedReader.readLine())!=null){
            dizi=veri.split(",");
            Ogrenci ogrenci=new Ogrenci(dizi[0]);
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
}
