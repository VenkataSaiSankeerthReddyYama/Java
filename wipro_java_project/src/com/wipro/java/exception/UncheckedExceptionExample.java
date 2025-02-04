package com.wipro.java.exception;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0; // This will cause a division by zero error
        
        try {
            // Trying to divide by zero, which will throw an ArithmeticException
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the unchecked exception (ArithmeticException)
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        System.out.println("Execution continues after exception handling.");
    }
}
