package com.mycompany.chapter7;

public class TestBoats {

    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b2.setLength(32);
        b1.move();    // drift
        b3.move();    // drift  (Rowboat inherits move() from Boat)
        b2.move();    // hoist sail
    }
}
