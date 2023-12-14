package com.bilgeadam.lesson037.designPatterns.singeltonPattern;
/*
    Singelton ==> Bir sınıftan tek bir nesne tek bir ornek olusturmak  için kullanın tasarım deseni
   1-const==> private olacak yeni bir nesne newleme işlemine izin vermeyecek
   2-sınıfn içinde kedni referansında private static bir degişken tutacağız
   3- sataic bir metot yazıp  bu metot içerisinde sınıf içinde tanımladıgmız değişkenin
   null olup olmadıgını kontrol ediyoruz eger null ise bu değişkeni new leyip
   bundan obje olustruyoruz eğer null değilse daha once olusmus degişkeni geri donuyoruz
 */
public class MyPostgreConnection {

 private static MyPostgreConnection instance;

    private MyPostgreConnection() {
    }

    public static MyPostgreConnection getInstance(){
        if (instance==null){
            instance=new MyPostgreConnection();
        }
        return  instance;
    }

    @Override
    public String toString() {
        return "hascode==>"+hashCode();
    }
}
