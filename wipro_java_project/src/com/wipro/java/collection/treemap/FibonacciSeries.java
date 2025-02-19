package com.wipro.java.collection.treemap;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter how many Fibonacci numbers they want
            System.out.print("Enter the number of terms in Fibonacci series: ");
            int n = scanner.nextInt();

            // Call the method to print the Fibonacci series
            printFibonacciSeries(n);
        } finally {
            // Close the scanner to avoid resource leak
            scanner.close();
        }
    }

    // Method to print Fibonacci series
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        // Print the Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // Update the values of first and second for the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }


    }


