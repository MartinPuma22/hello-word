package com.java.buddies.poo.customers.service;

import com.java.buddies.poo.customers.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> clientes = new ArrayList<>();


    public void addClient(String dni, String name, int age) {


        if (dni.length() != 8) {
            throw new IllegalArgumentException("Error: El DNI debe tener exactamente 8 dígitos.");
        }

        for (Customer c : clientes) {
            if (c.getDni().equals(dni)) {
                throw new IllegalArgumentException("Error: DNI " + dni + " ya está registrado.");
            }
        }
        if (age < 18) {
            throw new IllegalArgumentException("El cliente debe ser mayor de edad.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres.");
        }

        Customer cliente = new Customer(dni, name, age);
        clientes.add(cliente);
        System.out.println("Cliente agregado exitosamente.");
    }


    public void listClient() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Clientes registrados:");
            for (Customer c : clientes) {
                System.out.println("DNI: " + c.getDni() + ", Nombre: " + c.getNombre() + ", Edad: " + c.getEdad());
            }
        }
    }


    public void deleteClients(String dni) {
        boolean removed = clientes.removeIf(cliente -> cliente.getDni().equals(dni));
        if (removed) {
            System.out.println("Cliente con DNI " + dni + " eliminado exitosamente.");
        } else {
            System.out.println("Error: Cliente con DNI " + dni + " no encontrado.");
        }
    }
}
