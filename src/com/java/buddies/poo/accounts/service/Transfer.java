package com.java.buddies.poo.accounts.service;

import com.java.buddies.poo.accounts.model.BankAccount;

public class Transfer {

    public void getTransfer(BankAccount originAccount, BankAccount destinationAccount, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto a transferir debe ser positivo.");
        }

        if (originAccount.getBalance() < amount) {
            throw new IllegalArgumentException("Fondos insuficientes en la cuenta de origen.");
        }

        originAccount.withdraw(amount);
        destinationAccount.deposit(amount);

        System.out.println("Transferencia realizada con éxito.");
    }
}
