package org.example.BehaviouralDesignPattern.CommandDesignPattern;

import org.example.BehaviouralDesignPattern.CommandDesignPattern.Command.TurnOffACCommand;
import org.example.BehaviouralDesignPattern.CommandDesignPattern.Command.TurnOnACCommand;
import org.example.BehaviouralDesignPattern.CommandDesignPattern.Invoker.RemoteControl;
import org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver.AirConditioner;

public class Main {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new TurnOffACCommand(new AirConditioner()));
        remoteControl.pressButton();
        remoteControl.undo();
        remoteControl.setCommand(new TurnOnACCommand(new AirConditioner()));
        remoteControl.pressButton();
        remoteControl.undo();
    }

}
