//package com.mycompany.chapter10;
//
//public class LegalStatics {
//    public static void main(String[] args) {
//        Foo1 f1 = new Foo1();
//        f1.go();   // works fine
//    }
//}
//
//class Foo1 {
//    static int x;
//
//    public void go() {
//        System.out.println(x);   // LEGAL — non-static method CAN access static variable
//    }
//}
//
//class Foo2 {
//    int x;
//
//    // public static void go() {
//    //     System.out.println(x);   // ILLEGAL — static method CANNOT access instance variable
//    // }
//}
//
//class Foo3 {
//    final int x;   // ILLEGAL on its own — final instance variable must be initialized
//                    // either at declaration or in the constructor
//
//    public Foo3() {
//        x = 5;      // this fixes it
//    }
//
//    public void go() {
//        System.out.println(x);   // LEGAL once x is properly initialized
//    }
//}
//
//class Foo4 {
//    static final int x = 12;
//
//    public void go() {
//        System.out.println(x);   // LEGAL — non-static method reading static final constant
//    }
//}
//
//class Foo5 {
//    static final int x = 12;
//
//    public void go(final int x) {
//        System.out.println(x);   // LEGAL — this refers to the PARAMETER x, shadows the class field
//    }
//}
//
//class Foo6 {
//    int x = 12;
//
//    public static void go(final int x) {
//        System.out.println(x);   // LEGAL — this is the parameter, not the instance variable
//    }
//}