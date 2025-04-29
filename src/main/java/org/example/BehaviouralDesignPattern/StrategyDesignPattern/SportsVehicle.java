package org.example.BehaviouralDesignPattern.StrategyDesignPattern;

import org.example.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
