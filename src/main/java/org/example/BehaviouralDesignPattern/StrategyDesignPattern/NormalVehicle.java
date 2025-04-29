package org.example.BehaviouralDesignPattern.StrategyDesignPattern;

import org.example.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
