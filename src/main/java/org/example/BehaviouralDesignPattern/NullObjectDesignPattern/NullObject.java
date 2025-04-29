package org.example.BehaviouralDesignPattern.NullObjectDesignPattern;

public class NullObject implements Vehicle {
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getFuelCapacity() {
        return 0;
    }
}
