package org.designPatternProblems.ParkingLot;

import org.designPatternProblems.ParkingLot.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloors {
    private final int floorNumber;
    private final List<ParkingSpot> parkingSpotList;

    public ParkingFloors(int floorNumber, List<ParkingSpot> parkingSpotList) {
        this.floorNumber = floorNumber;
        this.parkingSpotList = parkingSpotList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public ParkingSpot getAvailableSpot(VehicleType vehicleType) {
        for(ParkingSpot spot : parkingSpotList) {
            if(spot.isSpotAvailable() && vehicleType == spot.getVehicleType()) {
                return spot;
            }
        }
        return null;
    }

    public List<ParkingSpot> getAllAvailableParkingSpots(VehicleType vehicleType) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for(ParkingSpot spot : parkingSpotList) {
            if(spot.isSpotAvailable() && vehicleType == spot.getVehicleType()) {
                parkingSpots.add(spot);
            }
        }
        return parkingSpots;
    }
}
