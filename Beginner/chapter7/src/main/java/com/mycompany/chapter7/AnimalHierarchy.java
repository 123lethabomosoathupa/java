package com.mycompany.chapter7;

public class AnimalHierarchy {

    // Superclass — common state and behavior for all animals
    static abstract class Animal {
        String picture;
        String food;
        int hunger;
        int[] boundaries;
        int[] location;

        void makeNoise() {
            System.out.println("Some generic noise");
        }
        void eat() {
            System.out.println("Eating something");
        }
        void sleep() {
            System.out.println("Sleeping...");
        }
        void roam() {
            System.out.println("Roaming around");
        }
    }

    // Mid-level: Canine — overrides roam() because canines move in packs
    static class Canine extends Animal {
        @Override
        void roam() {
            System.out.println("Roaming in a pack");
        }
    }

    // Mid-level: Feline — overrides roam() because felines avoid others
    static class Feline extends Animal {
        @Override
        void roam() {
            System.out.println("Roaming alone");
        }
    }

    // Concrete subclasses override makeNoise() and eat() for specific behavior
    static class Wolf extends Canine {
        @Override
        void makeNoise() { System.out.println("Howl"); }
        @Override
        void eat()       { System.out.println("Wolf eating meat"); }
    }

    static class Dog extends Canine {
        @Override
        void makeNoise() { System.out.println("Bark"); }
        @Override
        void eat()       { System.out.println("Dog eating kibble"); }
    }

    static class Lion extends Feline {
        @Override
        void makeNoise() { System.out.println("Roar"); }
        @Override
        void eat()       { System.out.println("Lion eating prey"); }
    }

    static class Cat extends Feline {
        @Override
        void makeNoise() { System.out.println("Meow"); }
        @Override
        void eat()       { System.out.println("Cat eating fish"); }
    }

    static class Tiger extends Feline {
        @Override
        void makeNoise() { System.out.println("Growl"); }
        @Override
        void eat()       { System.out.println("Tiger eating prey"); }
    }

    // Hippo uses inherited roam() from Animal directly
    static class Hippo extends Animal {
        @Override
        void makeNoise() { System.out.println("Grunt"); }
        @Override
        void eat()       { System.out.println("Hippo eating grass"); }
    }

    public static void main(String[] args) {
        // Polymorphic array — any Animal subtype can go in here
        Animal[] animals = new Animal[6];
        animals[0] = new Wolf();
        animals[1] = new Dog();
        animals[2] = new Lion();
        animals[3] = new Cat();
        animals[4] = new Tiger();
        animals[5] = new Hippo();

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            animal.eat();
            System.out.println("---");
        }
    }
}