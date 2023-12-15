package com.bilgeadam.lesson037.designPatterns.factoryPattern;

public class PostgreSql implements ILogger{

    @Override
    public void logToDatabase(String message) {
        System.out.println(message+"======> postgre ye loglandı");
    }
}
