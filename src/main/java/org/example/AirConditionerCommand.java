package org.example;

public class AirConditionerCommand implements Command {
    private AirConditioner airConditioner;

    public AirConditionerCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void execute() {
        airConditioner.turnOff();
    }

    public void undo() {
        airConditioner.turnOn();
    }
}