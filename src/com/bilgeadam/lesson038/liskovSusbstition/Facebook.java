package com.bilgeadam.lesson038.liskovSusbstition;

import com.bilgeadam.lesson038.solid.utilty.Notification;
import com.bilgeadam.lesson038.solid.utilty.User;

public class Facebook extends SocialMedia implements IEmailSendable,IPostable{
    @Override
    public void resize(String type) {
        switch (type){
            case "jpg":
                setScaleRatio(34);
                break;
            case "png":
                setScaleRatio(37);
                break;
            default:
               setScaleRatio(45);
                break;
        }

    }

    public void sendEmail(User user){
        if (user.getEmail()!=null){
            Notification.sendEmail(user.getEmail());
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
    public void sharePost() {

    }
}
