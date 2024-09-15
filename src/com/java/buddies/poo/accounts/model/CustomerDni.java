package com.java.buddies.poo.accounts.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDni {
    public CustomerDni() {
    }

    public CustomerDni(String name, String number, String bankAccount){

        this.name = name;
        this.number = number;
        this.bankAccount = bankAccount;
    }

    private String name;
    private String number;
    private String bankAccount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


    public void customerIdentification(String dniToFind){

        List<CustomerDni> customers = new ArrayList<>();
        List<String> dniList = new ArrayList<>();


        customers.add(new CustomerDni("Martin Gutierrez", "75747074", "2211871288"));
        customers.add(new CustomerDni("Pamela Lopez", "75153014", "2211871128"));
        customers.add(new CustomerDni("Juan Galvez", "7345213", "2211367281"));
        customers.add(new CustomerDni("Gianella Meneses", "8842125", "2211871153"));
        customers.add(new CustomerDni("Edson Bolivar", "60547912", "2211815589"));

        dniList.add("75747074");
        dniList.add("75153014");
        dniList.add("7345213");
        dniList.add("8842125");
        dniList.add("60547912");

        Map<String, CustomerDni> dniMap = new HashMap<>();
        for (int i = 0; i < dniList.size(); i++){
            dniMap.put(dniList.get(i), customers.get(i));
        }

        CustomerDni customer = dniMap.get(dniToFind);
        if (customer != null){
            System.out.println("Cliente: " + customer.getName());
            System.out.println("Cuenta bancaria: " + customer.getBankAccount());
        }//else {
           // System.out.println("Cliente con Dni: " + dniToFind + " no existe.");

        if (customer == null){
            throw new IllegalArgumentException("Cliente con Dni:" + dniToFind + " no existe.");
        }
    }

}
