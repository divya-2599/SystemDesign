package org.designPatternProblems.ParkingLot;

import lombok.Data;
import org.designPatternProblems.ParkingLot.Vehicle.Vehicle;

import java.time.LocalDateTime;

@Data
public class Ticket {
    private final String ticketId;
    private final LocalDateTime entryTime;
    private final ParkingSpot parkingSpot;
    private final Vehicle vehicle;
    private LocalDateTime exitTime;


    public Ticket(String ticketId, LocalDateTime entryTime, ParkingSpot parkingSpot, Vehicle vehicle, LocalDateTime exitTime) {
        this.ticketId = ticketId;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.exitTime = exitTime;
    }
}
