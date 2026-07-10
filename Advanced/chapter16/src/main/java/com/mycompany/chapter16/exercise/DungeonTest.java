package com.mycompany.chapter16.exercise;

import java.io.*;

/**
 * Demonstrates how to serialize (save) and deserialize (load)
 * a DungeonGame object.
 *
 * @author letha
 */
public class DungeonTest {

    public static void main(String[] args) {

        // Create a new DungeonGame object
        DungeonGame d = new DungeonGame();

        // Print the sum of x, y, and z before serialization
        // x = 3, y = 4, z = 5
        // Total = 12
        System.out.println(d.getX() + d.getY() + d.getZ());

        try {

            // Create a file output stream to save the object
            FileOutputStream fos = new FileOutputStream("dg.ser");

            // Create an ObjectOutputStream for writing objects
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Serialize (save) the DungeonGame object
            oos.writeObject(d);

            // Close the output stream
            oos.close();

            // Create a file input stream to read the object
            FileInputStream fis = new FileInputStream("dg.ser");

            // Create an ObjectInputStream for reading objects
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Deserialize (load) the object from the file
            d = (DungeonGame) ois.readObject();

            // Close the input stream
            ois.close();

        } catch (Exception e) {

            // Print any errors that occur during serialization/deserialization
            e.printStackTrace();
        }

        // Print the sum again after deserialization
        // x = 3 (saved)
        // y = 0 (transient, so it was NOT saved)
        // z = 5 (saved)
        // Total = 8
        System.out.println(d.getX() + d.getY() + d.getZ());
    }
}