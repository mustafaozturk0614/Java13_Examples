package com.bilgeadam.lesson013;

import java.util.Arrays;

public class FilmTest {


    public static void main(String[] args) {
        Film film1=new Film();
        film1.ad="Mr. Nobody";
        film1.ortalamaPuan=8.5;
        String [] etiketlerDizisi={"Düşündürücü", "Bilim Kurgu", "Fantastik"};
        String [] oyuncular={"Jared Leto", "Sarah Polley", "Diane Kruger", "Linh Dan Pham", "Rhys Ifans"};
        film1.dil="İngilizce";
        film1.sure=141;
        film1.ulke="Belçika";
        film1.yonetmen="Jaco Van Dormael";
        film1.puanEkle(7,0);
        film1.puanEkle(10,1);
        film1.etiketler=etiketlerDizisi;
        film1.oyuncular=oyuncular;
        System.out.println(Arrays.toString(etiketlerDizisi));
        System.out.println(Arrays.toString(oyuncular));

        Film film2=new Film();
        film2.ad="The Big Lebowski";
        film2.ortalamaPuan=7.9;
        film2.dil="ingilizce";
        film2.ulke="ABD";
        film2.sure=117;
        film2.yonetmen="Ethan Coen, Joel Coen";
        System.out.println(film2.ad);


    }
}
