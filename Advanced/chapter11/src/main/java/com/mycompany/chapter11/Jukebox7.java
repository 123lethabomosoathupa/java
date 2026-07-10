package com.mycompany.chapter11;

import java.util.*;

// Shows why we need a Set — duplicates survive all three prints.
public class Jukebox7 {

    public static void main(String[] args) {
        new Jukebox7().go();
    }

    public void go() {
        List<SongV3> songList = MockMoreSongs.getSongsV3();
        System.out.println(songList);   // before sort, duplicates present

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);   // sorted by title, still has duplicates

        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);   // sorted by artist, still has duplicates
    }
}
