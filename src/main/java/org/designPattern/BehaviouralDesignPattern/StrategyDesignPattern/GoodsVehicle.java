package org.designPattern.BehaviouralDesignPattern.StrategyDesignPattern;

import org.designPattern.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
