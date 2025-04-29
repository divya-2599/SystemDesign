package org.project.BehaviouralDesignPattern.StrategyDesignPattern;

import org.project.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.DriveStrategy;
import org.project.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
