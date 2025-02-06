package com.wipro.java.java8;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

    public static void checkingAdjusters() {

        // Get current date
        LocalDate date = LocalDate.now();
        System.out.println("The current date is: " + date);

        // First day of next month
        LocalDate firstDayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month: " + firstDayOfNextMonth);

        // Next Saturday from now
        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Next Saturday from now: " + nextSaturday);

        // Last day of the current month
        LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of this month: " + lastDayOfMonth);
    }

    // Driver code
    public static void main(String[] args) {
        checkingAdjusters();
    }
}
