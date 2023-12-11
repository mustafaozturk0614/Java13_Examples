package com.bilgeadam.lesson034;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
    Sabitleri tutugumuz bir sınıfımız olsun
    daha sonra FileIslemler sınıfında  bir menu olusturalım
    1- Dosya yarat
    2- Dosya Sil
    3- Dosya ya veri ekle
    4- Dosya dan veri oku
    5- Dosya daki bir harfi başka bir harf ile değiştir

    1- Dosya yarat==> dosya olusturmaya calısacagız eger daha once olusturulmamış ise
     ==> dosyaismi adlı dosya basarı ile olusturuldu
     eger daha once var ise
     ==> dosyaismi adlı dosya  daha önce olusturlmustur!!!!

 3- dosyaya veri ekle dısarıdan eklencek veriyi alıp dosyayamıza yazacagız

 5-dosyadaki a harflerini x ile değiştrelim

 */
public class FileIslemler {


    public void menu(){
        System.out.println(" " +
                "    1- Dosya yarat\n" +
                "    2- Dosya Sil\n" +
                "    3- Dosya ya veri ekle\n" +
                "    4- Dosya dan veri oku\n" +
                "    5- Dosya daki bir harfi başka bir harf ile değiştir");
    }

    public void uygulama(){
        int secim=0;
        do {
            menu();
            secim=Utility.intDegerAlma("lütfen bir işlem seciniz");
            switch (secim){
                case 1:
                    dosyaOlustur2();
                    break;
                case 2:
                    dosyaSil2();
                    break;
                case 3:
                    dosyayaVeriYaz();
                    break;
                case 4:
                    dosyayadanVeriOkuma();
                    break;
                case 5:
                    harfDegistir();
                    break;
                case 0:
                    break;
            }
        }while (secim!=0);


    }

    public void  dosyaOlustur(){
        String dosyaIsmi=Utility.stringDegerAlma("Lütfen dosya ismini uzantısıyla beraber giriniz");
        Path myPath=Path.of(FileSabitler.path+dosyaIsmi);
        try {
            Files.createFile(myPath);
            System.out.println(dosyaIsmi+" isimli dosya başarı ile oluşturuldu");
        }catch (FileAlreadyExistsException e){
            System.out.println(dosyaIsmi+" isimli dosya zaten daha önce oluşturulmustur!!!!");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
    public void  dosyaOlustur2(){
        String dosyaIsmi=Utility.stringDegerAlma("Lütfen dosya ismini uzantısıyla beraber giriniz");
        File file=new File(FileSabitler.path+dosyaIsmi);
        try {
            if (file.createNewFile()){
                System.out.println(file.getName()+" isimli dosya başarı ile oluşturuldu");
            }else {
                System.out.println(file.getAbsolutePath()+" isimli dosya zaten daha önce oluşturulmustur!!!!");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public  void  dosyaSil(){
        String dosyaIsmi=Utility.stringDegerAlma("Lütfen dosya ismini uzantısıyla beraber giriniz");
        File file=new File(FileSabitler.path+dosyaIsmi);

        if (file.delete()){
            System.out.println(file.getAbsolutePath()+" yolundaki dosya başarı ile silindi");
        }else {
            System.out.println(dosyaIsmi+ " adlı dosya bulunamadı");
        }
    }
    public  void  dosyaSil2(){
        String dosyaIsmi=Utility.stringDegerAlma("Lütfen dosya ismini uzantısıyla beraber giriniz");
        Path myPath=Path.of(FileSabitler.path+dosyaIsmi);
        try {
            if (Files.deleteIfExists(myPath)){
                System.out.println(dosyaIsmi+" yolundaki dosya başarı ile silindi");
            }else {
                System.out.println(dosyaIsmi+ " adlı dosya bulunamadı");
            }
        } catch (IOException e) {
            System.out.println(e.toString());;
        }
    }
    public void dosyayaVeriYaz(){
        String dosyaIsmi=Utility.stringDegerAlma("lütfen veri girişi yapacagınız dosya ismini giriniz");
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter =new BufferedWriter(new FileWriter(FileSabitler.path+dosyaIsmi,true));
            String veri=Utility.stringDegerAlma("Lütfen bir deger giriniz");
            bufferedWriter.write(veri);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println(e.toString());
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
    public String [] dosyayadanVeriOkuma(){
        String dosyaIsmi=Utility.stringDegerAlma("lütfen veri okuyacagınız yapacagınız dosya ismini giriniz");
        BufferedReader bufferedReader=null;
        String metin="";
        try {
            bufferedReader=new BufferedReader(new FileReader(FileSabitler.path+dosyaIsmi));
            String deger=null;

            while ((deger= bufferedReader.readLine())!=null){
               metin+=deger+"\n";
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }
        metin=metin.substring(0,metin.length()-1);
        String [] array={metin,dosyaIsmi};
        return  array;
    }

    //5-dosyadaki a harflerini x ile değiştrelim
    public  void harfDegistir(){
      String [] array=dosyayadanVeriOkuma();
      // metoddan donen arayin 0 indexdeki degeri metinimize karsılık gerli 1. indexdeki degeri ise dosya ismine
      String metin=array[0];

      String eskiHarf=Utility.stringDegerAlma("Lütfen değiştirmek istediğniz harfi giriniz");
      String yeniHarf=Utility.stringDegerAlma("Lütfen yeni harfi giriniz");
      metin=metin.replace(eskiHarf,yeniHarf);

        BufferedWriter bufferedWriter = null;
        try {
          bufferedWriter =new BufferedWriter(new FileWriter(FileSabitler.path+array[1]));
            bufferedWriter.write(metin);
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
