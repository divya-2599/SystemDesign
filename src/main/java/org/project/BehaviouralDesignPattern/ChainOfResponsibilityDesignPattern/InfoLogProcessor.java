package org.project.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String msg){
        if(level == LogProcessor.INFO) {
            System.out.println("Message is : " + msg);
        }else{
            super.log(level, msg);
        }
    }
}
