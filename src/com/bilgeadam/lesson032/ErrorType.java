package com.bilgeadam.lesson032;

public enum ErrorType {
    DOLU_YER_SECIMI(1001,"Sectiğiniz yer doldur lütfen başka bir yer seciniz")
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
