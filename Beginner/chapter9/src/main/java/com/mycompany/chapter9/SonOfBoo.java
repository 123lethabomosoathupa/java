//package com.mycompany.chapter9;
//
//public class SonOfBoo extends Boo {
//
//    public SonOfBoo() {
//        super("boo");          // LEGAL — matches Boo(String s)
//    }
//
//    public SonOfBoo(int i) {
//        super("Fred");         // LEGAL — matches Boo(String s)
//    }
//
//    // public SonOfBoo(String s) {
//    //     super(42);          // ILLEGAL — Boo(int) doesn't accept 42? 
//    //     Actually this IS legal: Boo(int i) matches.
//    // }
//
//    public SonOfBoo(String s) {
//        super(42);              // LEGAL — matches Boo(int i)
//    }
//
//    public SonOfBoo(int i, String s) {
//        // ILLEGAL — no explicit super() call AND Boo has no no-arg constructor
//        // compiler tries to insert super() automatically -> fails
//        // cannot resolve symbol: constructor Boo()
//    }
//
//    public SonOfBoo(String a, String b, String c) {
//        super(a, b);            // ILLEGAL — Boo has no (String, String) constructor
//        // cannot resolve symbol: constructor Boo(String, String)
//    }
//
//    public SonOfBoo(int i, int j) {
//        super("man", j);        // LEGAL — matches Boo(String s, int i)
//    }
//
//    public SonOfBoo(int i, int x, int y) {
//        super(i, "star");       // ILLEGAL — Boo has no (int, String) constructor
//        // cannot resolve symbol: constructor Boo(int, String)
//    }
//}