package com.java.buddies.programacion.objetos;

public class ApplicationStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Martin Gutierrez", 26, "10° Grado");

        UniversityStudent student2 = new UniversityStudent("Martin Pumapillo", 26, "10° Grado", "Ingenieria Informatica");

        student1.showInformation();
        System.out.println("\n");
        student2.showInformation();
    }
}
