package com.mycompany.chapter11;

import java.util.*;

// Output:
//   [somersault, cassidy, $10, havana, Cassidy, 50 Ways]
//   [$10, 50 Ways, Cassidy, cassidy, havana, somersault]
public class Jukebox1b {

    public static void main(String[] args) {
        new Jukebox1b().go();
    }

    public void go() {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);       // unsorted
        Collections.sort(songList);         // natural order: numbers > uppercase > lowercase
        System.out.println(songList);       // sorted
    }
}
