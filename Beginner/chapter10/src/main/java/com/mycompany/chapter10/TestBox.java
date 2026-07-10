package com.mycompany.chapter10;

public class TestBox {
    private Integer i;
    private int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j = i;     // unboxes i (which is null) into j
        System.out.println(j);
        System.out.println(i);
    }
}