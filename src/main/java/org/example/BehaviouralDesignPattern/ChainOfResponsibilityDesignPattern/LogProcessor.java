package org.example.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public abstract class LogProcessor {

    public static int INFO=1;
    public static int WARN=2;
    public static int DEBUG=3;
    public static int ERROR=4;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor=nextLogProcessor;
    }

    public void log(int level, String msg) {
        if(nextLogProcessor != null) {
            nextLogProcessor.log(level,msg);
        }
    }

    public void info(String msg) {
        log(INFO, msg);
    }

    public void error(String msg) {
        log(ERROR, msg);
    }
}
