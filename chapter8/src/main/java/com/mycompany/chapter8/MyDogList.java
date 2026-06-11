package com.mycompany.chapter8;

public class MyDogList {

    static class Dog {
        String name;
        Dog(String n) { name = n; }
    }

    // Version 1: hardcoded for Dog — can't add Cats
    static class MyDogListV1 {
        private Dog[] dogs = new Dog[5];
        private int nextIndex = 0;

        public void add(Dog d) {
            if (nextIndex < dogs.length) {
                dogs[nextIndex] = d;
                System.out.println("Dog added at " + nextIndex);
                nextIndex++;
            }
        }
    }

    // Version 2: upgraded to Animal — polymorphic
    static abstract class Animal {
        abstract void makeNoise();
    }
    static class Cat extends Animal {
        @Override void makeNoise() { System.out.println("Meow"); }
    }
    static class DogA extends Animal {
        @Override void makeNoise() { System.out.println("Bark"); }
    }

    static class MyAnimalList {
        private Animal[] animals = new Animal[5];
        private int nextIndex = 0;

        public void add(Animal a) {
            if (nextIndex < animals.length) {
                animals[nextIndex] = a;
                System.out.println("Animal added at " + nextIndex);
                nextIndex++;
            }
        }
    }

    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        list.add(new DogA());   // Animal added at 0
        list.add(new Cat());    // Animal added at 1
    }
}