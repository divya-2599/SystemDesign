package org.example.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String msg) {
        if(level == INFO) {
            System.out.println("Info msg is" + msg);
        }else {
            super.log(level, msg);
        }
    }
}
