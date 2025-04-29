package org.project.BehaviouralDesignPattern.CommandDesignPattern.Invocer;

import org.project.BehaviouralDesignPattern.CommandDesignPattern.Command.ICommand;
import org.project.BehaviouralDesignPattern.CommandDesignPattern.Receiver.ACController;

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
