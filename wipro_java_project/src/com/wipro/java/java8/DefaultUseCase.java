package com.wipro.java.java8;


interface TestInterface2 {
    
    public void square(int a);

    
    static String show() {
        return "Static Method Executed from TestInterface2";
    }
}

// Second interface with one abstract method and one static method
interface TestInterface3 {
    // Abstract method to calculate the cube of an integer
    public void cube(int a);

    // Static method to show a message
    static String show() {
        return "Static Method Executed from TestInterface3";
    }
}

// Implementing both interfaces in DefaultUseCase class
public class DefaultUseCase implements TestInterface2, TestInterface3 {

    // Implementing the square method from TestInterface2
    @Override
    public void square(int a) {
        System.out.println("Square of " + a + " is: " + (a * a));
    }

    // Implementing the cube method from TestInterface3
    @Override
    public void cube(int a) {
        System.out.println("Cube of " + a + " is: " + (a * a * a));
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Creating an object of DefaultUseCase
        DefaultUseCase obj = new DefaultUseCase();

        // Calling the square method from TestInterface2
        obj.square(5);

        // Calling the cube method from TestInterface3
        obj.cube(3);

        // Calling the static methods directly through the interfaces
        System.out.println(TestInterface2.show());
        System.out.println(TestInterface3.show());
    }
}
