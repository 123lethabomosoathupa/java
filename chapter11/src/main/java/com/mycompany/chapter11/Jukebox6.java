package com.mycompany.chapter11;

import java.util.*;

// Comparator is a functional interface (SAM — one abstract method).
// The compiler infers the parameter types from List<SongV3>.
public class Jukebox6 {

    public static void main(String[] args) {
        new Jukebox6().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);
    }
}
