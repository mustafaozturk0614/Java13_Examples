package com.bilgeadam.lesson037.designPatterns.factoryPattern;

public class DatabaseFactory {

  public static ILogger  createDatabase(String dbName){
      switch (dbName){
          case "postgre":
         return    new PostgreSql();
          case "mongo":
         return   new MongoDb();

          default:
            throw new RuntimeException("Girdiğiniz database desteklenmemektedir!!!");
      }

   }

}
