/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter4;

public class Clock {

    String time;

    void setTime(String t) {
        time = t;
    }

    // BUG: getTime() declares void but tries to return a value
    // Fix: change void to String
    String getTime() {
        return time;
    }
}
