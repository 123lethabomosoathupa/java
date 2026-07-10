package com.mycompany.chapter11;

import java.util.*;

// Output:
//   [unsorted by add order]
//   [$10: hitchhiker, 50 ways: simon, Cassidy: grateful dead, ...]
public class Jukebox3 {

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        Collections.sort(songList);     // calls SongV3.compareTo() — sorts by title
        System.out.println(songList);
    }
}
