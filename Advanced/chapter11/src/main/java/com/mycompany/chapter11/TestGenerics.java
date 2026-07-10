package com.mycompany.chapter11;

import java.util.*;

// Animal hierarchy used in all three tests
abstract class Animal {

    void eat() {
        System.out.println("animal eating");
    }
}

class Dog extends Animal {

    void bark() {
    }
}

class Cat extends Animal {

    void meow() {
    }
}

// --- TestGenerics1: passing List<Animal> works fine (p.358)
class TestGenerics1 {

    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);
    }

    public static void takeAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}

// --- TestGenerics2: List<Dog> cannot be passed to List<Animal> (p.359)
// Uncomment takeAnimals(dogs) to see the compile error.
// Reason: inside the method someone could do animals.add(new Cat()),
// which would corrupt a Dogs-only list.
class TestGenerics2 {

    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        // takeAnimals(dogs);  // COMPILE ERROR: List<Dog> cannot be converted to List<Animal>
        System.out.println("(List<Dog> blocked — see comment above)");
    }

    public static void takeAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}

// --- TestGenerics3: wildcard <? extends Animal> accepts List<Dog> (p.361)
// The wildcard prevents adding to the list, so it's safe.
class TestGenerics3 {

    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);           // works

        List<Dog> dogs = List.of(new Dog(), new Dog());
        takeAnimals(dogs);              // also works now!
    }

    public static void takeAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
        // animals.add(new Cat());  // COMPILE ERROR — compiler protects the list
    }
}
