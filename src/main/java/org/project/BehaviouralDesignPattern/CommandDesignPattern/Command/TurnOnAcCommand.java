package org.project.BehaviouralDesignPattern.CommandDesignPattern.Command;

import org.project.BehaviouralDesignPattern.CommandDesignPattern.Receiver.ACController;

public class TurnOnAcCommand implements ICommand {

    ACController acController;

    public TurnOnAcCommand(ACController acController) {
        this.acController = acController;
    }

    @Override
    public void execute() {
        acController.turnOnAc();
        System.out.println("AC turned on:");
    }

    @Override
    public void undo() {
        acController.turnOffAc();
        System.out.println("AC turned off:");
    }
}
