package com.mycompany.chapter2;

/**
 * Test class for StreamingSong
 * Demonstrates creating a song object and using its methods.
 */
public class StreamingSongTestDrive {

    public static void main(String[] args) {

        // Create a new StreamingSong object (instance of the class)
        StreamingSong song = new StreamingSong();

        // Set the artist of the song
        song.artist = "The Beatles";

        // Set the title of the song
        song.title = "Come Together";

        // Call play() method to simulate playing the song
        song.play();

        // Call printDetails() to display song information
        song.printDetails();
    }
}