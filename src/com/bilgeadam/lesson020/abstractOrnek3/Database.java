package com.bilgeadam.lesson020.abstractOrnek3;

public abstract class Database {

    private String id;
    private  String username;
    private  String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  abstract void veriEkle();
    public  abstract void veriSil();
    public  abstract void veriGuncelle();
    public abstract void verileriGetir();

}
