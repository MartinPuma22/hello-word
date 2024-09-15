package com.java.buddies.poo.customers.model;

public class Customer {
    public Customer(String dni, String name, int age) {
        this.dni = dni;
        this.nombre = name;
        this.edad = age;
    }
    private String dni;
    private String nombre;
    private int edad;

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        if (nombre.length() < 3) {
            throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres.");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("El cliente debe ser mayor de edad.");
        }
        this.edad = edad;
    }
}


