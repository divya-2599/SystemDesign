package org.example.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String msg) {
        if(level==ERROR) {
            System.out.println("Error msg is: " + msg);
        }else {
            super.log(level, msg);
        }
    }
}
