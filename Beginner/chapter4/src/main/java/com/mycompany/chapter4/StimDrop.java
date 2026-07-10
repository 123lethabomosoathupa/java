/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter4;

public class StimDrop {

    // Buchanan's mistake: instance variables left public
    // Anyone with a reference can read/write these directly
    public String dropLocation;    // should be private
    public int dropTime;           // should be private
    public String accessCode;      // should be private

    // Junkie-level methods: correctly public
    public String getDropLocation() {
        return dropLocation;
    }

    public int getDropTime() {
        return dropTime;
    }

    // Warehouse methods: correctly private
    private void updateWarehouse() {
        System.out.println("Updating warehouse...");
    }

    private void confirmDelivery() {
        System.out.println("Confirming delivery...");
    }

    public static void main(String[] args) {
        StimDrop s = new StimDrop();

        // Buchanan made methods private correctly...
        // But left instance variables PUBLIC — fatal mistake:
        s.dropLocation = "HACKED LOCATION";  // direct access — no setter needed
        s.accessCode = "CRACKED";

        System.out.println("Hacker read dropLocation: " + s.dropLocation);
        System.out.println("Hacker read accessCode:   " + s.accessCode);
        System.out.println();
        System.out.println("Jai's diagnosis: Buchanan secured his METHODS");
        System.out.println("but left his INSTANCE VARIABLES public.");
        System.out.println("Fix: make all instance variables private.");
        System.out.println("Force all access through getter/setter methods.");
    }
}
