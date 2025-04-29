package org.project.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String msg){
        if(level == LogProcessor.DEBUG) {
            System.out.println("Message is : " + msg);
        }else{
            super.log(level, msg);
        }
    }
}
