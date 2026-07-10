package com.mycompany.chapter7;

public class MixedMessages {

    static class A {
        int ivar = 7;
        void m1() { System.out.print("A's m1, "); }
        void m2() { System.out.print("A's m2, "); }
        void m3() { System.out.print("A's m3, "); }
    }

    static class B extends A {
        @Override
        void m1() { System.out.print("B's m1, "); }
    }

    static class C extends B {
        @Override
        void m3() { System.out.print("C's m3, " + (ivar + 6)); }
    }

    public static void main(String[] args) {
        A a   = new A();
        B b   = new B();
        C c   = new C();
        A a2  = new C();   // supertype reference to C object

        System.out.println("--- Candidate 1: b.m1(), c.m2(), a.m3() ---");
        b.m1(); c.m2(); a.m3();
        System.out.println();

        System.out.println("--- Candidate 2: c.m1(), c.m2(), c.m3() ---");
        c.m1(); c.m2(); c.m3();
        System.out.println();

        System.out.println("--- Candidate 3: a.m1(), b.m2(), c.m3() ---");
        a.m1(); b.m2(); c.m3();
        System.out.println();

        System.out.println("--- Candidate 4: a2.m1(), a2.m2(), a2.m3() ---");
        a2.m1(); a2.m2(); a2.m3();
        System.out.println();
    }
}