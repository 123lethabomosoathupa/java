package com.mycompany.chapter7;

public class OverrideVsOverload {

    static class Appliance {
        public boolean turnOn() {
            System.out.println("Appliance turning on");
            return true;
        }
        public boolean turnOff() {
            System.out.println("Appliance turning off");
            return true;
        }
    }

    // Legal override — same signature and compatible return type
    static class Toaster extends Appliance {
        @Override
        public boolean turnOn() {
            System.out.println("Toaster turning on");
            return true;
        }
        // This is an OVERLOAD, not an override — different argument list
        public boolean turnOn(int level) {
            System.out.println("Toaster turning on at level " + level);
            return true;
        }
    }

    // Legal overloading example
    static class Overloads {
        String uniqueID;

        public int addNums(int a, int b) {
            return a + b;
        }
        // Overloaded — different argument types
        public double addNums(double a, double b) {
            return a + b;
        }

        public void setUniqueID(String theID) {
            uniqueID = theID;
        }
        // Overloaded — different argument type
        public void setUniqueID(int ssNumber) {
            String numString = "" + ssNumber;
            setUniqueID(numString);
        }
    }

    // Using super to call the superclass version inside an override
    static class Animal {
        void roam() {
            System.out.println("Animal roaming");
        }
    }

    static class Wolf extends Animal {
        @Override
        void roam() {
            super.roam();               // calls Animal's roam() first
            System.out.println("Wolf also roaming in a pack");
        }
    }

    public static void main(String[] args) {
        Appliance a = new Toaster();
        a.turnOn();   // Toaster's version runs (override)

        Wolf w = new Wolf();
        w.roam();     // super.roam() then Wolf's own code

        Overloads o = new Overloads();
        System.out.println(o.addNums(3, 4));      // int version
        System.out.println(o.addNums(3.0, 4.0));  // double version
    }
}