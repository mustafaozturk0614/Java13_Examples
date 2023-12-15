package com.bilgeadam.lesson038.liskovSusbstition;

import com.bilgeadam.lesson038.solid.utilty.Notification;
import com.bilgeadam.lesson038.solid.utilty.User;

/*

    1- email ve sms gonder metotlarımız vardı
    sonra facebook dediki ben artık sms gondermeyi desteklemiyorum bu sorunu nasıl cozeriz
 2- whatsapp sadece video konferans sohbet resimpaylaş hikaye palyas ozelllikleri destekliyor
    facebook==> post,resim,hikaye,sohbet
    instagram==> post,resim,hikaye,sohbet
 */
public class Instagram  extends SocialMedia implements IEmailSendable,ISmsSendable,IPostable{

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
    public void sharePost() {

    }
}
