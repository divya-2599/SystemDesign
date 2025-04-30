package org.designPattern.BehaviouralDesignPattern.CommandDesignPattern.Invocer;

import org.designPattern.BehaviouralDesignPattern.CommandDesignPattern.Command.ICommand;

import java.util.Stack;

public class MyRemote {

    Stack<ICommand> history = new Stack<>();

    public void pressButton(ICommand command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if(!history.isEmpty()) {
            ICommand command1 = history.pop();
            command1.undo();
        }
    }
}
