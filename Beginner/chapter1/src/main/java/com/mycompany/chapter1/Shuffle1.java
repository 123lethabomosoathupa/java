/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter1;

/**
 *
 * @author letha
 */
class Shuffle1 {

    public static void main(String[] args) {

        // Initialize x with a value of 3
        int x = 3;

        // Continue looping while x is greater than 0
        while (x > 0) {

            // If x is greater than 2, print "a"
            if (x > 2) {
                System.out.print("a");
            }

            // Decrease x by 1
            x = x - 1;

            // Print "-"
            System.out.print("-");

            // If x is now equal to 2, print "b c"
            if (x == 2) {
                System.out.print("b c");
            }

            // If x is now equal to 1, print "d"
            if (x == 1) {
                System.out.print("d");

                // Decrease x by 1 again
                x = x - 1;
            }
        }
    }
}