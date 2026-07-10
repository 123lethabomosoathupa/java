package com.mycompany.chapter10;

public class TestMath {
    public static void main(String[] args) {
        long x = Math.round(42.2);
        int y = Math.min(56, 12);
        int z = Math.abs(-343);

        System.out.println("round: " + x);
        System.out.println("min: " + y);
        System.out.println("abs: " + z);

        // Math mathObject = new Math(); // ILLEGAL — Math's constructor is private
    }
}