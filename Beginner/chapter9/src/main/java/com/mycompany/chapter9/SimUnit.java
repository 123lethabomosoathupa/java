package com.mycompany.chapter9;

public class SimUnit {
    String botType;

    SimUnit(String type) {
        botType = type;
        System.out.println("Created SimUnit: " + type); // Tom's debug line
    }

    int powerUse() {
        if ("Retention".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}