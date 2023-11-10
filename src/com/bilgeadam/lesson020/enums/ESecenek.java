package com.bilgeadam.lesson020.enums;

public enum ESecenek {

    TAS("MAKAS"),KAGIT("TAS"),MAKAS("KAGIT");
    String kazanır;
    private ESecenek(String kazanır){
        this.kazanır=kazanır;
    }


}
