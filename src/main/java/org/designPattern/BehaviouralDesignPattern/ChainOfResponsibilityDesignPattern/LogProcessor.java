package org.designPattern.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public abstract class LogProcessor {

    LogProcessor nextLogProcessor;

    public static int INFO = 1;
    public static int ERROR = 2;
    public static int DEBUG = 3;
    public static int WARN = 4;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int level, String msg) {
        if(nextLogProcessor != null) {
            nextLogProcessor.log(level, msg);
        }
    }

    public void debug(String msg) {
        log(DEBUG, msg);
    }

    public void error(String msg) {
        log(ERROR, msg);
    }

    public void warn(String msg) {
        log(WARN, msg);
    }

    public void info(String msg) {
        log(INFO, msg);
    }
}
