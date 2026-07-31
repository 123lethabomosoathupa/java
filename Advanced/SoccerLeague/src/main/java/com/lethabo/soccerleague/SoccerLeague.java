/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lethabo.soccerleague;

import java.util.*;

public class SoccerLeague {

    public static void main(String[] args) {

        // Sample match results (one match per line)
        List<String> input = Arrays.asList(
            "Liverpool 3, ManchesterUnited 3",
            "Tarantulas2 1, FC Awesome 0",
            "Lions 1, FCAwesome 1",
            "Tarantulas2 3, ManchesterUnited 1",
            "Lions 4, Grouches 0"
        );

        // Stores each team's total points
        Map<String, Integer> points = new HashMap<>();

        // Process every match and update team points
        for (String line : input) {
            processMatch(line, points);
        }

        // Copy map entries into a list so they can be sorted
        List<Map.Entry<String, Integer>> scoreboard = new ArrayList<>(points.entrySet());

        // Sort by highest points first.
        // If points are equal, sort alphabetically by team name.
        scoreboard.sort((a, b) -> {
            int pointsCompare = b.getValue().compareTo(a.getValue());
            if (pointsCompare != 0) {
                return pointsCompare;
            }
            return a.getKey().compareTo(b.getKey());
        });

        // Display the final league table
        printScoreboard(scoreboard);
    }

    // Processes one match result and updates the points table
    private static void processMatch(String line, Map<String, Integer> points) {

        // Split the line into the two teams
        String[] teams = line.split(",");

        // Separate each team's name from its score
        String[] teamAParts = splitTeamAndScore(teams[0].trim());
        String[] teamBParts = splitTeamAndScore(teams[1].trim());

        String teamA = teamAParts[0];
        int scoreA = Integer.parseInt(teamAParts[1]);

        String teamB = teamBParts[0];
        int scoreB = Integer.parseInt(teamBParts[1]);

        // Add teams to the map if they don't already exist
        points.putIfAbsent(teamA, 0);
        points.putIfAbsent(teamB, 0);

        // Award points based on the match result
        if (scoreA > scoreB) {
            // Team A wins (3 points)
            points.put(teamA, points.get(teamA) + 3);
        } else if (scoreB > scoreA) {
            // Team B wins (3 points)
            points.put(teamB, points.get(teamB) + 3);
        } else {
            // Draw (1 point each)
            points.put(teamA, points.get(teamA) + 1);
            points.put(teamB, points.get(teamB) + 1);
        }
    }

    // Splits a string like "Liverpool 3" into
    // ["Liverpool", "3"]
    private static String[] splitTeamAndScore(String entry) {

        // Find the last space before the score
        int lastSpace = entry.lastIndexOf(' ');

        // Extract the team name
        String name = entry.substring(0, lastSpace).trim();

        // Extract the score
        String score = entry.substring(lastSpace + 1).trim();

        return new String[]{name, score};
    }

    // Prints the league standings with rankings
    private static void printScoreboard(List<Map.Entry<String, Integer>> scoreboard) {

        int rank = 1;            // Current displayed rank
        int previousPoints = -1; // Previous team's points
        int position = 0;        // Actual list position

        // Display each team in the sorted list
        for (Map.Entry<String, Integer> entry : scoreboard) {

            position++;

            // Only change the rank when the points change
            if (entry.getValue() != previousPoints) {
                rank = position;
                previousPoints = entry.getValue();
            }

            // Print the team's ranking and points
            System.out.println(rank + ". " + entry.getKey() + ", " + entry.getValue() + " pts");
        }
    }
}

