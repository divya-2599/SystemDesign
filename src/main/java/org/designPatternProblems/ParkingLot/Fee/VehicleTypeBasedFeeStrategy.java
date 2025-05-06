package org.designPatternProblems.ParkingLot.Fee;

import org.designPatternProblems.ParkingLot.Ticket;
import org.designPatternProblems.ParkingLot.Vehicle.VehicleType;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

public class VehicleTypeBasedFeeStrategy implements FeeStrategy{

    private final Map<VehicleType, Double> map = Map.of(VehicleType.BIKE, 10.0,
            VehicleType.CAR, 20.0,
            VehicleType.TRUCK, 30.0);

    @Override
    public double computeFee(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = ticket.getExitTime();
        long duration = Duration.between(entryTime, exitTime).toHours();
        System.out.println("Duration is : " + duration);
        return duration * map.get(ticket.getVehicle().getVehicleType());
    }
}
