package com.mycompany.chapter8;

import java.util.ArrayList;

public class ObjectReference {

    static class Dog {
        public void bark() { System.out.println("Woof!"); }
    }

    public static void main(String[] args) {

        // ArrayList<Dog> — type-safe, get() returns Dog
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Dog aDog = new Dog();
        dogList.add(aDog);
        Dog retrievedDog = dogList.get(0);   // no cast needed
        retrievedDog.bark();                 // works fine

        // ArrayList<Object> — generic, but get() returns Object
        ArrayList<Object> objList = new ArrayList<Object>();
        objList.add(new Dog());
        objList.add("a String");
        objList.add(42);

        Object o = objList.get(0);
        System.out.println(o.hashCode());   // OK — Object has hashCode()
        // o.bark();                        // COMPILER ERROR — Object has no bark()

        // To get Dog behavior back, you must CAST
        if (o instanceof Dog) {
            Dog d = (Dog) o;
            d.bark();                       // now it works
        }

        // What happens with a plain Object reference:
        Object ref = new Dog();
        // ref.bark();  // COMPILER ERROR — compiler checks the REFERENCE type, not the object type
        Dog d2 = (Dog) ref;   // cast required
        d2.bark();
    }
}