package com.mycompany.chapter11;

import java.util.*;

class SharpenLambdas {

    public static void main(String[] args) {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        // Sort by BPM ascending
        songList.sort((one, two) -> one.getBpm() - two.getBpm());
        System.out.println(songList);

        // Sort by title DESCENDING — swap one and two
        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
        System.out.println(songList);
    }
}
