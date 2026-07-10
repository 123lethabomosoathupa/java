/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * @author letha
 */
public class Television {

    // Current TV channel number
    int channel;

    // Current volume level
    int volume;

    // Whether the TV is on or off
    boolean isOn;

    // Input source (e.g. HDMI, AV, USB)
    String inputSource;

    // Turns the TV on
    void turnOn() {
        isOn = true;
    }

    // Turns the TV off
    void turnOff() {
        isOn = false;
    }

    // Changes the TV to a specific channel
    void changeChannel(int newChannel) {
        channel = newChannel;
    }

    // Sets the volume to a specific level
    void setVolume(int newVolume) {
        volume = newVolume;
    }

    // Mutes the TV by setting volume to 0
    void mute() {
        volume = 0;
    }
}
