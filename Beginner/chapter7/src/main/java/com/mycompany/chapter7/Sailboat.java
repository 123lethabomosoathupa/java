package com.mycompany.chapter7;

/**
 * The Sailboat class extends the Boat class.
 * It overrides the move() method to provide
 * behavior specific to a sailboat.
 */
public class Sailboat extends Boat {

    /**
     * Overrides the move() method inherited from Boat.
     * Instead of drifting, a sailboat moves by raising its sails.
     */
    @Override
    public void move() {
        System.out.print("hoist sail ");
    }
}