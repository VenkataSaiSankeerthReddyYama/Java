package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main (String[] args) {
        
        int n = 5;
        
        List<Integer> l1 = new LinkedList<Integer>();
        
        // Adding elements to the list
        for (int i = 1; i <= n; i++) {
            l1.add(i);
        }
        
        System.out.println(l1); // Printing the list
        
        // Removing an element at index 3
        l1.remove(3);
        
        System.out.println(l1); // Printing the list after removal
        
        // Iterating through the list and printing each element
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
    }
}
