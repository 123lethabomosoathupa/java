/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter1;

/**
 *
 * @author letha
 */
public class Test {

    public static void main(String[] args) {

        // Initialize x to 0 (controls the loop)
        int x = 0; 

        // Initialize y to 0 (value may or may not change depending on candidate code)
        int y = 0;

        // Loop runs while x is less than 5
        while (x < 5) {

            // -------------------------------
            // Candidate code would go here
            // This is where y could be changed
            // -------------------------------

            // Print current values of x and y together
            // "" forces string concatenation so numbers are not added mathematically
            System.out.print(x + "" + y + " ");

            // Increase x by 1 each loop iteration
            x = x + 1;
        }
    }
}
