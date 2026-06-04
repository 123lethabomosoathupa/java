/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * @author letha
 */
public class EpisodeTestDrive {

    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();        // ← BUG: Episode has no play() method
        episode.skipIntro();
    }
}
