package com.bilgeadam.lesson019;

public class Test {

    public static void main(String[] args) {
        Chef chef=new Chef(1,"Mustafa",50000,"Tatlı");
        Waiter waiter=new Waiter(2,"Serkan",30000,"Balkon");
        chef.requestSalaryIncrease();
        waiter.requestSalaryIncrease();
        chef.cooking();
        waiter.takeOrder();
        Customer customer=new Customer();
        customer.enter();
        customer.exit();
        chef.exit();
        waiter.enter();

    }
}
