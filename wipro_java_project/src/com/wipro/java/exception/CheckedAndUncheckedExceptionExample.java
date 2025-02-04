package com.wipro.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedAndUncheckedExceptionExample {
    public static void main(String[] args) {
        // Checked Exception Example (FileNotFoundException)
        try {
            // Trying to open a file that might not exist
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);
            // Attempting to read the file
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handling the checked exception (FileNotFoundException)
            System.out.println("Checked exception occurred: File not found - " + e.getMessage());
        }

        // Unchecked Exception Example (ArithmeticException)
        try {
            int num1 = 10;
            int num2 = 0; // This will cause a division by zero error
            int result = num1 / num2; // Division by zero will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the unchecked exception (ArithmeticException)
            System.out.println("Unchecked exception occurred: " + e.getMessage());
        }

        System.out.println("Execution continues after exception handling.");
    }
}
