package com.bilgeadam.lesson019.interfaceDemo;

public class Waiter  extends  Employee implements IWaiterterface{
    private  String areaOfResponsibility;

    public Waiter(int id, String name, double salary, String areaOfResponsibility) {
        super(id, name, salary);
        this.areaOfResponsibility = areaOfResponsibility;
    }

    public String getAreaOfResponsibility() {
        return areaOfResponsibility;
    }

    public void setAreaOfResponsibility(String areaOfResponsibility) {
        this.areaOfResponsibility = areaOfResponsibility;
    }
    @Override
    public String toString() {
        return "Waiter{" +
                "areaOfResponsibility='" + areaOfResponsibility + '\'' +
                '}';
    }
    @Override
    public void takeOrder() {
        System.out.println(getName()+" adlı calısan siprariş  aldı");
    }
    @Override
    public void serveFood() {
        System.out.println(getName()+" adlı calısan servis  yapıyor");
    }
}
