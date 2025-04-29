package org.project.BehaviouralDesignPattern.StrategyDesignPattern;

import org.project.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.DriveStrategy;
import org.project.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {

    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }

}
