package com.mycompany.chapter4;

/**
 * The Clock class represents a simple clock object
 * that stores and returns time as a String.
 */
public class Clock {

    // Stores the time value (e.g. "12:30", "3:45 PM")
    String time;

    /**
     * Sets the time for the clock
     * @param t the time value to store
     */
    void setTime(String t) {
        time = t;
    }

    /**
     * Returns the current time stored in the clock
     * @return time as a String
     */
    String getTime() {
        return time;
    }
}