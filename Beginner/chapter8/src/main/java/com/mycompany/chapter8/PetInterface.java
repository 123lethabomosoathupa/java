package com.mycompany.chapter8;

public class PetInterface {

    // Interface — like a 100% abstract class; methods are implicitly public and abstract
    interface Pet {
        void beFriendly();   // no body — ends with semicolon
        void play();
    }

    abstract static class Animal {
        public abstract void makeNoise();
        public abstract void eat();
        public void sleep() { System.out.println("Sleeping..."); }
        public void roam()  { System.out.println("Roaming..."); }
    }

    abstract static class Canine extends Animal {
        @Override
        public void roam() { System.out.println("Canine roaming in pack"); }
    }

    // Dog extends Canine AND implements Pet — gets both inheritance and the interface contract
    static class Dog extends Canine implements Pet {
        @Override public void makeNoise()    { System.out.println("Bark!"); }
        @Override public void eat()          { System.out.println("Dog eating"); }
        @Override public void beFriendly()   { System.out.println("Dog wags tail"); }
        @Override public void play()         { System.out.println("Dog fetches ball"); }
    }

    static class Cat extends Animal implements Pet {
        @Override public void makeNoise()    { System.out.println("Meow!"); }
        @Override public void eat()          { System.out.println("Cat eating"); }
        @Override public void beFriendly()   { System.out.println("Cat purrs"); }
        @Override public void play()         { System.out.println("Cat chases string"); }
    }

    // A class from a COMPLETELY different inheritance tree can implement the same interface
    static class Robot {
        public void doRobotThings() { System.out.println("Beep boop"); }
    }

    static class RoboDog extends Robot implements Pet {
        @Override public void beFriendly() { System.out.println("RoboDog wags metal tail"); }
        @Override public void play()       { System.out.println("RoboDog rolls over"); }
    }

    public static void main(String[] args) {
        // Polymorphism using Animal type
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal a : animals) {
            a.makeNoise();
        }

        // Polymorphism using Pet interface type — works across different inheritance trees!
        Pet[] pets = { new Dog(), new Cat(), new RoboDog() };
        for (Pet p : pets) {
            p.beFriendly();
            p.play();
        }
    }
}