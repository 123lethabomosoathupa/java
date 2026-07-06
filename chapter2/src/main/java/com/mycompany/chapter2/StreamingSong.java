package com.mycompany.chapter2;

/**
 * StreamingSong class represents a song in a streaming system. It stores basic
 * song information and can simulate playing or displaying details.
 */
public class StreamingSong {

    // Title of the song
    String title;

    // Name of the artist who performed the song
    String artist;

    // Duration of the song (could represent seconds or minutes depending on system design)
    int duration;

    // Method to simulate playing the song
    void play() {
        System.out.println("Playing song");
    }

    // Method to display full song details
    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}
