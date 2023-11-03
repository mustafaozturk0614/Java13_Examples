package com.bilgeadam.lesson014;

import java.util.UUID;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount.interestRate=0.05;
        BankAccount bankAccount1=new BankAccount();
        bankAccount1.accountNumber= UUID.randomUUID().toString();
        bankAccount1.balance=1280.50;
        bankAccount1.getInformation();


        BankAccount bankAccount2=new BankAccount();
        bankAccount2.accountNumber= UUID.randomUUID().toString();
        bankAccount2.balance=5000;
        bankAccount2.getInformation();

    }
}
