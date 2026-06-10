/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter3;

/**
 *
 * @author letha
 */
public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1;             // ← start at -1

        while (z < 2) {         // ← z < 2 not z < 4
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) { h[z].name = "frodo"; }
            if (z == 2) { h[z].name = "sam"; }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}