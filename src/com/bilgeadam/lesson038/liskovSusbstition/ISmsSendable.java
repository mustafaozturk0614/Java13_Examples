package com.bilgeadam.lesson038.liskovSusbstition;

import com.bilgeadam.lesson038.solid.utilty.User;

public interface ISmsSendable {
    void sendSms(User user);
}
