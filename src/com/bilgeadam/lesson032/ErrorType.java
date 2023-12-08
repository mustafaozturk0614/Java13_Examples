package com.bilgeadam.lesson032;

public enum ErrorType {
    DOLU_YER_SECIMI(1001,"Sectiğiniz yer doldur lütfen başka bir yer seciniz"),
    SINIRLAR_DISINDA(1002,"Yaptıgınız secim sınırlar dısındadır"),
    YETERSIZ_AGIRLIK(1003,"250 kilonun altındaki yukler limana giriş yapamaz!!!"),
    GECERSIZ_KABUL_TARIHI(1004,"Kabul tarihi geçmiştir"),
        ;
    private int code;
    private String message;

    ErrorType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
