package com.mycompany.chapter6;

import java.util.ArrayList;

public class ArrayListComparison {
    public static void main(String[] args) {

        // === ARRAYLIST ===
        ArrayList<String> myList = new ArrayList<String>();

        String a = "whoohoo";
        myList.add(a);                         // ArrayList: add()

        String b = "Frog";
        myList.add(b);                         // ArrayList: add()

        int theSize = myList.size();           // ArrayList: .size()
        String str = myList.get(1);            // ArrayList: .get(index)
        myList.remove(1);                      // ArrayList: .remove(index)
        boolean isIn = myList.contains(b);     // ArrayList: .contains()

        System.out.println("=== ArrayList ===");
        System.out.println("size: " + theSize);
        System.out.println("get(1): " + str);
        System.out.println("contains Frog after remove: " + isIn);

        // === REGULAR ARRAY EQUIVALENT ===
        String[] myArray = new String[2];

        myArray[0] = a;                        // array: [index] =
        myArray[1] = b;                        // array: [index] =

        int arrLength = myArray.length;        // array: .length (not a method!)
        String arrStr = myArray[1];            // array: [index]
        myArray[1] = null;                     // array "remove": set to null

        // array "contains": must loop manually
        boolean arrIsIn = false;
        for (String item : myArray) {
            if (b.equals(item)) {
                arrIsIn = true;
                break;
            }
        }

        System.out.println("\n=== Regular Array ===");
        System.out.println("length: " + arrLength);
        System.out.println("array[1]: " + arrStr);
        System.out.println("contains Frog after null: " + arrIsIn);
    }
}