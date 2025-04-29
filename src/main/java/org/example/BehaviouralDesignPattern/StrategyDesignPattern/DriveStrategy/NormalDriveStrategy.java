package org.example.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Inside Normal Drive Strategy");
    }
}
