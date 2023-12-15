package com.bilgeadam.lesson038.solid.singleResponsibility;

import com.bilgeadam.lesson038.solid.utilty.Notification;
import com.bilgeadam.lesson038.solid.utilty.User;

/*
    bir bildirim gonder metodu yazacagız
    bu metodda kullanıcın emiali var ise email gondersin
    telefonu var ise sms gondersin
    ikiside varsa hem sms hemde mail gondesin

    bildirim gonder==> kullanıcı alacak


 */
public class Instagram {

    /*
        1. basamakda bir metot yazarak kullanıcın email ve telefonunu kontrol edip ona gore bildirimler gonderdik
        fakat bu metodun singleResponsiblitye uymadığını farkettik ve 2.basamaga gectik
     */
    public void sendNotification(User user){
        if (user.getEmail()!=null){
            Notification.sendEmail(user.getEmail());
        }
        if (user.getPhone()!=null){
            Notification.sendSms(user.getPhone());
        }
    }
    /*
        2. Basamak yukaridaki metodu gorevlerine gore
        2 ye ayırdık 2 ayrı metot ile single responsiblity uygun hale getirdik
     */
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
