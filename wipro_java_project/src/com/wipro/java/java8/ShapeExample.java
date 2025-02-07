package com.wipro.java.java8;

interface Shape {
    // Area method with two parameters for shapes like Rectangle and Triangle
    double area(double l, double w);

    // Default method to display shape name
    default void display(String n) {
        System.out.println("Shape: " + n);
    }

    // Default method to return the number of sides of the shape (default is 0)
    default int sides() {
        return 0;
    }

    // Static method to print the area formula statement
    static void formula() {
        System.out.println("Area varies.");
    }

    // Static method to create shapes based on the input string
    static Shape create(String t) {
        Shape shape = null;
        switch (t.toLowerCase()) {
            case "circle":
                shape = new Rectangle();
                break;
            case "rectangle":
                shape = new Triangle();
                break;
            default:
                shape = null;
                break;
        }
        return shape;
    }
}

class Rectangle implements Shape {
    // Implementing area calculation for Rectangle (length * width)
    public double area(double l, double w) {
        return l * w;
    }

    // Overriding default sides method for Rectangle (4 sides)
    public int sides() {
        return 4;
    }
}

class Triangle implements Shape {
    // Implementing area calculation for Triangle (0.5 * base * height)
    public double area(double b, double h) {
        return 0.5 * b * h;
    }

    // Overriding default sides method for Triangle (3 sides)
    public int sides() {
        return 3;
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        // Creating a Rectangle shape using the static create method
        Shape r = Shape.create("circle");
        if (r != null) {
            r.display("circle");
            System.out.println("Area: " + r.area(5, 10));
            System.out.println("Sides: " + r.sides());
            Shape.formula();
        }

        // Creating a Triangle shape using the static create method
        Shape t = Shape.create("rectangle");
        if (t != null) {
            t.display("rectangle");
            System.out.println("Area: " + t.area(6, 8));
            System.out.println("Sides: " + t.sides());
            Shape.formula();
        }

        // Checking if an invalid shape type is provided (e.g., "circle")
        if (Shape.create("square") == null) {
            System.out.println("Unknown shape.");
        }
    }
}
