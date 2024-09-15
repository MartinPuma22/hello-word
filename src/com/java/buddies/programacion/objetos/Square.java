package com.java.buddies.programacion.objetos;

public class Square extends Figures {
    public Square (int side){

        this.side = side;

    }

    private int side;
    private int area;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public void calculateArea(){

        this.area = this.side * this.side;

        System.out.println("Area calculada: " + area);

    }
}
