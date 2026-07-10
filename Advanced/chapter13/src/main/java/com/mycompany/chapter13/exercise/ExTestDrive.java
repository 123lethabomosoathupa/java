/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter13.exercise;

/**
 * Custom exception class.
 *
 * @author letha
 */
class MyEx extends Exception {
}

public class ExTestDrive {

    public static void main(String[] args) {

        // Store the first command-line argument
        String test = args[0];

        try {
            // Prints "t"
            System.out.print("t");

            // Call the method that may throw a MyEx exception
            doRisky(test);

            // Executes only if no exception is thrown
            System.out.print("o");

        } catch (MyEx e) {

            // Executes if MyEx is thrown
            System.out.print("a");

        } finally {

            // Always executes, whether an exception occurs or not
            System.out.print("w");
        }

        // Prints "s" after the try-catch-finally block completes
        System.out.println("s");
    }

    /**
     * Prints characters and throws an exception if the
     * argument equals "yes".
     *
     * @param t The string passed from the command line.
     * @throws MyEx if the value of t is "yes".
     */
    static void doRisky(String t) throws MyEx {

        // Prints "h"
        System.out.print("h");

        // If the argument is "yes", throw a custom exception
        if ("yes".equals(t)) {
            throw new MyEx();
        }

        // Executes only if no exception is thrown
        System.out.print("r");
    }
}