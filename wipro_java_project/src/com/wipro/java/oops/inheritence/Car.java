package com.wipro.java.oops.inheritence;

class Car {
    private String model;
    private String color;

    // Constructor for Car class
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Getters and setters for Car properties
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

     public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // A method to display car information (common behavior)
    public void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}