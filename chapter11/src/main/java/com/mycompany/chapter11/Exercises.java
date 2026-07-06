package com.mycompany.chapter11;

import java.util.*;

// -----------------------------------------------------------------------
// p.343/365 — SortMountains (Reverse Engineer exercise)
// -----------------------------------------------------------------------
//public class SortMountains {
//
//    public static void main(String[] args) {
//        new SortMountains().go();
//    }
//
//    public void go() {
//        List<Mountain> mountains = new ArrayList<>();
//        mountains.add(new Mountain("Longs", 14255));
//        mountains.add(new Mountain("Elbert", 14433));
//        mountains.add(new Mountain("Maroon", 14156));
//        mountains.add(new Mountain("Castle", 14265));
//        System.out.println("as entered:\n" + mountains);
//
//        mountains.sort((m1, m2) -> m1.name.compareTo(m2.name));
//        System.out.println("by name:\n" + mountains);
//
//        mountains.sort((m1, m2) -> m2.height - m1.height);  // descending
//        System.out.println("by height:\n" + mountains);
//    }
//}

//class Mountain {
//
//    String name;
//    int height;
//
//    Mountain(String name, int height) {
//        this.name = name;
//        this.height = height;
//    }
//
//    @Override
//    public String toString() {
//        return name + " " + height;
//    }
//}

// -----------------------------------------------------------------------
// p.342/366 — Lambda sorting: sort by BPM and by title descending
// -----------------------------------------------------------------------
//class SharpenLambdas {
//
//    public static void main(String[] args) {
//        List<SongV3> songList = MockSongs.getSongsV3();
//        System.out.println(songList);
//
//        // Sort by BPM ascending
//        songList.sort((one, two) -> one.getBpm() - two.getBpm());
//        System.out.println(songList);
//
//        // Sort by title DESCENDING — swap one and two
//        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
//        System.out.println(songList);
//    }
//}
//
//// -----------------------------------------------------------------------
//// p.353/366 — TreeSet exercise: Book must implement Comparable
//// Fix 1: make Book implement Comparable
//// -----------------------------------------------------------------------
//class BookComparable implements Comparable<BookComparable> {
//
//    private String title;
//
//    public BookComparable(String t) {
//        title = t;
//    }
//
//    @Override
//    public int compareTo(BookComparable other) {
//        return title.compareTo(other.title);
//    }
//
//    @Override
//    public String toString() {
//        return title;
//    }
//}
//
//class TestTreeFixed {
//
//    public static void main(String[] args) {
//        Set<BookComparable> tree = new TreeSet<>();
//        tree.add(new BookComparable("How Cats Work"));
//        tree.add(new BookComparable("Remix your Body"));
//        tree.add(new BookComparable("Finding Emo"));
//        System.out.println("TreeSet (Comparable): " + tree);
//    }
//}
//
//// Fix 2: pass a Comparator lambda to the TreeSet constructor
//class Book {
//
//    String title;
//
//    public Book(String t) {
//        title = t;
//    }
//
//    @Override
//    public String toString() {
//        return title;
//    }
//}
//
//class TestTreeComparator {
//
//    public static void main(String[] args) {
//        Set<Book> tree = new TreeSet<>((one, two) -> one.title.compareTo(two.title));
//        tree.add(new Book("How Cats Work"));
//        tree.add(new Book("Remix your Body"));
//        tree.add(new Book("Finding Emo"));
//        System.out.println("TreeSet (Comparator lambda): " + tree);
//    }
//}
