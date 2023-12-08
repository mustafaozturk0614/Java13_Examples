package com.bilgeadam.lesson033;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOrnek3 {
    static String path="E:\\java13-workspace\\fileornekleri\\2.jpg";
  static    List<Integer> icerik=new ArrayList();

    public static void main(String[] args) {
            dosyadanVeriOkuma();
            dosyayaVeriYazma("E:\\java13-workspace\\fileornekleri\\3.jpg");
            dosyayaVeriYazma("E:\\java13-workspace\\fileornekleri\\yeniKopya.png");
            dosyayaVeriYazma("E:\\java13-workspace\\fileornekleri\\yeniKopya2.jpeg");
    }

    private static void dosyayaVeriYazma(String path) {
        try {
            FileOutputStream fos=new FileOutputStream(path);
            for (Integer deger:icerik){
                fos.write(deger);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public  static void dosyadanVeriOkuma(){
        try {
            FileInputStream fis=new FileInputStream(path);
            int deger;
            while ((deger= fis.read())!=-1){
                System.out.println(deger);
                icerik.add(deger);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    };

}
