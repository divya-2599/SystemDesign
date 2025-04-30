package org.designPattern.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(new WarnLogProcessor(null))));
        logProcessor.debug("Debug log processor");
        logProcessor.warn("Warn log processor");
    }
}
