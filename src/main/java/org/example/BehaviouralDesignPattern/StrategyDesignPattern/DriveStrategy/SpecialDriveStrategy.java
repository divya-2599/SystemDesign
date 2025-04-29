package org.example.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Inside Special Drive Strategy");
    }
}
