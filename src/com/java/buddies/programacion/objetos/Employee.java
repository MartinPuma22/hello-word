package com.java.buddies.programacion.objetos;

public class Employee {

    public Employee() {}

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int age, String position, double salary, int id) {
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.id = id;
        this.merit = 0;
    }

    private int age;
    private String position;
    private double salary;
    private int id;
    private int merit;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getMerit() {
        return this.merit;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", merit=" + merit +
                ", salary=" + salary +
                '}';
    }

    void progress() {
        this.merit ++;
        if(this.merit == 10) {
            this.salary = this.salary + 100;
        }
    }
}