package com.mycompany.chapter15.exercise;

import javax.swing.*;
import java.awt.*;

/**
 * Demonstrates adding three buttons to a panel
 * and placing the panel inside a JFrame.
 *
 * @author letha
 */
public class SharpenYourPencil_ThreeButtons {

    public static void main(String[] args) {

        // Create an object of the class and start the GUI
        new SharpenYourPencil_ThreeButtons().go();
    }

    /**
     * Creates and displays the graphical user interface.
     */
    public void go() {

        // Create the application window
        JFrame frame = new JFrame();

        // Create a panel to hold the buttons
        JPanel panel = new JPanel();

        // Set the panel background color
        panel.setBackground(Color.darkGray);

        // Create the first button
        JButton button = new JButton("shock me");

        // Create the second button
        JButton buttonTwo = new JButton("bliss");

        // Create the third button
        JButton buttonThree = new JButton("huh?");

        // Add the first button to the panel
        panel.add(button);

        // Add the second button to the panel
        panel.add(buttonTwo);

        // Add the third button to the panel
        panel.add(buttonThree);

        // Add the panel to the EAST side of the frame
        frame.getContentPane().add(BorderLayout.EAST, panel);

        // Set the size of the window
        frame.setSize(250, 200);

        // Display the window
        frame.setVisible(true);
    }
}