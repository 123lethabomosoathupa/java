package com.mycompany.chapter5;

public class SimpleStartupFixed {
    private int[] locationCells;
    private boolean[] hasBeenHit;   // track which cells are already hit
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
        hasBeenHit = new boolean[locs.length];  // all false by default
    }

    public String checkYourself(int guess) {
        String result = "miss";

        for (int i = 0; i < locationCells.length; i++) {
            if (guess == locationCells[i]) {
                if (!hasBeenHit[i]) {           // only count if NOT already hit
                    hasBeenHit[i] = true;
                    result = "hit";
                    numOfHits++;
                    break;
                } else {
                    System.out.println("You already hit that cell!");
                    result = "miss";
                    break;
                }
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        SimpleStartupFixed s = new SimpleStartupFixed();
        s.setLocationCells(new int[]{2, 3, 4});

        // Try to cheat — guess 2 three times
        System.out.println("Guessing 2 three times (cheat attempt):");
        s.checkYourself(2);
        s.checkYourself(2);
        s.checkYourself(2);

        // Reset and play correctly
        System.out.println("\nPlaying correctly:");
        SimpleStartupFixed s2 = new SimpleStartupFixed();
        s2.setLocationCells(new int[]{2, 3, 4});
        s2.checkYourself(2);
        s2.checkYourself(3);
        s2.checkYourself(4);
    }
}