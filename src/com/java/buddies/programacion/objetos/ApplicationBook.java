package com.java.buddies.programacion.objetos;

public class ApplicationBook {
    public static void main(String[] args) {
        Book book = new Book("Liar.", "Martin.", 322, 60.50);

        book.showInformation();
        book.applyDiscount();
    }
}
