package com.java.buddies.programacion.objetos;

public class Car {
    public Car (String brand , String model, int year, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.usageCount = 0;
    }

    private String brand;
    private String model;
    private int year;
    private int mileage;
    private  int usageCount;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand +
                ", model='" + model +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }

    public void carDetails(){

        System.out.println("Marca: " + brand + " Modelo: " + model + " Año: " + year + " Kilometraje: " + mileage);
    }

    public void drive(){

        this.usageCount ++;
        this.mileage ++;

        if(this.usageCount> 5){
            this.mileage += 100;
        }

    }
}
