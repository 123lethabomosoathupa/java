/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter1;

/**
 * BottleSong
 * Prints the "10 Green Bottles" song using a while loop.
 *
 * @author letha
 */
public class BottleSong {

    public static void main(String[] args) {

        // Starting number of bottles
        int bottlesNum = 10;

        // Default word is plural because we start with more than one bottle
        String word = "bottles";

        // Continue looping while there are bottles remaining
        while (bottlesNum > 0) {

            // Change "bottles" to "bottle" when only one remains
            if (bottlesNum == 1) {
                word = "bottle"; // singular form
            }

            // Print the first line of the verse
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");

            // Print the second line of the verse
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");

            // Print the third line of the verse
            System.out.println("And if one green bottle should accidentally fall,");

            // Reduce the bottle count by one
            bottlesNum = bottlesNum - 1;

            // Print how many bottles remain
            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " green "
                        + word + ", hanging on the wall");
            } else {
                // Special message when no bottles are left
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}