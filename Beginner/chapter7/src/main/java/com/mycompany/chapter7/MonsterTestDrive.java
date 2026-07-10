package com.mycompany.chapter7;

public class MonsterTestDrive {

    static class Monster {
        // Set 1 — legal: A is a valid method, B overrides with same signature
        boolean frighten(int d) {
            System.out.println("arrrgh");
            return true;
        }
    }

    static class Vampire extends Monster {
        @Override
        boolean frighten(int x) {
            System.out.println("a bite?");
            return false;
        }
    }

    static class Dragon extends Monster {
        @Override
        boolean frighten(int degree) {
            System.out.println("breathe fire");
            return true;
        }
    }

    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();

        for (int i = 0; i < monsters.length; i++) {
            monsters[i].frighten(i);
        }
    }
}