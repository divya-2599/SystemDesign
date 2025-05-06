package org.designPatternProblems.ParkingLot.Vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {
    private String licenceNo;
    private VehicleType vehicleType;

}
