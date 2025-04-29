package org.project.CreationalDesignPattern.SingletonDesignPattern;

public class SingletonPatternWithEagerInitialization {

    private static SingletonPatternWithEagerInitialization obj = new SingletonPatternWithEagerInitialization();
    private SingletonPatternWithEagerInitialization() {}
    public static SingletonPatternWithEagerInitialization getInstance() {
        System.out.println("Returning object");
        return obj;
    }
}

class Main {
    public static void main(String[] args) {
        SingletonPatternWithEagerInitialization obj = SingletonPatternWithEagerInitialization.getInstance();
    }
}
