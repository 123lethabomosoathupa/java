package com.mycompany.chapter12.exercise;

import com.mycompany.chapter12.snippet.Song;
import com.mycompany.chapter12.snippet.JukeboxData;

import java.util.List;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Main class used to test the SongSearch class.
 *
 * @author letha
 */
public class StreamPuzzle {

    public static void main(String[] args) {

        // Create an object of the SongSearch class
        SongSearch songSearch = new SongSearch();

        // Display the top five songs
        songSearch.printTopFiveSongs();

        // Search for a song by The Beatles
        songSearch.search("The Beatles");

        // Search for a song by The Beach Boys
        songSearch.search("The Beach Boys");
    }
}

class SongSearch {

    // Load all songs from the JukeboxData class into a list
    private final List<Song> songs = new JukeboxData.Songs().getSongs();

    /**
     * Displays the first five songs after sorting them
     * by the number of times they have been played.
     */
    void printTopFiveSongs() {

        // Create a stream from the song list
        List<String> topFive = songs.stream()

                // Sort songs by times played (lowest to highest)
                .sorted(Comparator.comparingInt(Song::getTimesPlayed))

                // Convert each Song object into its title
                .map(song -> song.getTitle())

                // Keep only the first five song titles
                .limit(5)

                // Collect the titles into a List
                .collect(Collectors.toList());

        // Display the list of song titles
        System.out.println(topFive);
    }

    /**
     * Searches for the first song by the specified artist.
     *
     * @param artist The artist to search for.
     */
    void search(String artist) {

        // Filter the songs to find one matching the artist
        Optional<Song> result = songs.stream()

                // Keep only songs whose artist matches the search
                .filter(song -> song.getArtist().equals(artist))

                // Return the first matching song, if one exists
                .findFirst();

        // Check whether a matching song was found
        if (result.isPresent()) {

            // Print the title of the matching song
            System.out.println(result.get().getTitle());

        } else {

            // Display a message if no song was found
            System.out.println("No songs found by: " + artist);
        }
    }
}