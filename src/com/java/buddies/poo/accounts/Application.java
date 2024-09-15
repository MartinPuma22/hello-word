package com.java.buddies.poo.accounts;

import com.java.buddies.poo.accounts.model.BankAccount;
import com.java.buddies.poo.accounts.service.Transfer;

public class Application {
    public static void main(String[] args) {

        //Customer customer = new Customer();
        //customer.customerIdentification("75747074");

        BankAccount cuenta1 = new BankAccount("75747074", 100);
        BankAccount cuenta2 = new BankAccount("87654321", 500);


        Transfer transferService = new Transfer();


        transferService.getTransfer(cuenta1, cuenta2, 10);


        System.out.println("Saldo cuenta de Martin: "  + cuenta1.getBalance());
        System.out.println("Saldo cuenta de Cesar: " + cuenta2.getBalance());
    }
}
