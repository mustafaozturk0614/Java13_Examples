package com.bilgeadam.lesson019.interfaceDemo2;

public class YukGemisi  extends Gemi implements IYuk  {

    @Override
    public void yukAl() {
        System.out.println(getClass().getSimpleName()+" yuk alıyor");
    }
    @Override
    public void yukBosalt() {
        System.out.println(getClass().getSimpleName()+" yuk  bosaltıyor");
    }
}
