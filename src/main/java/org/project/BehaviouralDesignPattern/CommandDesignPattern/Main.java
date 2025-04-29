package org.project.BehaviouralDesignPattern.CommandDesignPattern;

import org.project.BehaviouralDesignPattern.CommandDesignPattern.Command.ICommand;
import org.project.BehaviouralDesignPattern.CommandDesignPattern.Command.TurnOffACCommand;
import org.project.BehaviouralDesignPattern.CommandDesignPattern.Command.TurnOnAcCommand;
import org.project.BehaviouralDesignPattern.CommandDesignPattern.Invocer.MyRemote;
import org.project.BehaviouralDesignPattern.CommandDesignPattern.Receiver.ACController;

public class Main {

    public static void main(String[] args) {
        MyRemote myRemote = new MyRemote();
        myRemote.pressButton(new TurnOnAcCommand(new ACController()));
        myRemote.undo();
        myRemote.pressButton(new TurnOffACCommand(new ACController()));
        myRemote.undo();
    }
}
