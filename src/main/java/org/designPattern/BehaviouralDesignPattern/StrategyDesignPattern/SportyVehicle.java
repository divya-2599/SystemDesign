package org.designPattern.BehaviouralDesignPattern.StrategyDesignPattern;

import org.designPattern.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.SpecialDriveStrategy;

public class SportyVehicle extends Vehicle {
    public SportyVehicle() {
        super(new SpecialDriveStrategy());
    }
}
