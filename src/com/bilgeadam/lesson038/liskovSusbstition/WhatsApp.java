package com.bilgeadam.lesson038.liskovSusbstition;

import com.bilgeadam.lesson038.solid.utilty.Notification;
import com.bilgeadam.lesson038.solid.utilty.User;

public class WhatsApp extends SocialMedia implements ISmsSendable,IEmailSendable,IConferencable{

    @Override
    public void resize(String type) {
        switch (type){
            case "jpg":
                setScaleRatio(28);
                break;
            case "png":
                setScaleRatio(32);
                break;
            default:
                setScaleRatio(36);
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

    @Override
    public void sharePhoto() {

    }

    @Override
    public void shareStory() {

    }

    @Override
    public void chat() {

    }

    @Override
    public void videoConferancing() {

    }
}
