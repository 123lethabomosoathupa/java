package com.mycompany.chapter10;

import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {

        // Manual wrapping/unwrapping (old style)
        int i = 288;
        Integer iWrap = i;            // autoboxed
        int unWrapped = iWrap;        // auto-unboxed

        // ArrayList of primitives via autoboxing
        ArrayList<Integer> list = new ArrayList<Integer>();
        int x = 32;
        list.add(x);                  // compiler boxes it automatically
        int num = list.get(0);        // compiler unboxes it automatically

        System.out.println("Wrapped/unwrapped: " + unWrapped);
        System.out.println("From ArrayList: " + num);

        // Autoboxing in operations
        Integer j = 5;
        Integer k = j + 3;            // compiler converts to primitive, adds, reboxes
        System.out.println("k = " + k);

        // Parsing Strings to primitives
        String s = "2";
        int parsedInt = Integer.parseInt(s);
        double parsedDouble = Double.parseDouble("420.24");
        boolean parsedBool = Boolean.parseBoolean("True");

        System.out.println("parsedInt: " + parsedInt);
        System.out.println("parsedDouble: " + parsedDouble);
        System.out.println("parsedBool: " + parsedBool);
    }
}