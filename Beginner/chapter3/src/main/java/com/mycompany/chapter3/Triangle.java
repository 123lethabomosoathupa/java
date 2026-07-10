package com.mycompany.chapter3;

/**
 * This class demonstrates object arrays, methods, and how object references work.
 * Each Triangle object calculates its area based on height and length.
 *
 * @author letha
 */
public class Triangle {

    // Instance variables for each triangle
    double area;
    int height;
    int length;

    public static void main(String[] args) {

        // Counter variable for looping through the array
        int x = 0;

        // Create an array that can hold 4 Triangle objects
        Triangle[] ta = new Triangle[4];

        // Create and initialize each Triangle object in the array
        while (x < 4) {

            // Create a new Triangle object at position x
            ta[x] = new Triangle();

            // Set height based on loop counter
            ta[x].height = (x + 1) * 2;

            // Set length based on loop counter
            ta[x].length = x + 4;

            // Calculate the area using the setArea method
            ta[x].setArea();

            // Print triangle index and its calculated area
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);

            // Move to next triangle
            x = x + 1;
        }

        // Store final value of x (which is now 4)
        int y = x;

        // Change x to a new value (does not affect array)
        x = 27;

        // Create a reference (alias) to the third triangle (index 2)
        Triangle t5 = ta[2];

        // Modify the area of the third triangle
        ta[2].area = 343;

        // Print values to show how references work
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    // Method to calculate the area of a triangle
    void setArea() {
        area = (height * length) / 2;
    }
}