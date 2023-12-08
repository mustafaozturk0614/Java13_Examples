package com.bilgeadam.lesson033;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileOrnek1 {
    public static void main(String[] args) {
        String path="E:\\java13-workspace\\fileornekleri\\deneme.txt";
        String path2="E:/java13-workspace/fileornekleri/deneme2.txt";
       String path3="E:/java13-workspace/fileornekleri";
        File file=new File(path);
        File file2=new File(path2);
        File file3=new File(path3);
     // File file3=new File(path3);
        System.out.println(file);
        System.out.println(file2);
        System.out.println(file3);
        try {
         boolean kontrol   =file.createNewFile();// dosya yoksa olusturur true doner yoksa olsuturmaz false doner
            System.out.println(kontrol);
        } catch (IOException e) {
            System.out.println(e.toString());;
        }
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file3.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
        System.out.println(file.exists());
        System.out.println(file2.exists());
       // System.out.println(file.delete());
        System.out.println(file2.delete());
        System.out.println(file.length());

        System.out.println(Arrays.toString(file3.list()));// file3 bir klasör klasör uzeinden list metodunu cagırsak
        // içindeki elamanlrın isimlerini listeliyor
        Path myPath=Path.of("E:/java13-workspace/fileornekleri/deneme3.txt");

        try {
            Files.createFile(myPath);

        } catch (IOException e) {
            System.out.println(e.toString());
        }
        try {
            Files.deleteIfExists(myPath);
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
