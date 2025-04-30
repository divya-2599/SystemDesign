package org.designPattern.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String msg){
        if(level == LogProcessor.ERROR) {
            System.out.println("Message is : " + msg);
        }else{
            super.log(level, msg);
        }
    }
}
