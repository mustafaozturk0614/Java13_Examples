package com.bilgeadam.lesson014;

public class StudentTest {

    public static void main(String[] args) {
        Student student1=Student.kayit("Mustafa");
        Student student2=Student.kayit("Serkan");
        System.out.println(student1.isim);
        System.out.println(student2.isim);

        Student student3=new Student();
        Student student4=new Student();
        student3.kayit2("Sinem");
        student4.kayit2("Özge");
        System.out.println(student3.isim);
        System.out.println(student4.isim);
        System.out.println(student1.no);
        System.out.println(student2.no);
        System.out.println(student3.no);
        System.out.println("kayıt olan ogrenci sayıyı "+Student.ogrenciSayisi);
        Student student=Student.kayit("Furkan");
        System.out.println("kayıt olan ogrenci sayıyı "+Student.ogrenciSayisi);

    }
}
