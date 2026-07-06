package com.mycompany.chapter1;

// Class declaration
public class MixedMessages {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Initialize variables
        int x = 0;
        int y = 0;

        // Loop continues as long as x is less than 5
        while (x < 5) {

            // ==================================================
            // Insert the candidate block of code here.
            // This is where you can modify x and/or y before
            // they are printed.
            // ==================================================
            // Print the current values of x and y without spaces
            // between them, followed by a space.
            // Example output: 00 11 22 ...
            System.out.print(x + "" + y + " ");

            // Increment x by 1 after each iteration
            x = x + 1;
        }
    }
}
