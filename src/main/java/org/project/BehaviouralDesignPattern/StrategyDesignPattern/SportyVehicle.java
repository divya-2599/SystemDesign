package org.project.BehaviouralDesignPattern.StrategyDesignPattern;

import org.project.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.DriveStrategy;
import org.project.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.SpecialDriveStrategy;

public class SportyVehicle extends Vehicle {
    public SportyVehicle() {
        super(new SpecialDriveStrategy());
    }
}
