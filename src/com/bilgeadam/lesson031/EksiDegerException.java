package com.bilgeadam.lesson031;
/*
Checked Exception
 */
public class EksiDegerException extends Exception{

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
