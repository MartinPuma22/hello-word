package com.java.buddies.basics.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement {
    public static final String[] NAMES_DB = {"Fabian", "Omar", "Jhunior", "Martin", "Lorena"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(NAMES_DB));

        System.out.print("Ingrese el nombre del nuevo cliente: ");
        String name = sc.next();
        nameList.add(name);

        System.out.println("################## Lista de clientes #####################");

        for (String currentName: nameList){
            System.out.println(currentName);
        }

        System.out.println("Ingrese el nombre del cliente que desee eliminar: ");
        String nameToRemove = sc.next();
        nameList.remove(nameToRemove);

        System.out.println("########## Lista de clientes ###########");
        for (String currentName: nameList){
            System.out.println(currentName);
        }
    }
}
