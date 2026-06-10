/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter4;

public class CalcAreaTest {

    int calcArea(int height, int width) {
        return height * width;
    }

    public static void main(String[] args) {
        CalcAreaTest t = new CalcAreaTest();

        int a = t.calcArea(7, 12);      // LEGAL   - output: 84
        short c = 7;
        t.calcArea(c, 15);              // LEGAL   - short promotes to int
        // int d = t.calcArea(57);      // ILLEGAL - only one argument
        t.calcArea(2, 3);               // LEGAL   - return value ignored
        long l = 42;
        // int f = t.calcArea(l, 17);   // ILLEGAL - long won't fit into int param
        // int g = t.calcArea();        // ILLEGAL - no arguments
        // t.calcArea();                // ILLEGAL - no arguments
        // byte h = t.calcArea(4, 20);  // ILLEGAL - int return won't fit into byte
        // int j = t.calcArea(2,3,5);   // ILLEGAL - too many arguments

        System.out.println("a = " + a);
        System.out.println("c = " + c);
    }
}
