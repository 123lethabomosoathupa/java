/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter1;

/**
 * Phrase-O-Matic
 * Generates a random buzzword phrase by selecting one word
 * from each of three different word lists.
 *
 * @author letha
 */
public class PhraseOMatic {

    public static void main(String[] args) {

        // First list of buzzwords
        String[] wordListOne = {"agnostic", "opinionated", "voice activated",
            "haptically driven", "extensible", "reactive", "agent based",
            "functional", "AI enabled", "strongly typed"};

        // Second list of buzzwords
        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous",
            "event driven", "pub-sub", "IoT", "cloud native", "service oriented",
            "containerized", "serverless", "microservices", "distributed ledger"};

        // Third list of buzzwords
        String[] wordListThree = {"framework", "library", "DSL", "REST API",
            "repository", "pipeline", "service mesh", "architecture",
            "perspective", "design", "orientation"};

        // Get the size of each array
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Create a Random object for generating random numbers
        java.util.Random randomGenerator = new java.util.Random();

        // Generate random indexes within the bounds of each array
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // Build a phrase using randomly selected words
        String phrase = wordListOne[rand1] + " "
                + wordListTwo[rand2] + " "
                + wordListThree[rand3];

        // Display the generated phrase to the user
        System.out.println("What we need is a " + phrase);
    }
}