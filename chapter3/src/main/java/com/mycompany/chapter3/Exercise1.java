package com.mycompany.chapter3;

public class Exercise1 {
    public static void main(String[] args) {
        // 1.  int x = 34.5;       ILLEGAL - can't put double into int
        // 2.  boolean boo = x;    ILLEGAL - can't assign int to boolean
        int g = 17;              // 3. LEGAL
        int y = g;               // 4. LEGAL
        y = y + 10;              // 5. LEGAL
        short s;                 // 6. LEGAL
        // 7.  s = y;             ILLEGAL - int too big for short
        byte b = 3;              // 8. LEGAL
        byte v = b;              // 9. LEGAL
        short n = 12;            // 10. LEGAL
        // 11. v = n;             ILLEGAL - short too big for byte
        // 12. byte k = 128;      ILLEGAL - 128 exceeds byte max (127)
    }
}