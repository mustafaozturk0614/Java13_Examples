package com.bilgeadam.lesson024;

import java.util.Random;
import java.util.Stack;

public class TabakManager {

    private Stack<Tabak> kirliler;
    private Stack<Tabak> temizler;

    public Stack<Tabak> getKirliler() {
        return kirliler;
    }

    public void setKirliler(Stack<Tabak> kirliler) {
        this.kirliler = kirliler;
    }

    public Stack<Tabak> getTemizler() {
        return temizler;
    }

    public void setTemizler(Stack<Tabak> temizler) {
        this.temizler = temizler;
    }

    public TabakManager() {
        this.kirliler=new Stack<>();
        this.temizler=new Stack<>();
    }

    public void  tabakOlustur(){
        Random random=new Random();
        for (int i = 0; i <10 ; i++) {
            Tabak tabak=new Tabak((i+1), random.nextBoolean());
            if (tabak.isKirliMi()){
                kirliler.push(tabak);
            }else{
                temizler.push(tabak);
            }
        }
    }

    public void kullan(){
        if (temizler.isEmpty()) {
            System.out.println("Temiz tabak kalmamıştır!!");
            temizle();
        }else {
            Tabak tabak=temizler.pop();
            System.out.println(tabak.getId()+" li tabak kullanıldı");
            tabak.setKirliMi(true);
            kirliler.push(tabak);
        }
    }
    public void temizle(){
        if (kirliler.isEmpty()) {
            System.out.println("Kirli tabak kalmamıştır!!");
            kullan();
        }else {
            Tabak tabak=kirliler.pop();
            System.out.println(tabak.getId()+" li tabak temizlendi");
            tabak.setKirliMi(false);
            temizler.push(tabak);
        }
    }

    public void secimYap(int secim){
        switch (secim){
            case 1:
                temizle();
                break;
            case 2:
                kullan();
                break;
            default:
                break;
        }

    }

}
