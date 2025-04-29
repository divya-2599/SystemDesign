package org.project.CreationalDesignPattern.SingletonDesignPattern;

//Disadvantage of lazy initialization is that it is not thread safe

public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    private LazyInitialization() {

    }

    public static LazyInitialization getInstance() {
        if(lazyInitialization == null) {
            System.out.println("LazyInitialization");
            lazyInitialization=new LazyInitialization();
        }
        return lazyInitialization;
    }
}

class Main1 {
    public static void main(String[] args) {
        LazyInitialization lazyInitialization = LazyInitialization.getInstance();
        System.out.println(lazyInitialization);
        System.out.println(LazyInitialization.getInstance());
    }
}
