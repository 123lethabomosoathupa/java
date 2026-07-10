package com.mycompany.chapter8;

public class ObjectSuperclass {

    // Every class implicitly extends Object, even if you don't say so.
    // public class Dog extends Object { } -- compiler does this for you

    static class Dog {
        String name;
        Dog(String name) { this.name = name; }
    }

    static class Cat { }

    public static void main(String[] args) {
        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Spot");
        Cat c  = new Cat();

        // Methods inherited from Object — available on every object
        System.out.println(d1.equals(d2));      // false (different objects)
        System.out.println(d1.getClass());       // class ...Dog
        System.out.println(d1.hashCode());       // some unique integer
        System.out.println(d1.toString());       // className@hashcode

        // Object as a polymorphic type — can hold anything
        Object o1 = new Dog("Fido");
        Object o2 = new Cat();
        Object o3 = "Hello";                     // String IS-A Object

        // But you can only call Object methods on an Object reference:
        System.out.println(o1.hashCode());
        // o1.bark();  // COMPILER ERROR — Object has no bark() method
    }
}