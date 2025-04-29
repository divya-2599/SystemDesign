package org.example.BehaviouralDesignPattern.CommandDesignPattern.Command;

import org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver.AirConditioner;

public class TurnOnACCommand implements ICommand {

    AirConditioner ac;

    public TurnOnACCommand(AirConditioner ac) {
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    public void undo() {
        ac.turnOffAC();
    }
}
