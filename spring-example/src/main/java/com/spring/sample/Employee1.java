package com.spring.sample;

public class Employee1 {
    private int id;
    private String name;

    // Default constructor
    public Employee1() {
        // Optionally initialize default values
    }

    // Constructor for only id
    public Employee1(int id) {
        this.id = id;
    }

    // Constructor for only name
    public Employee1(String name) {
        this.name = name;
    }

    // Constructor for both id and name
    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and setter methods for id and name (Encapsulation)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Show method to display details
    void show() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
