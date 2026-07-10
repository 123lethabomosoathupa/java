/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter3;

public class FiveMinuteMystery {
    public static void main(String[] args) {

        System.out.println("=== BOB'S METHOD (correct) ===");
        bobMethod();

        System.out.println("\n=== KATE'S METHOD (broken) ===");
        kateMethod();
    }

    static void bobMethod() {
        int x = 0;
        ContactRef[] contacts = new ContactRef[10];

        while (x < 10) {
            contacts[x] = new ContactRef();
            contacts[x].name = "Contact " + x;
            x = x + 1;
        }

        // All 10 objects are reachable via the array
        System.out.println("Bob can access all 10 contacts:");
        int i = 0;
        while (i < 10) {
            System.out.println("  contacts[" + i + "] = " + contacts[i].name);
            i = i + 1;
        }
    }

    static void kateMethod() {
        int x = 0;
        ContactRef contactRef;

        while (x < 10) {
            contactRef = new ContactRef();
            contactRef.name = "Contact " + x;
            // each loop overwrites contactRef — previous object abandoned on heap
            x = x + 1;
        }

        // contactRef is now out of scope — can't access ANY of the 10 objects
        System.out.println("Kate can access 0 contacts.");
        System.out.println("9 objects were abandoned on the heap (garbage collected).");
    }
}