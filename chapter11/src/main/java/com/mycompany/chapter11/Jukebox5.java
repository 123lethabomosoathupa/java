package com.mycompany.chapter11;

import java.util.*;

public class Jukebox5 {

    public static void main(String[] args) {
        new Jukebox5().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);
        System.out.println(songList);

        ArtistCompare5 artistCompare = new ArtistCompare5();
        songList.sort(artistCompare);
        System.out.println(songList);
    }
}

class TitleCompare implements Comparator<SongV3> {

    @Override
    public int compare(SongV3 one, SongV3 two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}

class ArtistCompare5 implements Comparator<SongV3> {

    @Override
    public int compare(SongV3 one, SongV3 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}
