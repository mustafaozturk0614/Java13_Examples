package com.bilgeadam.lesson019;
/*
    butun calısanlarımız
    izin isteyebilir
    zam isteyebilir
    işten ayrıalabilirler

    garsonlar sipraiş alabilirler
    ve servis yapabiilrler
    şefler yemek pişirebilirler
    malzeme kontrolu yapabilirler
    bu davranısları uygulamaıza ekleyelim

 */
public class Employee implements IEmployee,ICommonBehavior {
    private  int  id;
    private String name;
    private double salary;
    private String startedDate;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(String startedDate) {
        this.startedDate = startedDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", startedDate='" + startedDate + '\'' +
                '}';
    }

    @Override
    public void requestVacation() {
        System.out.println(name+" adlı calısan izin istiyor");
    }

    @Override
    public void leaveWork() {
        System.out.println(name+" adlı calısan işten ayrıldı");
    }

    @Override
    public void requestSalaryIncrease() {
        System.out.println(name+" adlı calısan zam istiyor");
    }

    @Override
    public void exit() {
        System.out.println(name+" adlı çalışan çıkış yapıyor");
    }
    @Override
    public void enter() {
        System.out.println(name+" adlı çalışan giriş yapıyor");
    }
}
