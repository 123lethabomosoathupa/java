package com.mycompany.chapter6;

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args) {

        // Create an ArrayList that stores String values
        ArrayList<String> a = new ArrayList<String>();

        // Add elements at specific index positions
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");

        // Display the current contents of the ArrayList
        printList(a);                          // Output: zero one two three

        // Check if the list contains "three"
        if (a.contains("three")) {

            // If found, add "four" to the end of the list
            a.add("four");
        }

        // Remove the element at index 2 ("two")
        a.remove(2);

        // Display the updated list
        printList(a);                          // Output: zero one three four

        // Check the index of "four"
        // If it is not at index 4, insert "4.2" at index 4
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }

        // Display the updated list
        printList(a);                          // Output: zero one three four 4.2

        // Check whether "two" still exists in the list
        if (a.contains("two")) {

            // This code will not execute because "two" was removed earlier
            a.add("2.2");
        }

        // Display the final contents of the list
        printList(a);                          // Output: zero one three four 4.2
    }

    // Method to print every element in the ArrayList
    public static void printList(ArrayList<String> list) {

        // Enhanced for loop to iterate through each element
        for (String element : list) {

            // Print each element followed by a space
            System.out.print(element + " ");
        }

        // Move to the next line after printing all elements
        System.out.println();
    }
}