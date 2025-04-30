package org.designPattern.CreationalDesignPattern.SingletonDesignPattern;

public class SynchronizedMethod {

    private static SynchronizedMethod obj ;
    private SynchronizedMethod() {}
    synchronized public static SynchronizedMethod getInstance() {
        if(obj == null) {
            System.out.println("Inside synchronized method");
            obj = new SynchronizedMethod();
        }
        return obj;
    }
}

class Main2 {
    public static void main(String[] args) {
        SynchronizedMethod synchronizedMethod = SynchronizedMethod.getInstance();
    }
}

