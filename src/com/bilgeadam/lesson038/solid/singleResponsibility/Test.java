package com.bilgeadam.lesson038.solid.singleResponsibility;

import com.bilgeadam.lesson038.solid.utilty.User;

public class Test {
    public static void main(String[] args) {
        Instagram instagram=new Instagram();
        User user1=new User("Mustafa","mustafa@gmail.com","555-55-55");
        User user2=new User("Özge",null,"555-56-56");
        User user3=new User("Serkan","serkan@gmail.com");

        instagram.sendSms(user1);
        instagram.sendEmail(user1);
        instagram.sendSms(user2);
        instagram.sendEmail(user2);
        instagram.sendSms(user3);
        instagram.sendEmail(user3);


    }
}
