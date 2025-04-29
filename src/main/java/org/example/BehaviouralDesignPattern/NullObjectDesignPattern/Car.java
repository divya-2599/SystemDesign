package org.example.BehaviouralDesignPattern.NullObjectDesignPattern;

public class Car implements Vehicle {

    @Override
    public int getTankCapacity() {
        return 30;
    }

    @Override
    public int getFuelCapacity() {
        return 40;
    }
}
