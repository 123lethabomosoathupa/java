package com.mycompany.chapter16.exercise;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class BeatBoxSaveRestore {

    private ArrayList<JCheckBox> checkboxList;
    private JFrame frame;

    private void writeFile() {
        boolean[] checkboxState = new boolean[256];
        for (int i = 0; i < 256; i++) {
            JCheckBox check = checkboxList.get(i);
            if (check.isSelected()) {
                checkboxState[i] = true;
            }
        }
        JFileChooser fileSave = new JFileChooser();
        int result = fileSave.showSaveDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileSave.getSelectedFile();
            try (ObjectOutputStream os
                    = new ObjectOutputStream(new FileOutputStream(file))) {
                os.writeObject(checkboxState);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void readFile() {
        JFileChooser fileOpen = new JFileChooser();
        int result = fileOpen.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileOpen.getSelectedFile();
            boolean[] checkboxState = null;
            try (ObjectInputStream is
                    = new ObjectInputStream(new FileInputStream(file))) {
                checkboxState = (boolean[]) is.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 256; i++) {
                JCheckBox check = checkboxList.get(i);
                check.setSelected(checkboxState[i]);
            }
        }
    }
}
