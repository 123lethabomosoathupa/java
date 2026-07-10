package com.mycompany.chapter9;

public class Duck2 {
    int size;

    public Duck2() {
        // supply default size
        size = 27;
    }

    public Duck2(int duckSize) {
        // use duckSize parameter
        size = duckSize;
    }

    public static void main(String[] args) {
        Duck2 d = new Duck2(15);
        Duck2 d2 = new Duck2();

        System.out.println("d size: " + d.size);
        System.out.println("d2 size: " + d2.size);
    }
}