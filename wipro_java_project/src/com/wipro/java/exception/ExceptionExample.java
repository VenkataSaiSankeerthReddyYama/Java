package com.wipro.java.exception;

public class ExceptionExample { // Changed the class name to avoid conflict with the built-in Exception class
    public static void main(String[] args) {
        try {
            // Assigning two numbers
            int num1 = 10;
            int num2 = 20;

            // Performing addition
            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        }
        catch (Exception e) {
            // Catching any general exception
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            // This block always executes
            System.out.println("Execution completed.");
        }
    }
}
