package com.wipro.java.collection.treemap;

import java.util.Comparator;
import java.util.LinkedList;

public class SortLinkedListUsingComparator {

    public static void main(String[] args) {
        // Create a LinkedList of Employee objects
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(101, "John"));
        employeeList.add(new Employee(103, "Alice"));
        employeeList.add(new Employee(102, "Bob"));

        // Print the LinkedList before sorting
        System.out.println("Before Sorting: " + employeeList);

        // Sort the LinkedList by employee id using Comparator
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });

        // Print the LinkedList after sorting by id
        System.out.println("After Sorting by ID: " + employeeList);

        // Sort the LinkedList by employee name using Comparator
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        // Print the LinkedList after sorting by name
        System.out.println("After Sorting by Name: " + employeeList);
    }
}


