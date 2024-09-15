package com.java.buddies.programacion.objetos;

import java.util.ArrayList;
import java.util.List;

public class ApplicationAnimal {
    public static void main(String[] args) {



        List<Animals> animales = new ArrayList<>();

        animales.add(new Dog());
        animales.add(new Dog());
        animales.add(new Dog());
        animales.add(new Cat());
        animales.add(new Cat());
        animales.add(new Cat());


        for (Animals animals : animales){
            animals.makeSound();

        }

    }
}
