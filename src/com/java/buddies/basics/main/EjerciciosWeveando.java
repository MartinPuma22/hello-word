package com.java.buddies.basics.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjerciciosWeveando {
    public static final String INTERNET = "internet";
    public static final String PHONE = "telefono";
    public static final String TV = "television";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> serivicemap = fillmap();
        double totalCost = 0;

        totalCost = addServiceUnderCost(totalCost, serivicemap);

        System.out.println("¿Quiere otro servicio? (si/no)");
        String response = sc.next();

        if (response.equalsIgnoreCase("Si")) {
            totalCost = addServiceUnderCost(totalCost, serivicemap);

            System.out.println("¿Quiere otro servicio? (si/no)");
            response = sc.next();

            if (response.equalsIgnoreCase("si")) {
                totalCost = addServiceUnderCost(totalCost, serivicemap);
            }
        }
        System.out.println("El costo total de la suscripcion es: " + totalCost + " USD");
    }

    static Map<String, Double>fillmap(){
        Map<String, Double>servicemap = new HashMap<>();
        servicemap.put(INTERNET, 30.00);
        servicemap.put(PHONE, 25.00);
        servicemap.put(TV, 15.00);
        return servicemap;
    }
    static double addServiceUnderCost(double acumuletCost, Map<String, Double> serviceMap){
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese el servicio que desea (Internet, Telefono, Television)");
        String serviceName = sc.next().toLowerCase();
        if (!serviceMap.containsKey(serviceName) ){
            throw new IllegalArgumentException("Servicio no valido");
        }
        acumuletCost += serviceMap.get(serviceName);
        return acumuletCost;
    }

}
