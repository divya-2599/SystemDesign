package org.example.BehaviouralDesignPattern.StrategyDesignPattern;

import org.example.BehaviouralDesignPattern.StrategyDesignPattern.DriveStrategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    public Vehicle (DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
