package org.example.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));
        logProcessor.info("INFO MSG");
        logProcessor.error("ERROR MSG");
    }
}
