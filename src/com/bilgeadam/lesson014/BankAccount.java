package com.bilgeadam.lesson014;
/*
    bir interestRate accountNumber birde balance özelliklerim var

    bu sınıfı olusturduktan sonra bir faiz oranı atayalım  0.05  gibi
    daha sonra fazi getirisini hesaplayan bir metot yazalım getInterestRate()

    birde getInformation metodu yazıp bu hesapla ilgili verileri gosterelim

    test sınfıın olusturup denemeler yapalım

 */
public class BankAccount {
    public static  double interestRate;
    public String accountNumber;
    public  double balance;

    public  double  getInterestRate(){
        double interestIncome=balance*interestRate;
        // balance+=interestIncome;
       // System.out.println("Faiz getirisi ==>"+interestIncome);
        return  interestIncome;
    }

    public void getInformation(){
        System.out.println("===HESAP BİLGİLERİ====");
        System.out.println("hesap no="+ accountNumber);
        System.out.println("bakiye="+ balance);
        System.out.println("fazi oranı="+ interestRate);
        System.out.println("faiz getirisi="+ getInterestRate());

    }

}
