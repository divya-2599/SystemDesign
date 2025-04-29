package org.example.BehaviouralDesignPattern.StrategyDesignPattern;

public class StrategyDesignPattern {
    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        vehicle.drive();
        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new offRoadVehicle();
        vehicle2.drive();
    }
}
