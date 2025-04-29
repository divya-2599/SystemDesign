package org.project.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class WarnLogProcessor extends LogProcessor{
    public WarnLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String msg){
        if(level == LogProcessor.WARN) {
            System.out.println("Message is : " + msg);
        }else{
            super.log(level, msg);
        }
    }
}
