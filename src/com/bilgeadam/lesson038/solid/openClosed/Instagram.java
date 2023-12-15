package com.bilgeadam.lesson038.solid.openClosed;

import com.bilgeadam.lesson038.solid.utilty.Notification;
import com.bilgeadam.lesson038.solid.utilty.User;

/*
    1- instagram sınıfımız icinde scalaeRatio özellimiz olsun
    ResizePhoto diye bir sınıfımız olacak bu sınıf içinde boyutlandırma yapacagız
    bu meteod bizden instagram nesnesi ve bir string type alacak
    eğer type jpg ise scaleRatio oranı ==>38
    png ==> 30
    default ==> 40

    2- Yeni bir sosyal medya uygulaması daha ekledik ornegin facebook
    facebook için jpg 34 png 37 default 45 olsun
    daha sonra instagram ve facebook goz onunde bulundurularak  resizphoto2 metodunu yazıcagız
    3- yeni bir sosyal medya daha eklendi whatsapp
    jpg-->28 png 32 default 36

 */
public class Instagram  extends  SocialMedia{

    @Override
    public void resize(String type) {
        switch (type){
            case "jpg":
                setScaleRatio(38);
                break;
            case "png":
                setScaleRatio(30);
                break;
            default:
                setScaleRatio(40);
                break;
        }

    }


}
