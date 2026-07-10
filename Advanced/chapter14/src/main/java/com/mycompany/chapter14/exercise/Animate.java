package com.mycompany.chapter14.exercise;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Demonstrates a simple animation using Java Swing.
 * A blue rectangle gradually shrinks as it moves diagonally.
 *
 * @author letha
 */
public class Animate {

    // Starting x and y coordinates of the rectangle
    int x = 1;
    int y = 1;

    public static void main(String[] args) {

        // Create an Animate object
        Animate gui = new Animate();

        // Start the animation
        gui.go();
    }

    /**
     * Creates the window and runs the animation.
     */
    public void go() {

        // Create the application window
        JFrame frame = new JFrame();

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the custom drawing panel
        MyDrawP drawP = new MyDrawP();

        // Add the drawing panel to the frame
        frame.getContentPane().add(drawP);

        // Set the window size
        frame.setSize(500, 270);

        // Make the window visible
        frame.setVisible(true);

        // Repeat the animation 124 times
        for (int i = 0; i < 124; i++, y++, x++) {

            // Increase x an extra time to move faster horizontally
            x++;

            // Redraw the panel with the updated coordinates
            drawP.repaint();

            try {

                // Pause for 50 milliseconds to create the animation effect
                TimeUnit.MILLISECONDS.sleep(50);

            } catch (Exception ex) {

                // Ignore any interruption exceptions
            }
        }
    }

    /**
     * Custom JPanel used for drawing graphics.
     */
    class MyDrawP extends JPanel {

        @Override
        public void paintComponent(Graphics g) {

            // Call the parent class method (good Swing practice)
            super.paintComponent(g);

            // Paint the background white
            g.setColor(Color.white);
            g.fillRect(0, 0, 500, 250);

            // Set the drawing color to blue
            g.setColor(Color.blue);

            // Draw the shrinking blue rectangle
            // As x and y increase:
            // - The rectangle moves down and to the right.
            // - Its width and height become smaller.
            g.fillRect(x, y, 500 - x * 2, 250 - y * 2);
        }
    }
}