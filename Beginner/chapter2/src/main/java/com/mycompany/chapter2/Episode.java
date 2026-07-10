package com.mycompany.chapter2;

/**
 * Episode class represents a single episode in a TV series.
 */
public class Episode {

    // Stores which series the episode belongs to
    int seriesNumber;

    // Stores the episode number within the series
    int episodeNumber;

    // Method to simulate playing the episode
    void play() {
        // Prints the current episode number being played
        System.out.println("Playing episode " + episodeNumber);
    }

    // Method to simulate skipping the intro section
    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    // Method to simulate moving to the next episode
    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}
