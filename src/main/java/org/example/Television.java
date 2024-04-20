package org.example;

public class Television {
    private boolean turnedOn;
    public void turnOn() {
        turnedOn = true;
        System.out.println("Телевизор включен");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("Телевизор выключен");
    }

    public boolean isTurnedOn() {
        return this.turnedOn;
    }
}