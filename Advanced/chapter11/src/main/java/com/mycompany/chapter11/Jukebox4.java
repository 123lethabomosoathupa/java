package com.mycompany.chapter11;

import java.util.*;

public class Jukebox4 {

    public static void main(String[] args) {
        new Jukebox4().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        Collections.sort(songList);                         // sort by title (Comparable)
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);                       // sort by artist (Comparator)
        System.out.println(songList);
    }
}

class ArtistCompare implements Comparator<SongV3> {

    @Override
    public int compare(SongV3 one, SongV3 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}
