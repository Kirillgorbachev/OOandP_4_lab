package org.example;

public class AirConditioner {

    private boolean turnedOn;
    public void turnOn() {
        turnedOn = true;
        System.out.println("Кондиционер включен");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("Кондиционер выключен");
    }

    public boolean isTurnedOn(){
        return turnedOn;
    }
}