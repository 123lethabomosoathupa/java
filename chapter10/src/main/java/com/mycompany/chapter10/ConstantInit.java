package com.mycompany.chapter10;

public class ConstantInit {
    public static final int X_VALUE = 25;       // initialized at declaration

    public static final double VAL;
    static {
        VAL = Math.random();                    // initialized in a static initializer block
    }

    public static void main(String[] args) {
        System.out.println("X_VALUE: " + X_VALUE);
        System.out.println("VAL: " + VAL);
    }
}