package com.mycompany.chapter7;

/**
 * This class tests the Boat, Sailboat, and Rowboat classes.
 * It demonstrates inheritance, method overriding, and
 * inherited methods.
 */
public class TestBoats {

    public static void main(String[] args) {

        // Create a Boat object
        Boat b1 = new Boat();

        // Create a Sailboat object
        Sailboat b2 = new Sailboat();

        // Create a Rowboat object
        Rowboat b3 = new Rowboat();

        // Set the length of the sailboat
        b2.setLength(32);

        // Call the Boat class move() method
        // Output: drift
        b1.move();

        // Rowboat inherits the move() method from Boat
        // Output: drift
        b3.move();

        // Sailboat overrides the move() method
        // Output: hoist sail
        b2.move();
    }
}