package com.mycompany.chapter11;

import java.util.*;

// Output: [somersault, cassidy, $10, havana, Cassidy, 50 Ways]
public class Jukebox1 {

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go() {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);
    }
}
