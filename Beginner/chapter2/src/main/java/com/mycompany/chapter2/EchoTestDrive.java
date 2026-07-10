package com.mycompany.chapter2;

/**
 * Test class for Echo
 * Demonstrates how two separate objects maintain independent state.
 */
public class EchoTestDrive {

    public static void main(String[] args) {

        // Create two separate Echo objects
        Echo e1 = new Echo();   // first object
        Echo e2 = new Echo();   // second object (independent of e1)

        // Loop counter
        int x = 0;

        // Loop runs 4 times (x = 0, 1, 2, 3)
        while (x < 4) {

            // Call hello() on e1 each time
            e1.hello();

            // Increase e1's count by 1 every loop
            e1.count = e1.count + 1;

            // When x == 3 (last loop iteration)
            if (x == 3) {
                e2.count = e2.count + 1;
            }

            // For all iterations after x > 0 (x = 1,2,3)
            // add e1.count to e2.count
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }

            // Increment loop counter
            x = x + 1;
        }

        // Print final value of e2.count after loop ends
        System.out.println(e2.count);
    }
}