package com.mycompany.chapter11;

import java.util.*;

// SongV4 overrides hashCode() and equals() using title,
// so the HashSet correctly removes duplicates.
// Note: HashSet does NOT preserve sort order.
public class Jukebox9 {

    public static void main(String[] args) {
        new Jukebox9().go();
    }

    public void go() {
        List<SongV4> songList = MockMoreSongs.getSongsV4();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        Set<SongV4> songSet = new HashSet<>(songList);
        System.out.println(songSet);    // no duplicates, order not guaranteed
    }
}
