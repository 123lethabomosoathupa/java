package com.mycompany.chapter9;

import java.util.ArrayList;

public class V2Radiator {
    V2Radiator(ArrayList<SimUnit> list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
}