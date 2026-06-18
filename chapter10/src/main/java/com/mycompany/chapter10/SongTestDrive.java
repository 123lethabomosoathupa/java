package com.mycompany.chapter10;

public class SongTestDrive {
    public static void main(String[] args) {
        Song s2 = new Song("Politik");
        Song s3 = new Song("My Way");

        s2.play();          // non-static: needs a reference variable
        s3.play();

        Math.min(42, 36);   // static: called using the class name, no instance needed
    }
}