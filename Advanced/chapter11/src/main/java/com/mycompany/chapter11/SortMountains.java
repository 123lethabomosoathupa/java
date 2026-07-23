package com.mycompany.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how to sort objects stored in an ArrayList using lambda
 * expressions.
 *
 * The program sorts Mountain objects: 1. By name (alphabetically) 2. By height
 * (highest to lowest)
 *
 * @author letha
 */
public class SortMountains {

    // Program execution starts here.
    public static void main(String[] args) {
        new SortMountains().go();
    }

    // Creates a list of mountains and sorts them in different ways.
    public void go() {

        // Create an empty ArrayList that stores Mountain objects.
        List<Mountain> mountains = new ArrayList<>();

        // Add Mountain objects to the list.
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));

        // Display the list in the order the mountains were added.
        System.out.println("As entered:\n" + mountains);

        // Sort the list alphabetically by mountain name.
        // compareTo() compares two strings.
        // A negative value means m1 comes before m2.
        mountains.sort((m1, m2) -> m1.name.compareTo(m2.name));

        // Display the sorted list.
        System.out.println("By name:\n" + mountains);

        // Sort the list by height in descending order.
        // m2.height - m1.height means taller mountains come first.
        mountains.sort((m1, m2) -> m2.height - m1.height);

        // Display the list sorted by height.
        System.out.println("By height:\n" + mountains);
    }
}

/**
 * Represents a mountain with a name and height.
 */
class Mountain {

    // Stores the mountain's name.
    String name;

    // Stores the mountain's height in feet.
    int height;

    // Constructor used to create a Mountain object.
    Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // Returns a readable string representation of a Mountain object.
    // This method is automatically called when printing the object.
    @Override
    public String toString() {
        return name + " " + height;
    }
}
