package com.java.buddies.programacion.objetos;

public class UniversityStudent extends Student{
    public UniversityStudent(String name, int age, String degree, String career) {
        super(name, age, degree);
        this.career = career;
    }
    private String career;

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.print("Carrera: " + career);
    }
}
