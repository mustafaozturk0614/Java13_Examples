package com.bilgeadam.lesson019.interfaceDemo;
/*
  1- databse
  2-giriş yap ve çıkış yap metotları olsun  hem calısanlar hemde musteriler bu metoları uygulasın


 */
public class Customer implements  ICommonBehavior {


    @Override
    public void exit() {
        System.out.println("Müşteri çıkış yapıyor");
    }

    @Override
    public void enter() {
        System.out.println("Müşteri giriş yapıyor");
    }
}
