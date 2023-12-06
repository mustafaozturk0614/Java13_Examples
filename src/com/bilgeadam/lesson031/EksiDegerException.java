package com.bilgeadam.lesson031;

public class EksiDegerException extends RuntimeException{

    private String message;

    public EksiDegerException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
