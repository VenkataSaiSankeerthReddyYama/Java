package com.wipro.java.collection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // Using List to store Apple, Banana, and Cherry
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List (ArrayList): " + list);

        // Using Set to store unique fruits (no duplicates allowed)
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicates will not be added

        System.out.println("Set (HashSet) - Unique values: " + set);

        // Using Queue to store fruits (FIFO order)
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue (FIFO order):");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // poll() retrieves and removes the head of the queue
        }

        // Using Map to associate each fruit with a unique number
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Map (HashMap) with key-value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
