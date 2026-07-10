package com.mycompany.chapter2;

/**
 * Test class for Episode
 * Demonstrates creating an Episode object and calling its methods.
 */
public class EpisodeTestDrive {

    public static void main(String[] args) {

        // Create a new Episode object
        Episode episode = new Episode();

        // Set the series number for this episode
        episode.seriesNumber = 4;

        // Call the play method
        // NOTE: episodeNumber was not set, so it defaults to 0
        episode.play();

        // Call method to skip the intro
        episode.skipIntro();
    }
}