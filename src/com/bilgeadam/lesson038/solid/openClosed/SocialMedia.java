package com.bilgeadam.lesson038.solid.openClosed;

import com.bilgeadam.lesson038.solid.utilty.Notification;
import com.bilgeadam.lesson038.solid.utilty.User;

public  abstract class SocialMedia {

    private double scaleRatio;

    public double getScaleRatio() {
        return scaleRatio;
    }

    public void setScaleRatio(double scaleRatio) {
        this.scaleRatio = scaleRatio;
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

    public abstract void resize(String type) ;

}
