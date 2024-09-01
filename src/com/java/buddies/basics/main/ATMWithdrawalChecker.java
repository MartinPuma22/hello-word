package com.java.buddies.basics.main;

import java.util.Scanner;

/**
 * <b>Caso de uso: <b/> Verificación de límite de retiro en cajero automático
 * <br>
 * <b>Reglas de negocio: <b/>
 * - Los clientes pueden retirar dinero de un cajero automático, pero hay un límite máximo de retiro por transacción.
 * - El límite de retiro depende del tipo de cuenta:
 *   - Cuenta Estándar: Límite de retiro de 500 dólares.
 *   - Cuenta Premium: Límite de retiro de 1000 dólares.
 * - Si el monto a retirar supera el límite, la transacción debe ser rechazada.
 * - El monto a retirar debe ser un valor positivo.
 * <br>
 * <b>Criterios de aceptación: <b/> La aplicación debe determinar si el retiro puede realizarse basado en el tipo de cuenta y el monto a retirar.
 */
public class ATMWithdrawalChecker {

    public static final String PREMIUM = "premium";
    public static final String ESTANDAR = "estandar";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de cuenta (Estandar/Premium): ");
        String accountType = scanner.nextLine().trim().toLowerCase();

        System.out.print("Ingrese el monto a retirar (en dólares): ");
        double amount = scanner.nextDouble();

        double limit = 0;

        if (accountType.equals(ESTANDAR)) {
            limit = 500;
        }

        if (accountType.equals(PREMIUM)) {
            limit = 1000;
        }

        if (!accountType.equals(ESTANDAR)&& !accountType.equals(PREMIUM)){
            throw new IllegalArgumentException("Tipo de cuenta no valida");
        }


        if (amount <= 0 || amount > limit) {
            throw new IllegalArgumentException("Monto invalido");
        }

        System.out.println("Transacción aprobada.");

    }


}