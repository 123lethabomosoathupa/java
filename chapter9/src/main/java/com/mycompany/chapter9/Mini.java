package com.mycompany.chapter9;

import java.awt.Color;

public class Mini extends Car {
    private Color color;

    public Mini() {
        this(Color.RED);
    }

    public Mini(Color c) {
        super("Mini");
        color = c;
        System.out.println("Mini constructor, color: " + color);
    }

    public static void main(String[] args) {
        Mini m = new Mini();
    }
}