package com.bilgeadam.lesson037.designPatterns.singeltonPattern;

public class Test {

    public static void main(String[] args) {
        MyPostgreConnection connection1=MyPostgreConnection.getInstance();
        MyPostgreConnection connection2=MyPostgreConnection.getInstance();
        MyPostgreConnection connection3=MyPostgreConnection.getInstance();
        MyPostgreConnection connection4=MyPostgreConnection.getInstance();
        MyPostgreConnection connection5=MyPostgreConnection.getInstance();
        System.out.println(connection1);
        System.out.println(connection2);
        System.out.println(connection3);
        System.out.println(connection4);
        System.out.println(connection5);
        System.out.println(connection1.equals(connection5));

    }
}
