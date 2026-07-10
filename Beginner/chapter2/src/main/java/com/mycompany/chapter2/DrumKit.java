package com.mycompany.chapter2;

/**
 * DrumKit class represents a simple drum set
 * with two components: top hat and snare.
 */
public class DrumKit {

    // Boolean variables represent whether each drum piece exists/is active
    boolean topHat = true;   // top hat cymbal is available
    boolean snare = true;    // snare drum is available

    // Method to simulate playing the top hat cymbal
    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    // Method to simulate playing the snare drum
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}