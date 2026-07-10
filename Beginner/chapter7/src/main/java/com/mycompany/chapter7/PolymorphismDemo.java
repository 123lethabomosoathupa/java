package com.mycompany.chapter7;

public class PolymorphismDemo {

    static abstract class Animal {

        void makeNoise() {
            System.out.println("...");
        }

        void eat() {
            System.out.println("...eating...");
        }
    }

    static class Dog extends Animal {

        @Override
        void makeNoise() {
            System.out.println("Bark!");
        }
    }

    static class Hippo extends Animal {

        @Override
        void makeNoise() {
            System.out.println("Grunt!");
        }
    }

    // Vet takes any Animal — works with all current AND future subclasses
    static class Vet {

        public void giveShot(Animal a) {
            a.makeNoise();  // calls the actual object's version at runtime
        }
    }

    public static void main(String[] args) {
        // Supertype reference pointing to subtype object
        Animal myDog = new Dog();
        Animal myHippo = new Hippo();

        Vet vet = new Vet();
        vet.giveShot(myDog);    // Dog's makeNoise() runs → "Bark!"
        vet.giveShot(myHippo);  // Hippo's makeNoise() runs → "Grunt!"

        // Polymorphic array
        Animal[] animals = {new Dog(), new Hippo(), new Dog()};
        for (Animal animal : animals) {
            animal.eat();
            animal.makeNoise();
        }
    }
}
