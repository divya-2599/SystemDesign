package org.designPattern.BehaviouralDesignPattern.CommandDesignPattern.Command;

import org.designPattern.BehaviouralDesignPattern.CommandDesignPattern.Receiver.ACController;

public class TurnOffACCommand implements ICommand {

    ACController acController;

    public TurnOffACCommand(ACController acController) {
        this.acController = acController;
    }

    @Override
    public void execute() {
         acController.turnOffAc();
        System.out.println("AC turned off");
    }

    @Override
    public void undo() {
        acController.turnOnAc();
        System.out.println("AC turned on");

    }
}
