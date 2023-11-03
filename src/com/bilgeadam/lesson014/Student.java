package com.bilgeadam.lesson014;
/*
    ögrencilerin bir numarası bir ismi olsun
    daha sonra kayıt metodu yazalım
    metodun cıktıları:
    Mustafa adlı ogrenci basarı ile kayıt Edildi ogrencino==>1
    Serkan adlı ogrenci basarı ile kayıt Edildi ogrencino==>2

    daha sonra StudentTEst sınıfında  birden cok ogrenci olusturup kayıt ederk bu cıktıları elde etemye calısalım


 */
public class Student {

        public String isim;
        public  static int ogrenciSayisi;
        public int no;
        public static Student kayit(String isim){
            Student student=new Student();
            student.isim=isim;
            ogrenciSayisi++;
            student.no=ogrenciSayisi;
            System.out.println(isim+" adlı ogrenci basarı ile kayıt Edildi ogrencino==>"+student.no);
            return  student;
        }

        public void kayit2(String ogrenciIsmi){
            isim=ogrenciIsmi;
            ogrenciSayisi++;
            no=ogrenciSayisi;
            System.out.println(isim+" adlı ogrenci basarı ile kayıt Edildi ogrencino==>"+(no));
        }

}
