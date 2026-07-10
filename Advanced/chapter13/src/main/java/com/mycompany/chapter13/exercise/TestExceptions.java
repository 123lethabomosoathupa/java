/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter13.exercise;

/**
 * Demonstrates how try, catch, and finally work together.
 *
 * @author letha
 */
public class TestExceptions {

    public static void main(String[] args) {

        // Change this value to "yes" to force an exception
        String test = "no";

        try {

            // Beginning of the try block
            System.out.println("start try");

            // Call a method that may throw a ScaryException
            doRisky(test);

            // Executes only if no exception is thrown
            System.out.println("end try");

        } catch (ScaryException se) {

            // Executes only if ScaryException is thrown
            System.out.println("scary exception");

        } finally {

            // Always executes, whether an exception occurs or not
            System.out.println("finally");
        }

        // Executes after the try-catch-finally block
        System.out.println("end of main");
    }

    /**
     * Prints messages and throws an exception if
     * the test value equals "yes".
     *
     * @param test The value used to determine whether an exception is thrown.
     * @throws ScaryException if test equals "yes".
     */
    static void doRisky(String test) throws ScaryException {

        // Indicates the start of the method
        System.out.println("start risky");

        // Throw a custom exception if test equals "yes"
        if ("yes".equals(test)) {
            throw new ScaryException();
        }

        // Executes only if no exception is thrown
        System.out.println("end risky");
    }
}

/**
 * Custom exception class.
 */
class ScaryException extends Exception {
}