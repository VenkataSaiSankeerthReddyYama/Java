package com.wipro.java.collection.treemap;

import java.sql.*;
import java.util.Scanner;

public class DatabaseHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName;
        int correctAnswers = 0;
        int totalAttempts = 5;  // Total number of questions in the quiz

        // Get player name
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();

        // Define questions and answers
        String[] questions = {
            "What is the capital of France? (a) Berlin (b) Madrid (c) Paris (d) Rome",
            "What is 2 + 2? (a) 3 (b) 4 (c) 5 (d) 6",
            "Who is the CEO of Tesla? (a) Jeff Bezos (b) Elon Musk (c) Bill Gates (d) Mark Zuckerberg",
            "What is the largest ocean? (a) Atlantic Ocean (b) Indian Ocean (c) Pacific Ocean (d) Arctic Ocean",
            "What is the square root of 16? (a) 2 (b) 3 (c) 4 (d) 5"
        };

        String[] correctAnswersList = {"c", "b", "b", "c", "c"};

        // Ask questions and check answers
        for (int i = 0; i < totalAttempts; i++) {
            System.out.println(questions[i]);
            String playerAnswer = scanner.nextLine().trim().toLowerCase();

            if (playerAnswer.equals(correctAnswersList[i])) {
                correctAnswers++;
            }
        }

        // Display the result
        System.out.println("Quiz Over! You got " + correctAnswers + " out of " + totalAttempts + " correct.");

        // Save the result to the database
        saveGameResult(playerName, correctAnswers, totalAttempts);

        scanner.close();
    }

    // Method to save the game result to the database
    private static void saveGameResult(String playerName, int correctAnswers, int totalAttempts) {
        String url = "jdbc:mysql://localhost:3306/demo1?serverTimezone=UTC";
        String username = "root";  // Replace with your MySQL username
        String password = "Reddy123!";  // Replace with your MySQL password

        String query = "INSERT INTO demo1 (player_name, correct_answers, total_attempts) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            // Set the values in the prepared statement
            stmt.setString(1, playerName);
            stmt.setInt(2, correctAnswers);
            stmt.setInt(3, totalAttempts);

            // Execute the update
            stmt.executeUpdate();
            System.out.println("Your score has been saved to the database!");

        } catch (SQLException e) {
            System.out.println("Error saving game result to the database.");
            e.printStackTrace();
        }
    }
}
