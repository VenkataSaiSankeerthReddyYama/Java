package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie> {
    private String n;
    private double r;
    private int y;

    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // Implementing the compareTo method to compare movies by year
    @Override
    public int compareTo(Movie m) {
        return this.y - m.y; // Compare based on the year
    }

    // Correcting the method name typo
    public String getName() {
        return n;
    }

    public double getRating() {
        return r;
    }

    // Adding the getYear method
    public int getYear() {
        return y;
    }

    public static void main(String[] args) {
        // Creating the list of Movie objects
        ArrayList<Movie> l = new ArrayList<>();
        l.add(new Movie("Star Wars", 8.7, 1977));
        l.add(new Movie("Empire Strikes Back", 8.8, 1980));
        l.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sorting the movies based on the year using compareTo
        Collections.sort(l);

        // Printing the sorted movies
        System.out.println("Movies after sorting by year: ");
        for (Movie m : l) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}
