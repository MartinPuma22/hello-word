package com.java.buddies.basics.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ServiceLoader;

public class SubscriptionsServices {
    public static final String INTERNET = "internet";
    public static final String TV = "television";
    public static final String PHONE = "telefono";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> servicemap = fillmap();
        double totalCost = 0;
        totalCost = addServiceAndUpdateCost(totalCost,servicemap);

        System.out.println("¿Desea suscribirse a otro sericio más? (si/no)");
        String response = sc.next();

        if (response.equalsIgnoreCase("si")){
            totalCost = addServiceAndUpdateCost(totalCost,servicemap);

            System.out.println("¿Desea suscribirse a otro servicio mas? (si/no)");
            response = sc.next();
            if (response.equalsIgnoreCase("Si")){
                totalCost = addServiceAndUpdateCost(totalCost, servicemap);
            }
        }
        System.out.println("El costo total de la suscripcion es: " + totalCost + " USD");
    }

    static Map <String, Double> fillmap() {
        Map<String, Double> servicemap = new HashMap<>();
        servicemap.put(INTERNET, 30.00);
        servicemap.put(TV, 25.00);
        servicemap.put(PHONE, 15.00);
        return servicemap;
    }

    static double addServiceAndUpdateCost(double accumulatedCost, Map<String, Double>serviceMap){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del sercicio que desea suscribirse (Internet, Television, Telefono): ");
        String serviceName = sc.next().toLowerCase();
        if (!serviceMap.containsKey(serviceName)){
            throw new IllegalArgumentException("Servicio no valido");
        }
        accumulatedCost += serviceMap.get(serviceName);
        return accumulatedCost;
    }
}
