package com.mycompany.chapter9;

import java.util.ArrayList;

public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList<SimUnit> aList = new ArrayList<SimUnit>();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);

        for (int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(aList);
        }

        // Count and verify
        int v2Count = 0, v3Count = 0, retentionCount = 0, totalPower = 0;
        for (SimUnit unit : aList) {
            if (unit.botType.equals("V2Radiator")) v2Count++;
            if (unit.botType.equals("V3Radiator")) v3Count++;
            if (unit.botType.equals("Retention")) retentionCount++;
            totalPower += unit.powerUse();
        }

        System.out.println("\nV2Radiator units: " + v2Count);
        System.out.println("V3Radiator units: " + v3Count);
        System.out.println("Retention units: " + retentionCount);
        System.out.println("Total power use: " + totalPower);
    }
}