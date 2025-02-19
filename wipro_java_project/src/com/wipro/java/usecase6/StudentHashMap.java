package com.wipro.java.usecase6;

import java.util.*;

public class StudentHashMap {

    // Define the hashmap with roll number as key and list of names as value
    static Map<Integer, List<String>> students = new HashMap<>();

    // Function to add student to the hashmap
    public static void addStudent(int rollNumber, String name) {
        // Check if the roll number already exists in the hashmap
        if (students.containsKey(rollNumber)) {
            // If roll number exists, add the name to the existing list
            students.get(rollNumber).add(name);
        } else {
            // If roll number does not exist, create a new list and add the name
            List<String> namesList = new ArrayList<>();
            namesList.add(name);
            students.put(rollNumber, namesList);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Adding students to the hashmap (some duplicates in roll number)
        addStudent(101, "Alice");
        addStudent(102, "Bob");
        addStudent(103, "Charlie");
        addStudent(104, "David");
        addStudent(105, "Eva");
        addStudent(101, "Alice");  // Duplicate roll number
        addStudent(106, "Frank");
        addStudent(107, "Grace");
        addStudent(103, "Charlie");  // Duplicate roll number
        addStudent(108, "Hannah");

        // Printing out the students with roll numbers and their corresponding names
        for (Map.Entry<Integer, List<String>> entry : students.entrySet()) {
            int rollNumber = entry.getKey();
            List<String> names = entry.getValue();
            System.out.println("Roll Number: " + rollNumber + " -> " + names);
        }
    }
}
