package com.java.buddies.basics.main;

import java.util.Scanner;

import java.util.Scanner;

public class NuevaPractica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        System.out.print("Introduce tu edad: "); // Pedir la edad al usuario
        int edad = sc.nextInt(); // Leer la edad del usuario

        if (edad >= 18) {
            System.out.print("Mayor de edad");
        } else {
            throw new IllegalArgumentException("Menor de edad");
        }

        sc.close(); // Cerrar el Scanner para liberar recursos
    }
}
