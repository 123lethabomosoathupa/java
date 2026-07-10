/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 * A simple guessing game where three players attempt
 * to guess a randomly generated number between 0 and 9.
 *
 * @author letha
 */
public class GuessGame {

    // Declare three Player objects
    Player p1;
    Player p2;
    Player p3;

    // Method that starts and controls the game
    public void startGame() {

        // Create the three players
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Variables to store each player's guess
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Variables to track whether a player guessed correctly
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // Generate a random number between 0 and 9
        int targetNumber = (int) (Math.random() * 10);

        // Inform the players about the range
        System.out.println("I'm thinking of a number between 0 and 9...");

        // Continue playing until at least one player guesses correctly
        while (true) {

            // Display the target number (for testing purposes)
            System.out.println("Number to guess is " + targetNumber);

            // Ask each player to make a guess
            p1.guess();
            p2.guess();
            p3.guess();

            // Retrieve and display each player's guess
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            // Check whether each player guessed correctly
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }

            if (guessp2 == targetNumber) {
                p2isRight = true;
            }

            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            // If at least one player guessed correctly
            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("We have a winner!");

                // Display which players guessed correctly
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);

                System.out.println("Game is over.");

                // Exit the loop and end the game
                break;

            } else {

                // No correct guesses, continue another round
                System.out.println("Players will have to try again.");
            }
        }
    }
}