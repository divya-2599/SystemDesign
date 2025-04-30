package org.designPattern.BehaviouralDesignPattern.StrategyDesignPattern;

import org.designPattern.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
