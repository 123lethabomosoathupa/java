package com.mycompany.chapter16.exercise;

import java.io.*;

/**
 * Demonstrates how serialization works in Java.
 * Objects of this class can be saved to and loaded from a file.
 *
 * @author letha
 */
class DungeonGame implements Serializable {

    // This field is serialized (saved)
    public int x = 3;

    // This field is NOT serialized because it is marked as transient
    // After deserialization, it will have its default value (0)
    transient long y = 4;

    // Private fields are also serialized unless marked transient or static
    private short z = 5;

    /**
     * Returns the value of x.
     *
     * @return x
     */
    int getX() {
        return x;
    }

    /**
     * Returns the value of y.
     *
     * @return y
     */
    long getY() {
        return y;
    }

    /**
     * Returns the value of z.
     *
     * @return z
     */
    short getZ() {
        return z;
    }
}