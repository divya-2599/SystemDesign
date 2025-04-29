package org.example.BehaviouralDesignPattern.CommandDesignPattern.Command;

import org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver.AirConditioner;

public class TurnOffACCommand implements ICommand{

    AirConditioner ac;

    public TurnOffACCommand(AirConditioner ac) {
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
