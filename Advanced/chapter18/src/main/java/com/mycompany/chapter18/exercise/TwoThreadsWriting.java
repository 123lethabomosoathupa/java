package com.mycompany.chapter18.exercise;

import java.util.*;
import java.util.concurrent.*;

/**
 * Demonstrates two threads writing to the same ArrayList.
 *
 * @author letha
 */
public class TwoThreadsWriting {

    public static void main(String[] args) {

        // Create a thread pool that can run two threads simultaneously
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        // Create one shared Data object
        Data data = new Data();

        // First thread adds lowercase letters (a-z)
        threadPool.execute(() -> addLetterToData('a', data));

        // Second thread adds uppercase letters (A-Z)
        threadPool.execute(() -> addLetterToData('A', data));

        // Prevent any more tasks from being submitted
        threadPool.shutdown();
    }

    /**
     * Adds 26 letters to the shared Data object.
     *
     * @param letter Starting letter.
     * @param data Shared Data object.
     */
    private static void addLetterToData(char letter, Data data) {

        // Loop 26 times (one for each letter of the alphabet)
        for (int i = 0; i < 26; i++) {

            // Add the current letter to the shared list
            data.addLetter(letter++);

            try {

                // Pause for 50 milliseconds
                // This makes it easier to see both threads working together
                Thread.sleep(50);

            } catch (InterruptedException ignored) {

                // Ignore interruption exceptions
            }
        }

        // Print the contents of the shared list
        System.out.println(Thread.currentThread().getName()
                + data.getLetters());

        // Print the total number of elements in the list
        System.out.println(Thread.currentThread().getName()
                + " size = " + data.getLetters().size());
    }
}

/**
 * Stores letters added by multiple threads.
 */
final class Data {

    // Shared list that stores all letters
    private final List<String> letters = new ArrayList<>();

    /**
     * Returns the list of letters.
     *
     * @return List of letters.
     */
    public List<String> getLetters() {
        return letters;
    }

    /**
     * Adds one letter to the list.
     *
     * @param letter The character to add.
     */
    public void addLetter(char letter) {

        // Convert the character to a String and add it to the list
        letters.add(String.valueOf(letter));
    }
}