package com.mycompany.chapter8;

public class AbstractAnimal {

    // Abstract class — cannot be instantiated directly
    abstract static class Animal {
        String picture;
        String food;
        int hunger;

        // Abstract methods — no body, must be overridden by first concrete subclass
        public abstract void makeNoise();
        public abstract void eat();

        // Non-abstract methods — concrete, inherited as-is
        public void sleep() {
            System.out.println("Sleeping...");
        }
        public void roam() {
            System.out.println("Roaming generically");
        }
    }

    // Abstract mid-level class — passes the buck on makeNoise() and eat()
    abstract static class Canine extends Animal {
        @Override
        public void roam() {
            System.out.println("Roaming in a pack (Canine)");
        }
        // does NOT implement makeNoise() or eat() — passes to concrete subclasses
    }

    abstract static class Feline extends Animal {
        @Override
        public void roam() {
            System.out.println("Roaming alone (Feline)");
        }
    }

    // Concrete subclasses — MUST implement ALL abstract methods
    static class Wolf extends Canine {
        @Override
        public void makeNoise() { System.out.println("Howl!"); }
        @Override
        public void eat()       { System.out.println("Wolf eating meat"); }
    }

    static class Dog extends Canine {
        @Override
        public void makeNoise() { System.out.println("Bark!"); }
        @Override
        public void eat()       { System.out.println("Dog eating kibble"); }
    }

    static class Cat extends Feline {
        @Override
        public void makeNoise() { System.out.println("Meow!"); }
        @Override
        public void eat()       { System.out.println("Cat eating fish"); }
    }

    static class Hippo extends Animal {
        @Override
        public void makeNoise() { System.out.println("Grunt!"); }
        @Override
        public void eat()       { System.out.println("Hippo eating grass"); }
    }

    public static void main(String[] args) {
        // Animal a = new Animal();  // COMPILER ERROR — abstract class!
        // Canine c = new Canine();  // COMPILER ERROR — abstract class!

        Animal[] animals = { new Wolf(), new Dog(), new Cat(), new Hippo() };
        for (Animal a : animals) {
            a.makeNoise();
            a.roam();
            a.eat();
            System.out.println("---");
        }
    }
}