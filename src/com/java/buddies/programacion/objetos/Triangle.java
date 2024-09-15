package com.java.buddies.programacion.objetos;

public class Triangle extends Figures {
    public Triangle(double base, double height){

        this.base = base;
        this.height= height;

    }
    private double base;
    private double height;
    private double area;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + area +
                '}';
    }

    public void calculateArea(){
        this.area = (this.base * this.height) /2;
        System.out.println("Area calculada: " + area);
    }
}
