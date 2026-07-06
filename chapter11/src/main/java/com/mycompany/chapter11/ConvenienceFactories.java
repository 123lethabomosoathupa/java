package com.mycompany.chapter11;

import java.util.*;

// Factory methods added in Java 9.
// RULES: (1) immutable — cannot add/sort after creation
//        (2) not guaranteed to be ArrayList/HashSet/HashMap specifically
public class ConvenienceFactories {

    public static void main(String[] args) {

        // List.of() — order preserved, no duplicates enforced
        List<String> strings = List.of("somersault", "cassidy", "$10");
        System.out.println("List: " + strings);

        // Set.of() — no duplicates, order NOT guaranteed
        Set<String> books = Set.of("How Cats Work", "Remix your Body", "Finding Emo");
        System.out.println("Set: " + books);

        // Map.of() — key, value, key, value... (up to 10 entries)
        Map<String, Integer> scores = Map.of("Kathy", 42, "Bert", 343, "Skyler", 420);
        System.out.println("Map: " + scores);

        // Map.ofEntries() — clearer syntax for any number of entries
        Map<String, String> stores = Map.ofEntries(
                Map.entry("Riley", "Supersports"),
                Map.entry("Brooklyn", "Camera World"),
                Map.entry("Jay", "Homecase")
        );
        System.out.println("Map entries: " + stores);

        // Trying to modify throws UnsupportedOperationException
        try {
            strings.add("new song");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify an immutable List.of() collection!");
        }
    }
}
