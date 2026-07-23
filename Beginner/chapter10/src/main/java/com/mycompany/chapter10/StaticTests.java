package com.mycompany.chapter10;

// Subclass that extends StaticSuper
public class StaticTests extends StaticSuper {

    // Static variable shared by all StaticTests objects
    static int rand;

    // Static initialization block
    // Executes only once when the StaticTests class is loaded
    static {

        // Generate a random number between 0 and 5
        rand = (int) (Math.random() * 6);

        // Display the random number
        System.out.println("static block " + rand);
    }

    // Constructor
    // Executes every time a StaticTests object is created
    StaticTests() {
        System.out.println("constructor");
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Print a message before creating the object
        System.out.println("in main");

        // Create a StaticTests object
        // This automatically calls the superclass constructor first
        StaticTests st = new StaticTests();
    }
}