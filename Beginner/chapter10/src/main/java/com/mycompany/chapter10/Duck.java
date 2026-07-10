package com.mycompany.chapter10;

public class Duck {
    private int size;

    // This will NOT compile:
    // public static void main(String[] args) {
    //     System.out.println("Size of duck is " + size); // ERROR
    // }

    public void setSize(int s) {
        size = s;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Duck d = new Duck();   // must create an instance first
        d.setSize(42);
        System.out.println("Size of duck is " + d.getSize());
    }
}