package com.mycompany.chapter11;

import java.util.*;

// TreeSet = HashSet + sorted order.
// Uses SongV4.compareTo() by default (title order).
// Pass a Comparator lambda to sort differently.
public class Jukebox10 {

    public static void main(String[] args) {
        new Jukebox10().go();
    }

    public void go() {
        List<SongV4> songList = MockMoreSongs.getSongsV4();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        // Sorted by title, no duplicates (uses SongV4.compareTo())
        Set<SongV4> songSet = new TreeSet<>(songList);
        System.out.println(songSet);

        // Sorted by BPM, no duplicates (uses lambda Comparator)
        Set<SongV4> bpmSet = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
        bpmSet.addAll(songList);
        System.out.println(bpmSet);
    }
}
