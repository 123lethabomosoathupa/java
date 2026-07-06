package com.mycompany.chapter11;

import java.util.*;

// SongV2 doesn't implement Comparable.
// Uncommenting Collections.sort(songList) gives:
//   error: no suitable method found for sort(List<SongV2>)
public class Jukebox2 {

    public static void main(String[] args) {
        new Jukebox2().go();
    }

    public void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);

        // Collections.sort(songList); // COMPILE ERROR — uncomment to see it
        System.out.println("(sort skipped — SongV2 doesn't implement Comparable)");
    }
}
