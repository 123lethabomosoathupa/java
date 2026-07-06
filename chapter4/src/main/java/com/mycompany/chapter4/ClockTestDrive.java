package com.mycompany.chapter4;

/**
 * This class tests the Clock class by creating a Clock object,
 * setting a time, and printing it out.
 */
public class ClockTestDrive {

    public static void main(String[] args) {

        // Create a new Clock object
        Clock c = new Clock();

        // Set the time on the clock
        c.setTime("1245");

        // Get the current time from the clock
        String tod = c.getTime();

        // Print the time to the console
        System.out.println("time: " + tod);
    }
}