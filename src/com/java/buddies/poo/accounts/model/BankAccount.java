package com.java.buddies.poo.accounts.model;

public class BankAccount {

    public BankAccount(String customerDni, double balance) {
        this.customerId = customerDni;
        this.balance = balance;
    }
    private String customerId;
    private double balance;

    public String getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
            balance += amount;
    }

    public void withdraw(double amount) {
            balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "customerId='" + customerId + '\'' +
                ", balance=" + balance +
                '}';
    }
}

