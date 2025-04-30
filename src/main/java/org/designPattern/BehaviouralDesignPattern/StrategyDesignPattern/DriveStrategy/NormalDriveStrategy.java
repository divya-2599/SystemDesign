package org.designPattern.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
