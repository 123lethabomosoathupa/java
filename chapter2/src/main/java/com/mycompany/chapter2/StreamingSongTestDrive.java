/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * @author letha
 */
public class StreamingSongTestDrive {

    public static void main(String[] args) {

        // Create a new StreamingSong object
        StreamingSong song = new StreamingSong();

        // Set the artist of the song
        song.artist = "The Beatles";

        // Set the title of the song
        song.title = "Come Together";

        // Call the play method (simulates playing the song)
        song.play();

        // Print song details (title and artist)
        song.printDetails();
    }
}