package com.bilgeadam.lesson019.interfaceDemo;

public class Chef  extends  Employee implements IChefInterface{

    private  String specialization;// uzmanlık alanı

    public Chef(int id, String name, double salary, String specialization) {
        super(id, name, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "specialization='" + specialization + '\'' +
                '}';
    }
    @Override
    public void cooking() {
        System.out.println(getName()+" adlı calısan yemek  pişiriyor");
    }
    @Override
    public void checkMaterial() {
        System.out.println(getName()+" adlı calısan malzeme kontrolu yapıyor");
    }
}
