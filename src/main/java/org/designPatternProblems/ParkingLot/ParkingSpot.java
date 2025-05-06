package org.designPatternProblems.ParkingLot;

import lombok.Data;
import lombok.Getter;
import org.designPatternProblems.ParkingLot.Vehicle.Vehicle;
import org.designPatternProblems.ParkingLot.Vehicle.VehicleType;

@Data
public class ParkingSpot {
    private final String spotNo;
    @Getter
    private final VehicleType vehicleType;
    @Getter
    private Vehicle vehicle;
    @Getter
    private boolean isSpotAvailable;

    public ParkingSpot(String spotNo, VehicleType vehicleType, boolean isSpotAvailable) {
        this.spotNo = spotNo;
        this.vehicleType = vehicleType;
        this.isSpotAvailable = isSpotAvailable;
    }

    public boolean isSpotAvailable() {
        return isSpotAvailable;
    }

    public synchronized boolean park(Vehicle vehicle) {
        if(!isSpotAvailable || vehicle.getVehicleType() != vehicleType) {
            return false;
        }
        this.vehicle = vehicle;
        isSpotAvailable = false;
        return true;
    }

    public synchronized void unpark(Vehicle vehicle) {
        if(isSpotAvailable || vehicle.getVehicleType() != vehicleType) {
            return;
        }
        isSpotAvailable = true;
        this.vehicle = null;
    }

}
