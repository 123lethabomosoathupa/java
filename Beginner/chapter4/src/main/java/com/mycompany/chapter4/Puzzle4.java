package com.mycompany.chapter4;

/**
 * This class demonstrates arrays of objects,
 * loops, and method calls that manipulate values.
 */
public class Puzzle4 {

    public static void main(String[] args) {

        // Create an array that can hold 6 Value objects
        Value[] values = new Value[6];

        // Starting number used to assign values (1, 10, 100, ...)
        int number = 1;

        // Counter for the first loop
        int i = 0;

        // Initialize the array with Value objects and assign increasing numbers
        while (i < 6) {

            // Create a new Value object at position i
            values[i] = new Value();

            // Assign the current number to the object's intValue field
            values[i].intValue = number;

            // Multiply number by 10 for next element (1 → 10 → 100 → ...)
            number = number * 10;

            // Move to next index
            i = i + 1;
        }

        // Variable to store final computed result
        int result = 0;

        // Reset index to end of array
        i = 6;

        // Loop backwards through the array
        while (i > 0) {

            // Move to previous index
            i = i - 1;

            // Call doStuff() on each Value object and add result
            result = result + values[i].doStuff(i);
        }

        // Print final result
        System.out.println("result " + result);
    }
}