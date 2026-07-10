package com.mycompany.chapter10;

public class TestFormats {
    public static void main(String[] args) {

        long myBillion = 1_000_000_000;
        String s1 = String.format("%,d", myBillion);
        System.out.println(s1);

        String s2 = String.format("I have %.2f bugs to fix.", 476578.09876);
        System.out.println(s2);

        String s3 = String.format("I have %,.2f bugs to fix.", 476578.09876);
        System.out.println(s3);

        int one = 20456654;
        double two = 100567890.248907;
        String s4 = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println(s4);
    }
}