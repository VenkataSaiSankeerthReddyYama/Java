package com.wipro.java.collection;

public class Movie {
    private String name;
    private double rating;
    private int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    // Override toString method to print movie details
    @Override
    public String toString() {
        return name + " (" + year + ") - Rating: " + rating;
    }
}

