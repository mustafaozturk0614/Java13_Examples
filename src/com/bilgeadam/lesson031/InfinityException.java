package com.bilgeadam.lesson031;
/*
Unchecked Exception
 */
public class InfinityException extends RuntimeException {
    private String message;

    public InfinityException() {
        message="Default mesaj";
    }

    public InfinityException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
