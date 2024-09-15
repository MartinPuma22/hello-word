package com.java.buddies.programacion.objetos;

public class ApplicationCar {
    public static void main(String[] args) {

        Car car = new Car("Subaru.", "Wrx", 2022, 10500 );

        car.carDetails();

        for (int i = 0; i < 6; i++){
            car.drive();
        }

        car.carDetails();






    }
}
