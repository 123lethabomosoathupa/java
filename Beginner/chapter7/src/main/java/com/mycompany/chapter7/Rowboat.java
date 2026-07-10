package com.mycompany.chapter7;

/**
 * The Rowboat class inherits from the Boat class.
 * It has its own rowing method and also inherits
 * the move() method from Boat.
 */
class Rowboat extends Boat {

    /**
     * Simulates rowing the boat.
     */
    public void rowTheBoat() {
        System.out.print("stroke natasha");
    }

    // This class inherits the move() method from Boat.
    // Calling move() on a Rowboat object will print "drift".
}