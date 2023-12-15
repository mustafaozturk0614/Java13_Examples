package com.bilgeadam.lesson038.liskovSusbstition;

import com.bilgeadam.lesson038.solid.utilty.Notification;
import com.bilgeadam.lesson038.solid.utilty.User;

public  abstract class SocialMedia implements ISocialMedia {

    private double scaleRatio;

    public double getScaleRatio() {
        return scaleRatio;
    }

    public void setScaleRatio(double scaleRatio) {
        this.scaleRatio = scaleRatio;
    }


    public abstract void resize(String type);

}
