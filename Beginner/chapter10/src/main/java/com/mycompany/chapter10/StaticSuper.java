package com.mycompany.chapter10;

// Superclass demonstrating a static initialization block
public class StaticSuper {

    // Static block
    // Executes only once when the class is first loaded into memory
    // This happens before any objects are created
    static {
        System.out.println("super static block");
    }

    // Constructor
    // Executes every time a new StaticSuper object (or subclass object)
    // is created
    StaticSuper() {
        System.out.println("super constructor");
    }
}