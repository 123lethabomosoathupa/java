package com.mycompany.chapter2;

/**
 * Test class for DrumKit
 * This class creates a DrumKit object and interacts with it.
 */
public class DrumKitTestDrive {

    public static void main(String[] args) {

        // Create a new DrumKit object called 'd'
        DrumKit d = new DrumKit();

        // Play the snare drum sound (prints: bang bang ba-bang)
        d.playSnare();

        // Turn the snare "off" by setting it to false
        // This simulates removing or disabling the snare
        d.snare = false;

        // Play the top hat cymbal sound (prints: ding ding da-ding)
        d.playTopHat();

        // Check if snare is still enabled
        // Only play snare if it is true
        if (d.snare == true) {
            d.playSnare();
        }
    }
}