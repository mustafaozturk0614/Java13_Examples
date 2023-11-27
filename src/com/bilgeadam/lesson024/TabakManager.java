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


}
