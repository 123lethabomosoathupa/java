package com.mycompany.chapter10;

public class Song {
    String title;

    public Song(String t) {
        title = t;
    }

    public void play() {
        System.out.println("Playing: " + title);
    }
}