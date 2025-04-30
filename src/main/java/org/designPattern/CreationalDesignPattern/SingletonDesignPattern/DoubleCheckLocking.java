package org.designPattern.CreationalDesignPattern.SingletonDesignPattern;

//It is thread safe , like concurrent thread will work here and vo
public class DoubleCheckLocking {

    private static volatile DoubleCheckLocking doubleCheckLocking;

    private DoubleCheckLocking() {

    }

    public static DoubleCheckLocking getInstance() {
        if (doubleCheckLocking == null) {
            synchronized (DoubleCheckLocking.class) {
                if (doubleCheckLocking == null) {
                    System.out.println("Double check locking");
                    doubleCheckLocking = new DoubleCheckLocking();
                }
            }
        }
        return doubleCheckLocking;
    }
}

class Main3 {
    public static void main(String[] args) {
        DoubleCheckLocking doubleCheckLocking = DoubleCheckLocking.getInstance();
    }
}
