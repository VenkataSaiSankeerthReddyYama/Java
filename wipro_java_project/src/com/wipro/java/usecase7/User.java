package com.wipro.java.usecase7;

import java.util.LinkedList;

class User {
    private String name;
    private String jobTitle;
    private String company;
    private boolean isActive;

    // Constructor to initialize the user details
    public User(String name, String jobTitle, String company, boolean isActive) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.company = company;
        this.isActive = isActive;
    }

    // Getter methods for the user properties
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public boolean isActive() {
        return isActive;
    }

    // Method to display user details
    public void displayUser() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Company: " + company + ", Active: " + (isActive ? "Yes" : "No"));
    }
}

