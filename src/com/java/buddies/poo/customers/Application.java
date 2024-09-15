package com.java.buddies.poo.customers;
import com.java.buddies.poo.customers.model.Customer;
import com.java.buddies.poo.customers.service.CustomerManager;

import java.util.Scanner;

public class Application {
    private static CustomerManager manager = new CustomerManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Customer customer = new Customer("75747074", "Martin Gutierrez", 26);
        


        while (true) {
            System.out.println("1. Agregar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    addClient();
                    break;
                case 2:
                    manager.listClient();
                    break;
                case 3:
                    deletClients();
                    break;
                case 4:
                    System.out.println("Saliendo");
                    return;
                default:
                    throw new IllegalArgumentException("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void addClient() {
        System.out.print("Ingrese el DNI (8 dígitos): ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese el nombre (mínimo 3 caracteres): ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad (mayor de 18 años): ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        manager.addClient(dni, nombre, edad);
    }

    private static void deletClients() {
        System.out.print("Ingrese el DNI del cliente a eliminar: ");
        String dni = scanner.nextLine();
        manager.deleteClients(dni);
    }
}
