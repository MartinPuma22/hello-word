package com.java.buddies.basics.main;

import java.util.Scanner;

public class ClaseNueva {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int suma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primero numero: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        suma = n1 + n2;
        System.out.println("La suma es : " + suma);
    }
}
