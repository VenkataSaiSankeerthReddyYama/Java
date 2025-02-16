package com.wipro.java.example.shape;

import com.wipro.java.example.shape.shapes.Circle;
import com.wipro.java.example.shape.shapes.Rectangle;
import com.wipro.java.example.shape.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        // Create and add a Circle
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        // Clone the circle and add it to the list
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        // Create and add a Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        // Perform clone and comparison
        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        // Clone all shapes
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        // Compare original and cloned shapes
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
