package com.wipro.java.usecase2;
import java.util.*;
import java.util.stream.Collectors;

// abstract Class for Abstraction 
// Encapsulation for IceCream class
abstract class IceCream {
    private String flavor;
    private double price;
    private String size; // Sizes like Small, Medium, and Large

    // Constructor
    public IceCream(String flavor, double price, String size) {
        this.flavor = flavor;
        this.price = price;
        this.size = size;
    }

    // Getters
    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    // Abstract method
    public abstract void IceCreamDetails();
}

// Inheritance 
class ConeIceCream extends IceCream {
    private String coneType; // for storing the type of the cone 

    public ConeIceCream(String flavor, double price, String size, String coneType) {
        super(flavor, price, size);
        this.coneType = coneType;
    }

    // Getter for coneType
    public String getConeType() {
        return coneType;
    }

    @Override
    public void IceCreamDetails() {
        System.out.println("Cone Ice Cream - Flavor: " + getFlavor() + " - Price: " + getPrice() +
                " - Size: " + getSize() + " - Cone Type: " + coneType);
    }
}

// Inheritance 
class CupIceCream extends IceCream {
    private String topping; 

    public CupIceCream(String flavor, double price, String size, String topping) {
        super(flavor, price, size);
        this.topping = topping;
    }

    // Getter for topping
    public String getTopping() {
        return topping;
    }

    @Override
    public void IceCreamDetails() {
        System.out.println("Cup Ice Cream - Flavor: " + getFlavor() + " - Price: " + getPrice() +
                " - Size: " + getSize() + " - Topping: " + topping);
    }
}

