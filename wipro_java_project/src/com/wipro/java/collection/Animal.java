package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// POJO Class implementing Comparable for Age
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for printing
    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }

    // Method to sort by age (low to high)
    public static void sortByAge(List<Animal> animals) {
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return Integer.compare(a1.getAge(), a2.getAge()); // Ascending order of age
            }
        });
    }

    // Method to sort by name (alphabetical order)
    public static void sortByName(List<Animal> animals) {
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.getName().compareTo(a2.getName()); // Sorting by name (alphabetical order)
            }
        });
    }

    // Main method for testing
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Elephant", 25));
        animals.add(new Animal("Tiger", 15));
        animals.add(new Animal("Lion", 10));
        animals.add(new Animal("Giraffe", 8));

        // Sorting by Age using the sortByAge method (ascending)
        System.out.println("Animals sorted by Age (low to high):");
        sortByAge(animals);
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Sorting by Name using the sortByName method (alphabetical order)
        System.out.println("\nAnimals sorted by Name (alphabetical order):");
        sortByName(animals);
        for (Animal animal : animals) {
            System.out.println(animal);  // Corrected this line
        }
    }
}
