package com.mycompany.chapter11;

import java.util.*;

// Output:
//   {Skyler=420, Bert=343, Kathy=42}  (order may vary)
//   343
public class TestMap {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
