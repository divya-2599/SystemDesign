package org.project.BehaviouralDesignPattern.StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        Vehicle vehicle1 = new GoodsVehicle();
        Vehicle vehicle2 = new SportyVehicle();
        vehicle2.drive();
        vehicle1.drive();
        vehicle.drive();
    }
}
