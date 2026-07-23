package com.mycompany.chapter14.snippet;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Import MIDI message constants such as NOTE_ON, NOTE_OFF, CONTROL_CHANGE
import static javax.sound.midi.ShortMessage.*;

public class MiniMusicPlayer3 {

    // Panel used to draw graphics synchronized with the music
    private MyDrawPanel3 panel;

    // Random object for generating notes, colors, and shapes
    private Random random = new Random();

    // Program entry point
    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }

    // Sets up the graphical user interface (GUI)
    public void setUpGui() {

        // Create the application window
        JFrame frame = new JFrame("My First Music Video");

        // Create the custom drawing panel
        panel = new MyDrawPanel3();

        // Add the panel to the frame
        frame.setContentPane(panel);

        // Set window position and size
        frame.setBounds(30, 30, 300, 300);

        // Make the window visible
        frame.setVisible(true);
    }

    // Creates the music sequence and starts playback
    public void go() {

        // Create the GUI
        setUpGui();

        try {

            // Obtain the default MIDI sequencer
            Sequencer sequencer = MidiSystem.getSequencer();

            // Open the sequencer
            sequencer.open();

            // Register the panel as a listener for MIDI controller event 127
            sequencer.addControllerEventListener(panel, new int[]{127});

            // Create a new MIDI sequence
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            // Create a track within the sequence
            Track track = seq.createTrack();

            int note;

            // Generate a sequence of random notes
            for (int i = 0; i < 60; i += 4) {

                // Random note value between 1 and 50
                note = random.nextInt(50) + 1;

                // Turn the note on
                track.add(makeEvent(NOTE_ON, 1, note, 100, i));

                // Send controller event 127 to trigger graphics
                track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, i));

                // Turn the note off two ticks later
                track.add(makeEvent(NOTE_OFF, 1, note, 100, i + 2));
            }

            // Load the sequence into the sequencer
            sequencer.setSequence(seq);

            // Start playing the music
            sequencer.start();

            // Set playback speed to 120 beats per minute
            sequencer.setTempoInBPM(120);

        } catch (Exception ex) {

            // Print any errors that occur
            ex.printStackTrace();
        }
    }

    // Helper method that creates a MIDI event
    public static MidiEvent makeEvent(int cmd, int chnl, int one, int two, int tick) {

        // Variable to store the MIDI event
        MidiEvent event = null;

        try {

            // Create a MIDI message
            ShortMessage msg = new ShortMessage();

            // Configure the message
            msg.setMessage(cmd, chnl, one, two);

            // Create the event at the specified tick
            event = new MidiEvent(msg, tick);

        } catch (Exception e) {

            // Print any errors
            e.printStackTrace();
        }

        return event;
    }

    // Custom JPanel that responds to MIDI controller events
    class MyDrawPanel3 extends JPanel implements ControllerEventListener {

        // Indicates whether a new shape should be drawn
        private boolean msg = false;

        // Called whenever controller event 127 is received
        public void controlChange(ShortMessage event) {

            // Signal that the panel should repaint
            msg = true;

            // Request Swing to redraw the panel
            repaint();
        }

        // Draw graphics whenever repaint() is called
        public void paintComponent(Graphics g) {

            // Draw only if a controller event has occurred
            if (msg) {

                // Generate random RGB color values
                int r = random.nextInt(250);
                int gr = random.nextInt(250);
                int b = random.nextInt(250);

                // Set the drawing color
                g.setColor(new Color(r, gr, b));

                // Generate random rectangle dimensions
                int height = random.nextInt(120) + 10;
                int width = random.nextInt(120) + 10;

                // Generate random drawing position
                int xPos = random.nextInt(40) + 10;
                int yPos = random.nextInt(40) + 10;

                // Draw a filled rectangle
                g.fillRect(xPos, yPos, width, height);

                // Reset the flag until the next MIDI event
                msg = false;
            }
        }
    }
}