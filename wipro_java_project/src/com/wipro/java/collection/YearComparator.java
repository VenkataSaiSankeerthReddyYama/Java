package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class YearComparator implements Comparator<Movie1> {
	
	public int compare(Movie1 m1, Movie1 m2) {
        return Integer.compare(m1.getY(), m2.getY()); // Oldest to Newest
    }
 
	public static void main(String args[]) {
		ArrayList<Movie1> y1 = new ArrayList<>();
		y1.add(new Movie1("Marvel", 9.3,2018));
		y1.add(new Movie1("Hulk", 9.4, 2020));
		y1.add(new Movie1("Iron Man", 8.8, 2024));
		y1.add(new Movie1("Thanos", 8.7, 2023));
		Collections.sort(y1, new YearComparator());
		System.out.println("Movies after sorting in release year :");
		for(Movie1 m: y1) {
			System.out.println(m.getN()+" "+ m.getR()+" "+m.getY());
		}
	}
}