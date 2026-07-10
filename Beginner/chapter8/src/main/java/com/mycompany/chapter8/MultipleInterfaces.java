package com.mycompany.chapter8;

public class MultipleInterfaces {

    interface Pet {
        void beFriendly();
        void play();
    }

    interface Saveable {
        void saveState();
    }

    interface Paintable {
        void paint();
    }

    abstract static class Animal {
        abstract void makeNoise();
    }

    abstract static class Canine extends Animal { }

    // A class can extend ONE class AND implement MULTIPLE interfaces
    static class Dog extends Canine implements Pet, Saveable, Paintable {
        @Override public void makeNoise()   { System.out.println("Bark!"); }
        @Override public void beFriendly() { System.out.println("Wag wag"); }
        @Override public void play()       { System.out.println("Fetch!"); }
        @Override public void saveState()  { System.out.println("Saving Dog state..."); }
        @Override public void paint()      { System.out.println("Drawing Dog..."); }
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        // Can be used as any of its types
        Pet p = d;
        p.beFriendly();

        Saveable s = d;
        s.saveState();

        Paintable pt = d;
        pt.paint();
    }
}