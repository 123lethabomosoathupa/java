/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter1;

/**
 *
 * @author letha
 */
public class PoolPuzzleOne {

    public static void main(String[] args) {

        // Initialize x to control loop flow
        int x = 0;

        // Loop runs while x is less than 4
        while (x < 4) {

            // Always print "a" at the start of each loop
            System.out.print("a");

            // If x is 0, print a space
            if (x < 1) {
                System.out.print(" ");
            }

            // Print "n" in every iteration
            System.out.print("n");

            // If x is greater than 1 (x = 2 or 3)
            if (x > 1) {
                System.out.print(" oyster");

                // Skip ahead by 2 to change loop flow
                x = x + 2;
            }

            // If x equals 1, print "noys"
            if (x == 1) {
                System.out.print("noys");
            }

            // If x is still less than 1, print "oise"
            if (x < 1) {
                System.out.print("oise");
            }

            // Move to the next line after each iteration
            System.out.println();

            // Increment x by 1 (unless already modified above)
            x = x + 1;
        }
    }
}
