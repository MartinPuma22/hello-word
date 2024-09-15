package com.java.buddies.programacion.objetos;

public class Book {
    public Book (String qualification, String author, int pagesNumber, double price ){

        this.qualification = qualification ;
        this.author = author;
        this.pagesNumber = pagesNumber;
        this.price = price;

    }
    private String qualification;
    private String author;
    private int pagesNumber;
    private  double price;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "qualification='" + qualification +
                ", author='" + author +
                ", pagesNumber=" + pagesNumber +
                ", price=" + price +
                '}';
    }

    public void showInformation() {
        System.out.println("Titulo: " + qualification + " Autor: " + author + " Numero de paginas: " + pagesNumber +" Precio: " + price);

    }
    public void applyDiscount() {

        this.price = this.price * 0.75;
        System.out.println("El precio con descuento es: " + this.price);


    }
}
