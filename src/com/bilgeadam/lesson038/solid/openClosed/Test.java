package com.bilgeadam.lesson038.solid.openClosed;

import com.bilgeadam.lesson038.solid.utilty.User;

public class Test {
    public static void main(String[] args) {
        Instagram instagram=new Instagram();
        ResizePhoto resizePhoto=new ResizePhoto();
        Facebook facebook=new Facebook();

//        System.out.println(instagram.getScaleRatio());
//        resizePhoto.resizePhoto(instagram,"jpg");
//        System.out.println(instagram.getScaleRatio());
//        resizePhoto.resizePhoto(instagram,"png");
//        System.out.println(instagram.getScaleRatio());
//        resizePhoto.resizePhoto(instagram,"jpeg");
//        System.out.println(instagram.getScaleRatio());

        WhatsApp whatsApp=new WhatsApp();
        Twitter twitter=new Twitter();
        resizePhoto.resizePhoto3(facebook,"jpg");
        System.out.println("facebook==>"+facebook.getScaleRatio());

        resizePhoto.resizePhoto3(instagram,"jpg");
        System.out.println("instagram==>"+instagram.getScaleRatio());

        resizePhoto.resizePhoto3(whatsApp,"jpg");
        System.out.println("whatsApp==>"+whatsApp.getScaleRatio());

        resizePhoto.resizePhoto3(twitter,"jpg");
        System.out.println("twitter==>"+twitter.getScaleRatio());

    }
}
