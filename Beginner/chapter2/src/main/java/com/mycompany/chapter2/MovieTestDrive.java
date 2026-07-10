/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 * Tests the Movie class by creating Movie objects,
 * assigning values to their attributes, and calling methods.
 *
 * @author letha
 */
public class MovieTestDrive {

    public static void main(String[] args) {

        // Create the first Movie object
        Movie one = new Movie();

        // Assign values to the first movie
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        // Create the second Movie object
        Movie two = new Movie();

        // Assign values to the second movie
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;

        // Call the playIt() method for the second movie
        two.playIt();

        // Create the third Movie object
        Movie three = new Movie();

        // Assign values to the third movie
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}