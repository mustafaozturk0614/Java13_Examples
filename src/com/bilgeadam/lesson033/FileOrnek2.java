package com.bilgeadam.lesson033;

import java.io.*;
import java.util.Arrays;

/*
    OKUMA YAZMA

    output==>yazma
    input==>okuma
 */
public class FileOrnek2 {
    static String path="E:\\java13-workspace\\fileornekleri\\deneme.txt";
    static String path2="E:\\java13-workspace\\fileornekleri\\deneme2.txt";

    public static void main(String[] args) {

        File file=new File(path);
        File file2=new File(path2);

        // Yazma işlemi output
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(file);
//            fos.write(74);
//            fos.write(65);
//            fos.write(86);
//            fos.write(65);
            byte [] array={74,65,86,65};
           // fos.write(array);
            String kelime="-java";
            fos.write(kelime.getBytes());

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        /// OKUMA İŞLEMİ input===
        FileInputStream fis=null;
        try {
          fis=new FileInputStream(file);
         //  int deger =fis.read();
//            System.out.println((char) deger);
//            System.out.println((char)fis.read());
//            System.out.println((char)fis.read());
//            System.out.println((char) fis.read());
//            System.out.println((char) fis.read());
//            System.out.println(fis.read());
            //1. yontem
//            byte [] array2=fis.readAllBytes();
//            for (byte b:array2){
//                System.out.println((char) b);
//            }
            int deger;
            fis.read();
            fis.read();
            while ((deger=fis.read())!=-1){
                System.out.println((char) deger);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
