package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
    private String n; // Movie Name
    private double r; // Movie Rating
    private int y; // Release year 

    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    public int compareTo(Movie m) {
        // Sort by highest rating first
        if (this.r < m.r) {
            return 1;  // Current movie has lower rating
        } else if (this.r > m.r) {
            return -1; // Current movie has higher rating
        } else {
            return 0;  // Ratings are equal
        }
    }

    public String getName() {
        return n;
    }

    public double getRating() {
        return r;
    }

    public int getYear() {
        return y;
    }

    public static void main(String[] args) {
        ArrayList<Movie> l = new ArrayList<>();

        l.add(new Movie("RRR", 8.7, 2023));
        l.add(new Movie("PUSHPA", 8.8, 2024));
        l.add(new Movie("BAHUBALI", 9.3, 2018));
        l.add(new Movie("KGF", 9.4, 2020)); // Added another movie

        Collections.sort(l);

        System.out.println("Movies after sorting by rating (Descending):");
        for (Movie m : l) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    } // This closing brace closes the main method.
} // This closing brace closes the Movie class.
