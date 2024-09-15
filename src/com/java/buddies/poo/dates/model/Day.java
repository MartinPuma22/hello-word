package com.java.buddies.poo.dates.model;

public class Day {
    public Day() {
    }

    public Day(String description, String number) {

        this.description = description;
        this.number = number;

    }
    private String description;
    private String number;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
