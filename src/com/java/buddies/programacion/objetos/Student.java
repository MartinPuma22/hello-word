package com.java.buddies.programacion.objetos;

public class Student {
    public Student (String name, int age, String degree){

        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    private String name;
    private int age;
    private String degree;

    public void showInformation(){
        System.out.print("Nombre: " + name + ", Edad: " + age + ", Grado: " + degree);

    }
}
