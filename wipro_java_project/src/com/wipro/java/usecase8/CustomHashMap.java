package com.wipro.java.usecase8;

import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] table;

    // Constructor to initialize the HashMap
    public CustomHashMap() {
        table = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to determine the index in the table
    private int hash(K key) {
        return key.hashCode() % table.length;
    }

    // Method to put a key-value pair in the map
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        // Check if the key already exists in the bucket
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update the value if the key already exists
                return;
            }
        }

        // If the key does not exist, add a new entry
        bucket.add(new Entry<>(key, value));
    }

    // Method to get the value associated with a key
    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        // Look for the key in the bucket
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value; // Return the value if the key is found
            }
        }

        return null; // Return null if the key is not found
    }

    // Method to remove a key-value pair from the map
    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        // Find and remove the entry
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                return;
            }
        }
    }

    // Method to check if the map contains a specific key
    public boolean containsKey(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return true; // Return true if the key exists
            }
        }

        return false; // Return false if the key is not found
    }

    // Method to print all key-value pairs in the map
    public void printMap() {
        for (int i = 0; i < table.length; i++) {
            LinkedList<Entry<K, V>> bucket = table[i];
            for (Entry<K, V> entry : bucket) {
                System.out.println("Key: " + entry.key + ", Value: " + entry.value);
            }
        }
    }

    // Entry class to store key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;

        // Constructor to initialize the Entry
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
