package com.java.buddies.programacion.objetos;

public class ApplicationCard {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(123456789, "09/22", 322, "Martin Gutierrez", 10000.00, 520.40, 0);

        creditCard.setBalance(100);
        creditCard.setNameHolder("James");

        for (int i = 0; i < 22; i++) {
            creditCard.progress();
        }

        creditCard.depositAmount(300.00);
        System.out.println(creditCard);
        creditCard.depositAmount(-50.00);

    }

}