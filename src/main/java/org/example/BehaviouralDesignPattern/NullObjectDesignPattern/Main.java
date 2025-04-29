package org.example.BehaviouralDesignPattern.NullObjectDesignPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleType("Car");
        Vehicle vehicle1 = VehicleFactory.getVehicleType("Bike");
        System.out.println("Vehicle tank capacity is: " + vehicle.getTankCapacity());
        System.out.println("Vehicle fuel capacity is: " + vehicle.getFuelCapacity());

        // here we don't need to add null check since we have introduced null object
        System.out.println("Vehicle1 tank capacity is: " + vehicle1.getTankCapacity());
        System.out.println("Vehicle1 fuel capacity is: " + vehicle1.getFuelCapacity());
    }
}
