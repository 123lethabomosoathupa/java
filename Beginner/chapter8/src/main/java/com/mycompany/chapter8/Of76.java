package com.mycompany.chapter8;

public class Of76 extends Clowns {

    public static void main(String[] args) {

        // Create an array that can store objects implementing the Nose interface
        Nose[] i = new Nose[3];

        // Store different objects in the array
        i[0] = new Acts();     // Acts object
        i[1] = new Clowns();   // Clowns object
        i[2] = new Of76();     // Of76 object (inherits from Clowns)

        // Loop through each object in the array
        for (int x = 0; x < 3; x++) {

            // Call the iMethod() of each object (polymorphism)
            // Then display the object's runtime class
            System.out.println(i[x].iMethod() + " " + i[x].getClass());
        }
    }
}

// Interface that declares the iMethod() method
interface Nose {

    // Any class implementing Nose must provide this method
    public int iMethod();
}

// Abstract class that implements the Nose interface
abstract class Picasso implements Nose {

    // Default implementation of iMethod()
    public int iMethod() {
        return 7;
    }
}

// Clowns inherits Picasso's implementation of iMethod()
// Therefore, calling iMethod() on a Clowns object returns 7
class Clowns extends Picasso { }

// Acts also inherits from Picasso
class Acts extends Picasso {

    // Override the inherited iMethod()
    // This version returns 5 instead of 7
    public int iMethod() {
        return 5;
    }