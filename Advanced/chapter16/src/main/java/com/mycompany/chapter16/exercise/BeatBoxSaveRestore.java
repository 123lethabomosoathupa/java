package com.mycompany.chapter16.exercise;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

/**
 * Demonstrates saving and restoring the state of
 * 256 JCheckBoxes using object serialization.
 *
 * @author letha
 */
public class BeatBoxSaveRestore {

    // Stores all 256 checkboxes
    private ArrayList<JCheckBox> checkboxList;

    // Main application window
    private JFrame frame;

    /**
     * Saves the current state of all checkboxes to a file.
     */
    private void writeFile() {

        // Create an array to store whether each checkbox is selected
        boolean[] checkboxState = new boolean[256];

        // Loop through all checkboxes
        for (int i = 0; i < 256; i++) {

            // Get the current checkbox
            JCheckBox check = checkboxList.get(i);

            // If the checkbox is selected, store true
            if (check.isSelected()) {
                checkboxState[i] = true;
            }
        }

        // Open a file chooser so the user can choose where to save the file
        JFileChooser fileSave = new JFileChooser();

        // Display the Save dialog
        int result = fileSave.showSaveDialog(frame);

        // Continue only if the user clicks "Save"
        if (result == JFileChooser.APPROVE_OPTION) {

            // Get the selected file
            File file = fileSave.getSelectedFile();

            try (
                // Create an output stream to write objects to the file
                ObjectOutputStream os =
                        new ObjectOutputStream(new FileOutputStream(file))
            ) {

                // Write the boolean array to the file
                os.writeObject(checkboxState);

            } catch (IOException e) {

                // Print any errors that occur while saving
                e.printStackTrace();
            }
        }
    }

    /**
     * Restores the checkbox states from a previously saved file.
     */
    private void readFile() {

        // Open a file chooser so the user can select a saved file
        JFileChooser fileOpen = new JFileChooser();

        // Display the Open dialog
        int result = fileOpen.showOpenDialog(frame);

        // Continue only if the user selects a file
        if (result == JFileChooser.APPROVE_OPTION) {

            // Get the selected file
            File file = fileOpen.getSelectedFile();

            // Variable to store the checkbox states read from the file
            boolean[] checkboxState = null;

            try (
                // Create an input stream to read objects from the file
                ObjectInputStream is =
                        new ObjectInputStream(new FileInputStream(file))
            ) {

                // Read the boolean array from the file
                checkboxState = (boolean[]) is.readObject();

            } catch (Exception e) {

                // Print any errors that occur while loading
                e.printStackTrace();
            }

            // Restore each checkbox to its saved state
            for (int i = 0; i < 256; i++) {

                // Get the checkbox
                JCheckBox check = checkboxList.get(i);

                // Set it to selected or unselected
                check.setSelected(checkboxState[i]);
            }
        }
    }
}