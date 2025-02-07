package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RatingComparator implements Comparator<Movie1>{

	public int compare(Movie1 m1, Movie1 m2) {
		// sort by rating in high to low order
		return Double.compare(m2.getR(), m1.getR());
	}
 
	public static void main(String args[]) {
		ArrayList<Movie1> r1 = new ArrayList<>();
		r1.add(new Movie1("Marvel", 9.3,2018));
		r1.add(new Movie1("Hulk", 9.4, 2020));
		r1.add(new Movie1("Iron Man", 8.8, 2024));
		r1.add(new Movie1("Thanos", 8.7, 2023));
		
		Collections.sort(r1, new RatingComparator());
		System.out.println("Movies after sorting in Rating :");
		for(Movie1 m: r1) {
			System.out.println(m.getN()+" "+ m.getR()+" "+m.getY());
		}
	}
}