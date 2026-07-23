package com.mycompany.chapter9;


/**
 * Demonstrates how object references work in Java.
 * This example also shows why an object is not garbage collected
 * as long as another object still holds a reference to it.
 *
 * @author Admin
 */
public class Honey {

    // Constructor
    // This method is automatically called whenever a new Honey object is created.
    public Honey() {
        System.out.println("Honey object created");
    }

    public static void main(String[] args) {

        // Display a heading so the output is easier to follow.
        System.out.println("=== Starting Program ===\n");

        // Create a new Honey object.
        // The variable 'honeyPot' stores a reference to this object.
        Honey honeyPot = new Honey();

        // Create an array that contains four references.
        // All four positions point to the EXACT SAME Honey object.
        // No additional Honey objects are created here.
        Honey[] ha = {
            honeyPot, honeyPot,
            honeyPot, honeyPot
        };

        System.out.println(
                "\nCreated Honey array with 4 references to the same Honey object.");

        // Create a new Kit object.
        Kit kit = new Kit();

        // Store the Honey object's reference inside the Kit object.
        // Now both 'honeyPot' and 'kit.honey' point to the same Honey object.
        kit.honey = honeyPot;

        System.out.println("\nKit now references the Honey object.");

        // Create a new Raccoon object.
        Raccoon raccoon = new Raccoon();

        // Give the Raccoon a reference to the Honey object.
        // Both raccoon.rh and honeyPot refer to the same Honey object.
        raccoon.rh = honeyPot;

        // Give the Raccoon a reference to the Kit object.
        // This means the Kit object now has two references:
        // 1. the local variable 'kit'
        // 2. raccoon.rk
        raccoon.rk = kit;

        System.out.println("Raccoon references the Honey object.");
        System.out.println("Raccoon also references the Kit object.");

        // Remove the local variable's reference to the Kit object.
        // The variable 'kit' no longer points to the Kit object.
        System.out.println("\nSetting kit = null...");
        kit = null;

        // Even though 'kit' is null,
        // the Kit object is STILL NOT eligible for garbage collection.
        // This is because raccoon.rk still points to it.
        System.out.println("The Kit object is NOT garbage collectible.");
        System.out.println("Reason: raccoon.rk still references it.");

        // Program ends here.
        // After main() finishes, all local variables disappear.
        // If no references remain to the objects,
        // they become eligible for garbage collection.
        System.out.println("\n=== End of main() ===");
    }
}