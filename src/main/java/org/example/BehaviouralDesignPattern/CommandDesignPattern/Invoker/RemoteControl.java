package org.example.BehaviouralDesignPattern.CommandDesignPattern.Invoker;

import org.example.BehaviouralDesignPattern.CommandDesignPattern.Command.ICommand;

import java.util.Stack;

public class RemoteControl {

    ICommand command;

    Stack<ICommand> history = new Stack<>();

    public RemoteControl(){

    }

    public void setCommand(ICommand command) {
        this.command=command;
    }

    public void pressButton() {
        command.execute();
        history.add(command);
    }

    public void undo() {
        if(!history.empty()) {
            ICommand lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
