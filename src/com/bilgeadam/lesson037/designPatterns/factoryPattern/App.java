package com.bilgeadam.lesson037.designPatterns.factoryPattern;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen loglama yapacagınız database ismini giriniz");
        String dbName=scanner.nextLine().toLowerCase();
        ILogger  logger=DatabaseFactory.createDatabase(dbName);
//        switch (dbName){
//            case "postgre":
//                logger=new PostgreSql();
//                break;
//            case "mongo":
//               logger=new MongoDb();
//                break;
//            default:
//                System.out.println("yanlış bir secim yaptınız");
//                break;
//        }
        logger.logToDatabase("log mesajı");
    }

}
