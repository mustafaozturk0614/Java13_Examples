package com.bilgeadam.lesson007;

import java.util.Scanner;

/*
    kullanıcan bir ülke ismi alacagız
    daha sonra bu ülke ismi eger arrayimde varsa giridğiniz
    ülke bulundu yoksa giridğiniz ulke bulunamadı cıktısı verelim

 */
public class Question34 {
    public static void main(String[] args) {
        String [] dizi={"Türkiye","Japonya","Danimarka","Fransa"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ülke ismi giriniz");
        String ulke= scanner.nextLine();
    boolean kontrol=false;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i].equalsIgnoreCase(ulke)){
                kontrol=true;
                break;
            }
        }

        if (kontrol){
            System.out.println("Girdiğiniz Ülke Bulundu");
        }else{
            System.out.println("Girdiğiniz ülke Bulunamadı!!!!!");
        }
        /// 2. çözüm
        String sonuc="Girdiğiz Ülke Bulunamadı!!!!!";
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i].equalsIgnoreCase(ulke)){
                sonuc="Girdiğiniz Ülke Bulundu";
                break;
            }
        }
        System.out.println(sonuc);
    }
}
