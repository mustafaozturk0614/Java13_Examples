package com.bilgeadam.lesson038.solid.utilty;

public class Notification {

    public static  void sendEmail(String email){
        System.out.println(email+" ===> adrese email gonderiliyor");
    }
    public static  void sendSms(String phone){
        System.out.println(phone+" ===> numaraya sms gonderiliyor");
    }
}
