/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 * Represents a player in the guessing game.
 * Each player generates a random guess between 0 and 9.
 *
 * @author letha
 */
public class Player {

    // Stores the player's current guess
    int number;

    // Generates a random guess and displays it
    void guess() {

        // Generate a random number between 0 and 9
        number = (int) (Math.random() * 10);

        // Display the player's guess
        System.out.println("I'm guessing " + number);
    }
}