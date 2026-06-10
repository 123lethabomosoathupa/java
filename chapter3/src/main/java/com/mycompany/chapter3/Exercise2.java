package com.mycompany.chapter3;

public class Exercise2 {
    public static void main(String[] args) {
        Dog[] pets = new Dog[7];
        pets[0] = new Dog();
        pets[1] = new Dog();

        // pets[2] is null (not yet assigned)
        // pets[3] pointing to an existing dog:
        pets[3] = pets[0];

        System.out.println("pets[2] is: " + pets[2]);        // null
        System.out.println("pets[3] name: " + pets[3].name); // null (no name set)
    }
}