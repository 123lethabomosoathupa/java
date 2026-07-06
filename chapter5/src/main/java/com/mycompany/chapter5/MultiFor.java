package com.mycompany.chapter5;

/**
 * This class demonstrates nested for-loops and how loop control
 * affects program flow.
 */
public class MultiFor {

    public static void main(String[] args) {

        // Outer loop controls variable i (runs from 0 to 3)
        for (int i = 0; i < 4; i++) {

            // Inner loop controls variable j (runs from 4 down to 3)
            for (int j = 4; j > 2; j--) {

                // Print current values of i and j
                System.out.println(i + " " + j);
            }

            // Special condition: if i equals 1, increment it again
            // This causes the loop to skip the next value (2)
            if (i == 1) {
                i++;
            }
        }
    }
}