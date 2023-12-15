package com.bilgeadam.lesson037.designPatterns.factoryPattern;

public class MongoDb implements ILogger {


    @Override
    public void logToDatabase(String message) {
        System.out.println(message+"======> mongo ya loglandı");
    }
}
