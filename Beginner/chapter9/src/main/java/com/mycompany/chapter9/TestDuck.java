package com.mycompany.chapter9;

public class TestDuck {
    public static void main(String[] args) {
        int weight = 8;
        float density = 2.3F;
        String name = "Donald";
        long[] feathers = {1, 2, 3, 4, 5, 6};
        boolean canFly = true;
        int airspeed = 22;

        Duck[] d = new Duck[7];

        d[0] = new Duck();                       // type 1 duck
        d[1] = new Duck(density, weight);         // type 4 duck (float, int)
        d[2] = new Duck(name, feathers);          // type 3 duck (String, long[])
        d[3] = new Duck(canFly);                  // type 2 duck (boolean)
        d[4] = new Duck(3.3F, airspeed);          // type 5 duck (float, int) -- wait, matches density/maxSpeed sig
        d[5] = new Duck(false);                   // type 2 duck (boolean)
        d[6] = new Duck(airspeed, density);       // no exact match... compile error unless overload exists
    }
}