package com.mycompany.chapter5;

public class ForLoopDemo {
    public static void main(String[] args) {

        // Regular for loop
        System.out.println("--- Regular for loop ---");
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
        }
        System.out.println("done");

        // Enhanced for loop
        System.out.println("\n--- Enhanced for loop ---");
        String[] nameArray = {"Fred", "Mary", "Bob"};
        for (String name : nameArray) {
            System.out.println(name);
        }

        // Pre vs post increment
        System.out.println("\n--- Pre vs Post Increment ---");
        int x = 0;
        int z = ++x;    // pre: increment first, then assign
        System.out.println("pre:  x=" + x + " z=" + z);  // x=1, z=1

        x = 0;
        z = x++;        // post: assign first, then increment
        System.out.println("post: x=" + x + " z=" + z);  // x=1, z=0

        // Casting
        System.out.println("\n--- Casting ---");
        int randomNum = (int) (Math.random() * 5);
        System.out.println("Random 0-4: " + randomNum);

        float f = 3.14f;
        int whole = (int) f;
        System.out.println("float 3.14 cast to int: " + whole);
    }
}