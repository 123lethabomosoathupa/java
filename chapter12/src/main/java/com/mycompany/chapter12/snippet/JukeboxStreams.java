/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter12.snippet;

/**
 *
 * @author letha
 */
import java.util.List;
import java.util.Set;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;

public class JukeboxStreams {

    public static void main(String[] args) {
        List<Song> songs = new JukeboxData.Songs().getSongs();

        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .collect(Collectors.toList());
        System.out.println(rockSongs);

        List<Song> rockishSongs = songs.stream()
                .filter(song -> song.getGenre().contains("Rock"))
                .collect(Collectors.toList());
        System.out.println(rockishSongs);

        List<String> genresWithDupes = songs.stream()
                .map(song -> song.getGenre())
                .collect(Collectors.toList());
        System.out.println(genresWithDupes);

        List<String> uniqueGenres = songs.stream()
                .map(song -> song.getGenre())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueGenres);

        Set<String> genreSet = songs.stream()
                .map(song -> song.getGenre())
                .collect(Collectors.toSet());
        System.out.println(genreSet);

        String songTitle = "With a Little Help from My Friends";
        List<String> covers = songs.stream()
                .filter(song -> song.getTitle().equals(songTitle))
                .map(song -> song.getArtist())
                .filter(artist -> !artist.equals("The Beatles"))
                .collect(Collectors.toList());
        System.out.println(covers);

        List<Song> oldestFirst = songs.stream()
                .sorted(Comparator.comparingInt(Song::getYear))
                .collect(Collectors.toList());
        System.out.println(oldestFirst);

        boolean hasRnB = songs.stream().anyMatch(s -> s.getGenre().equals("R&B"));
        System.out.println(hasRnB);

        Optional<Song> first1995 = songs.stream()
                .filter(s -> s.getYear() == 1995)
                .findFirst();
        System.out.println(first1995.isPresent() ? first1995.get().getTitle() : "none found");

        long uniqueArtistCount = songs.stream().map(Song::getArtist).distinct().count();
        System.out.println(uniqueArtistCount);
    }
}
