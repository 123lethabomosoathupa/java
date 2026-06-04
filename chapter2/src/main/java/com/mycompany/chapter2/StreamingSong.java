/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * @author letha
 */
public class StreamingSong {

    // Title of the song
    String title;

    // Artist who performed the song
    String artist;

    // Duration of the song (could be in seconds or minutes depending on use)
    int duration;

    // Simulates playing the song
    void play() {
        System.out.println("Playing song");
    }

    // Prints detailed information about the song
    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}
