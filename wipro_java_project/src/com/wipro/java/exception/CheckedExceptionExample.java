
package com.wipro.java.exception;

import java.io.FileReader;  // Importing FileReader class
import java.io.IOException; // Importing IOException class

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to read from a file that may not exist
            FileReader file = new FileReader("nonexistentfile.txt");
            file.read();
            file.close();
        } catch (IOException e) {
            // Handling the checked exception (IOException)
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        
        System.out.println("Execution continues after exception handling.");
    }
}
