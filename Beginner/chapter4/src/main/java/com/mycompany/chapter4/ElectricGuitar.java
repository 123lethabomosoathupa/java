/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter4;

public class ElectricGuitar {

    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    public boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }

    public static void main(String[] args) {
        ElectricGuitar g = new ElectricGuitar();
        g.setBrand("Fender");
        g.setNumOfPickups(3);
        g.setRockStarUsesIt(true);

        System.out.println("Brand: " + g.getBrand());
        System.out.println("Pickups: " + g.getNumOfPickups());
        System.out.println("Rock star uses it: " + g.getRockStarUsesIt());
    }
}
