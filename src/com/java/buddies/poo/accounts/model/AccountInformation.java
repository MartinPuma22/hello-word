package com.java.buddies.poo.accounts.model;

public class AccountInformation {
    public AccountInformation() {
    }

    public AccountInformation(CustomerDni customer, double balance, String account){

        this.customer = customer;
        this.balance = balance;
        this.account= account;
    }

    private CustomerDni customer;
    private double balance;
    private String account;

    public CustomerDni getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDni customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "AccountInformation{" +
                "customer=" + customer +
                ", balance=" + balance +
                ", account='" + account + '\'' +
                '}';
    }


}
