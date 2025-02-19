package com.wipro.java.usecase8;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Adding key-value pairs
        map.put("Sankeerth", 25);
        map.put("John", 30);
        map.put("Sara", 22);
        map.put("Alice", 28);

        // Display all key-value pairs
        System.out.println("All entries in the map:");
        map.printMap();

        // Get values by keys
        System.out.println("\nGet value for key 'John': " + map.get("John"));
        System.out.println("Get value for key 'Alice': " + map.get("Alice"));

        // Remove a key-value pair
        System.out.println("\nRemoving key 'Sara'...");
        map.remove("Sara");

        // Display all key-value pairs after removal
        System.out.println("\nAll entries in the map after removal:");
        map.printMap();

        // Check if a key exists
        System.out.println("\nDoes key 'Arghya' exist? " + map.containsKey("Arghya"));
        System.out.println("Does key 'Sara' exist? " + map.containsKey("Sara"));
    }
}
