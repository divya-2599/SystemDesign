package org.example.BehaviouralDesignPattern.StrategyDesignPattern;

import org.example.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.NormalDriveStrategy;

public class offRoadVehicle extends Vehicle{
    public offRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
