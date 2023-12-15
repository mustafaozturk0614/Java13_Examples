package com.bilgeadam.lesson038.liskovSusbstition;

import com.bilgeadam.lesson038.solid.utilty.Notification;
import com.bilgeadam.lesson038.solid.utilty.User;

public class Twitter extends SocialMedia implements ISmsSendable,IEmailSendable{

    @Override
    public void resize(String type) {
        switch (type){
            case "jpg":
                setScaleRatio(TwitterConstant.JPG);
                break;
            case "png":
                setScaleRatio(20);
                break;
            default:
                setScaleRatio(30);
                break;
        }
    }
    public void sendEmail(User user){
        if (user.getEmail()!=null){
            Notification.sendEmail(user.getEmail());
        }
    }
    public void sendSms(User user){
        if (user.getPhone()!=null){
            Notification.sendSms(user.getPhone());
        }
    }
}
