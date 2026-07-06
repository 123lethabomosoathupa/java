package com.mycompany.chapter7;

/**
 * The Boat class represents a basic boat.
 * It contains a length attribute and methods
 * to set, retrieve, and move the boat.
 */
public class Boat {

    // Stores the length of the boat
    private int length;

    /**
     * Sets the length of the boat.
     *
     * @param len the length to assign to the boat
     */
    public void setLength(int len) {
        length = len;
    }

    /**
     * Returns the current length of the boat.
     *
     * @return the boat's length
     */
    public int getLength() {
        return length;
    }

    /**
     * Simulates the movement of a boat.
     * This method can be inherited or overridden
     * by subclasses.
     */
    public void move() {
        System.out.print("drift ");
    }
}