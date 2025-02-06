package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Name implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName()); // Ascending order (A-Z)
    }

    public static void main(String[] args) {
        // Create a list of Movie objects
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Shutter Island", 8.2, 2010));

        // Sorting movies by name using the custom comparator
        Collections.sort(movies, new Name());

        // Display sorted movies
        System.out.println("Movies sorted by Name (A-Z):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
