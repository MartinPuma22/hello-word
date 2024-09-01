package com.java.buddies.basics.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("A0002",10);
        productMap.put("A0004",17);
        productMap.put("A0014",19);

        System.out.println("Por favor, ingrese el codigo del producto: ");
        String productCode = sc.next();

        if(!productMap.containsKey(productCode)){
            throw new IllegalArgumentException("Codigo de producto invalido");
        }
        int stock = productMap.get(productCode);

        if (stock <= 0 ){
            throw new IllegalArgumentException("Stock de producto no valido");
        }
        System.out.println("El stock del producto " + productCode + " es " + stock);
        System.out.println("Por favor digite la cantidad de productos que desea comprar: ");
        int quantity = sc.nextInt();

        if (quantity > stock){
            throw new IllegalArgumentException("Stock insuficiente");
        }

        productMap.put(productCode, stock - quantity);
        System.out.println("El stock final es: " + productMap.get(productCode));
    }
}

