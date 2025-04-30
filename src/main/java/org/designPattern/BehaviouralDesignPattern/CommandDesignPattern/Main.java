package org.designPattern.BehaviouralDesignPattern.CommandDesignPattern;

import org.designPattern.BehaviouralDesignPattern.CommandDesignPattern.Command.TurnOffACCommand;
import org.designPattern.BehaviouralDesignPattern.CommandDesignPattern.Command.TurnOnAcCommand;
import org.designPattern.BehaviouralDesignPattern.CommandDesignPattern.Invocer.MyRemote;
import org.designPattern.BehaviouralDesignPattern.CommandDesignPattern.Receiver.ACController;

public class Main {

    public static void main(String[] args) {
        MyRemote myRemote = new MyRemote();
        myRemote.pressButton(new TurnOnAcCommand(new ACController()));
        myRemote.undo();
        myRemote.pressButton(new TurnOffACCommand(new ACController()));
        myRemote.undo();
    }
}
