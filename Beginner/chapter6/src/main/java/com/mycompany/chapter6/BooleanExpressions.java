package com.mycompany.chapter6;

public class BooleanExpressions {
    public static void main(String[] args) {

        // AND (&&) — both sides must be true
        int price = 350;
        if (price >= 300 && price < 400) {
            System.out.println("Price in range: choose camera X");
        }

        // OR (||) — either side can be true
        String brand = "A";
        if (brand.equals("A") || brand.equals("B")) {
            System.out.println("Brand A or B: special offer applies");
        }

        // NOT (!=) — not equal
        int model = 3000;
        if (model != 2000) {
            System.out.println("Not model 2000: apply standard rules");
        }

        // NOT (!) — negation on boolean
        String b = "X";
        if (!b.equals("Y")) {
            System.out.println("Not brand Y");
        }

        // Short-circuit: avoid NullPointerException
        String refVar = null;
        if (refVar != null && refVar.equals("something")) {
            System.out.println("safe to use refVar");
        } else {
            System.out.println("refVar was null — short-circuit saved us");
        }
    }
}