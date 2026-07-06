package com.mycompany.chapter3;

/**
 * This class demonstrates arrays, object creation, and loops
 * using simple Hobbit objects.
 *
 * @author letha
 */
public class Hobbits {

    // Each Hobbit has a name
    String name;

    public static void main(String[] args) {

        // Create an array that can store 3 Hobbits objects
        Hobbits[] h = new Hobbits[3];

        // Start counter at -1 so we can increment at the start of the loop
        int z = -1;

        // Loop runs while z is less than 2 (so z = 0, 1, 2 will execute)
        while (z < 2) {

            // Move to the next index in the array
            z = z + 1;

            // Create a new Hobbit object at position z
            h[z] = new Hobbits();

            // Default name assignment
            h[z].name = "bilbo";

            // Change name based on index
            if (z == 1) { 
                h[z].name = "frodo"; 
            }

            if (z == 2) { 
                h[z].name = "sam"; 
            }

            // Print the Hobbit's name and a message
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}