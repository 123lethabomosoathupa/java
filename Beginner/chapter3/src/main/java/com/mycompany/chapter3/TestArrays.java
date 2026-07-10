package com.mycompany.chapter3;

/**
 * This class demonstrates how to use arrays and
 * how one array can be used to reference another array.
 *
 * @author letha
 */
public class TestArrays {

    public static void main(String[] args) {

        // Array that stores indexes (positions)
        int[] index = new int[4];

        // Assigning index positions in a specific order
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        // Array that stores island names
        String[] islands = new String[4];

        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        // Counter variable for looping through arrays
        int y = 0;

        // Temporary variable to store the referenced index
        int ref;

        // Loop through all elements of the index array
        while (y < 4) {

            // Get the value stored in index[y]
            // This value is used to look up a position in the islands array
            ref = index[y];

            // Print the island name at the referenced position
            System.out.print("island = ");
            System.out.println(islands[ref]);

            // Move to next element
            y = y + 1;
        }
    }
}