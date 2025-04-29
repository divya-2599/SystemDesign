package org.example.BehaviouralDesignPattern.NullObjectDesignPattern;

public class VehicleFactory {

    public static Vehicle getVehicleType(String typeofVehicle) {
        if("Car".equals(typeofVehicle)) {
            return new Car();
        }
        return new NullObject();
    }
}
