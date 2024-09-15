package com.java.buddies.programacion.objetos;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFigures {
    public static void main(String[] args) {

        List<Figures> figuras = new ArrayList<>();

        figuras.add(new Circle(2));
        figuras.add(new Square(2));
        figuras.add(new Triangle(2, 2));

        for (Figures figures : figuras){
            figures.calculateArea();
        }

    }
}
