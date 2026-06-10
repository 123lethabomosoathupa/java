/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter3;

public class HeapQuiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];

        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }

        // Step 1: hq[0]=ObjA, hq[1]=ObjB, hq[2]=ObjC, hq[3]=null, hq[4]=null
        printState("After loop", hq);

        hq[3] = hq[1];
        printState("hq[3] = hq[1]", hq);

        hq[4] = hq[1];
        printState("hq[4] = hq[1]", hq);

        hq[3] = null;
        printState("hq[3] = null", hq);

        hq[4] = hq[0];
        printState("hq[4] = hq[0]", hq);

        hq[0] = hq[3];
        printState("hq[0] = hq[3]", hq);

        hq[3] = hq[2];
        printState("hq[3] = hq[2]", hq);

        hq[2] = hq[0];
        printState("hq[2] = hq[0]  <- FINAL STATE", hq);
    }

    static void printState(String label, HeapQuiz[] hq) {
        System.out.println("\n--- " + label + " ---");
        int i = 0;
        while (i < 5) {
            if (hq[i] == null) {
                System.out.println("hq[" + i + "] = null");
            } else {
                System.out.println("hq[" + i + "] = object (id=" + hq[i].id + ")");
            }
            i = i + 1;
        }
    }
}