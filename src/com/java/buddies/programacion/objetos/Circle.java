package com.java.buddies.programacion.objetos;

public class Circle extends Figures {
    public Circle(double radio  ){

        this.radio = radio;

    }

    private double radio;
    private double area;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", area=" + area +
                '}';
    }

    public void calculateArea(){

        this.area = Math.pow(radio,2) * Math.PI;
        System.out.println("Area calculada: " + area);
    }

}
