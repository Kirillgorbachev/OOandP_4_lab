package org.example;

public class Light {
    private boolean turnedOn;
    public void turnOn() {
        turnedOn = true;
        System.out.println("Светильник включен");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("Светильник выключен");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}