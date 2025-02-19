package com.wipro.java.usecase7;

import java.util.LinkedList;

public class LinkedInList {
    
    // LinkedList to hold users
    LinkedList<User> userList = new LinkedList<>();

    // Method to add a user to the list
    public void addUser(User user) {
        userList.add(user);
    }

    // Method to remove a user from the list by name
    public void removeUser(String name) {
        userList.removeIf(user -> user.getName().equalsIgnoreCase(name));
    }

    // Method to display the user list
    public void displayUsers() {
        if (userList.isEmpty()) {
            System.out.println("No users in the list.");
        } else {
            for (User user : userList) {
                user.displayUser();
            }
        }
    }

    // Main method to simulate the LinkedIn list usage
    public static void main(String[] args) {
        LinkedInList linkedInList = new LinkedInList();

        // Adding users to the list
        linkedInList.addUser(new User("Alice", "Software Engineer", "TechCorp", true));
        linkedInList.addUser(new User("Bob", "Product Manager", "InnovateInc", false));
        linkedInList.addUser(new User("Charlie", "Data Scientist", "DataWorks", true));
        linkedInList.addUser(new User("David", "UX Designer", "CreativeTech", false));

        // Displaying users in the list
        System.out.println("Users in LinkedIn List:");
        linkedInList.displayUsers();

        // Removing a user from the list
        System.out.println("\nRemoving 'Bob' from the list...");
        linkedInList.removeUser("Bob");

        // Displaying the updated user list
        System.out.println("\nUpdated Users in LinkedIn List:");
        linkedInList.displayUsers();
    }
}