package org.example;

public class TvCommand implements Command {
    private Television television;

    public TvCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.turnOn();
    }

    public void undo() {
        television.turnOff();
    }
}