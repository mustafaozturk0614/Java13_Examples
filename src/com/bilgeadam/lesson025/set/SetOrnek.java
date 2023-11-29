package com.bilgeadam.lesson025.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*

    bir set olusturalaım  bu sete film kategorileri ekleyeceğiz
    kategori ekle diye bir metot yazalım
    dışarıdan bir veri alacağız  ve set e ekleme yapacagız
    kategori daha once eklenmişse  ==> <...> adlı kategori daha once eklenmiştir
    eklenmemiş ise    <...> adlı kategori  başarı ile eklendi


 */
public class SetOrnek {

    Set<String> set=new HashSet<>();
    Scanner scanner=new Scanner(System.in);

    String temp="";

    public  void kategoriEkle(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Lütfen bir kategori giriniz: ");
            String kategori=scanner.nextLine();
            if (!temp.contains(kategori)){
                temp+=kategori+" " ;
            }else {
                System.out.println(kategori+" adlı kategori daha once eklenmiştir");
            }
        }
        String [] array=temp.split(" ");
        for (int i = 0; i <array.length ; i++) {
            set.add(array[i]);
        }

    }
    public  void kategoriEkle2(){
            System.out.println("Lütfen bir kategori giriniz: ");
            String kategori=scanner.nextLine();
            if (set.contains(kategori)){
                System.out.println(kategori+" adlı kategori daha once eklenmiştir");
            }else {
                System.out.println(kategori+" adlı kategori basarı ile eklenmiştir");
                set.add(kategori);
            }
    }
    public  void kategoriEkle3(){
        System.out.println("Lütfen bir kategori giriniz: ");
        String kategori=scanner.nextLine();
        if (set.add(kategori)){
            System.out.println(kategori+" adlı kategori basarı ile eklenmiştir");

        }else {
            System.out.println(kategori+" adlı kategori daha once eklenmiştir!!!!!");
        }
    }
    public static void main(String[] args) {
        SetOrnek setOrnek=new SetOrnek();
        //setOrnek.kategoriEkle();
        setOrnek.kategoriEkle3();
        setOrnek.kategoriEkle3();
        setOrnek.kategoriEkle3();
        setOrnek.kategoriEkle3();
        setOrnek.set.forEach(System.out::println);
    }
}
