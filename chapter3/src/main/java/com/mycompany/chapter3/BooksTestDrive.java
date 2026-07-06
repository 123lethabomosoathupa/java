package com.mycompany.chapter3;

/**
 * This class tests the Books class by creating multiple Book objects,
 * assigning values to them, and printing their details.
 *
 * @author letha
 */
public class BooksTestDrive {

    public static void main(String[] args) {

        // Create an array that can hold 3 Books objects
        Books[] myBooks = new Books[3];

        // Counter variable used to loop through the array
        int x = 0;

        // Create actual Books objects and store them in the array
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        // Assign titles to each book
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";

        // Assign authors to each book
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        // Loop through the array and print each book's details
        while (x < 3) {
            System.out.print(myBooks[x].title);   // print book title
            System.out.print(" by ");             // separator text
            System.out.println(myBooks[x].author); // print author + new line

            // Move to the next book in the array
            x = x + 1;
        }
    }
}