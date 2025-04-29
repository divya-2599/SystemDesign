package org.project.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Special Drive Strategy");
    }
}
