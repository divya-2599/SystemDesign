package org.designPattern.BehaviouralDesignPattern.StrategyDesignPattern;

import org.designPattern.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {

    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }

}
