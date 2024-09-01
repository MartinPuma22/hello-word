package com.java.buddies.basics.main;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Telecommunications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> customers = new HashSet<>();
        while (true) {
            System.out.println("Seleccione una opción: (1) Agregar cliente (2) Listar clientes (3) Eliminar cliente (4) Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println("Ingrese el nombre del cliente:");
                String nombre = sc.nextLine();

                if (nombre.length() < 3) {
                    System.out.println("El nombre debe tener al menos 3 caracteres.");
                } else if (customers.contains(nombre)) {
                    System.out.println("El nombre del cliente ya existe.");
                } else {
                    customers.add(nombre);
                    System.out.println("Cliente agregado exitosamente.");
                }
            } else if (opcion == 2) {
                if (customers.isEmpty()) {
                    System.out.println("No hay clientes en la lista.");
                } else {
                    System.out.println("Lista de clientes:");
                    for (String cliente : customers) {
                        System.out.println(cliente);
                    }
                }
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del cliente que desea eliminar:");
                String nombre = sc.nextLine();

                if (customers.contains(nombre)) {
                    customers.remove(nombre);
                    System.out.println("Cliente eliminado exitosamente.");
                } else {
                    System.out.println("El cliente no existe.");
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo de la aplicación.");
                sc.close();
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

    }
}
