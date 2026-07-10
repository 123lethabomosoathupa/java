package com.mycompany.chapter6;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // ArrayList version
        ArrayList<String> myList = new ArrayList<String>();
        String a = "whoohoo";
        myList.add(a);
        String b = "Frog";
        myList.add(b);

        int theSize = myList.size();           // ArrayList uses .size()
        String str = myList.get(1);            // ArrayList uses .get(index)
        myList.remove(1);                      // ArrayList uses .remove(index)
        boolean isIn = myList.contains(b);     // ArrayList uses .contains()

        System.out.println("ArrayList size: " + theSize);
        System.out.println("Element at index 1: " + str);
        System.out.println("Contains 'Frog' after remove: " + isIn);

        // Regular array equivalent
        String[] myArray = new String[2];
        myArray[0] = "whoohoo";
        myArray[1] = "Frog";

        int arrSize = myArray.length;          // array uses .length
        String arrStr = myArray[1];            // array uses [index]
        myArray[1] = null;                     // array "remove" = set to null

        System.out.println("\nArray length: " + arrSize);
        System.out.println("Element at index 1: " + arrStr);
        System.out.println("Array[1] after null: " + myArray[1]);
    }
}