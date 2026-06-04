/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * @author letha
 */
public class Episode {

    int seriesNumber;
    int episodeNumber;

    void play() {   // ← add this
        System.out.println("Playing episode " + episodeNumber);
    }

    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}
