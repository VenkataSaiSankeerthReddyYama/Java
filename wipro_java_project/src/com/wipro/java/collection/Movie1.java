package com.wipro.java.collection;

class Movie1 {
    private String n;
    private double r;
    private int y;

    public Movie1(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    public String getN() {
        return n;
    }

    public double getR() {
        return r;
    }

    public int getY() {
        return y; // Fixed by removing any non-breaking spaces
    }
}
