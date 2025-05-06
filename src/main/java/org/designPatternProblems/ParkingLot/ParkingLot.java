package org.designPatternProblems.ParkingLot;

import lombok.Getter;
import org.designPatternProblems.ParkingLot.Fee.FeeStrategy;
import org.designPatternProblems.ParkingLot.Fee.FlatRateFeeStrategy;
import org.designPatternProblems.ParkingLot.Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private static volatile ParkingLot instance;
    @Getter
    private final List<ParkingFloors> parkingFloors;
    private final Map<String, Ticket> activeTickets = new ConcurrentHashMap<>();
    private FeeStrategy feeStrategy;

    private ParkingLot() {
        parkingFloors = new ArrayList<>();
        feeStrategy = new FlatRateFeeStrategy();
    }

    public static ParkingLot getInstance() {
        if(instance == null) {
            synchronized (ParkingLot.class) {
                if(instance == null) {
                    instance = new ParkingLot();
                }
            }
        }
        return instance;
    }

    public void addFloors(ParkingFloors floor) {
        parkingFloors.add(floor);
    }

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public synchronized Ticket parkVehicle(Vehicle vehicle) throws Exception {
        for(ParkingFloors floor : parkingFloors) {
            ParkingSpot spots = floor.getAvailableSpot(vehicle.getVehicleType());
            if(spots != null && spots.park(vehicle)) {
                String ticketId = UUID.randomUUID().toString();
                Ticket ticket = new Ticket(ticketId, LocalDateTime.now(), spots, vehicle, null);
                activeTickets.put(ticketId, ticket);
                return ticket;
            }
        }
        throw new Exception("No spots available for vehicle type : " + vehicle.getVehicleType());
    }

    public synchronized double unparkVehicle(String ticketId, LocalDateTime localDateTime) throws Exception {
        Ticket ticket = activeTickets.getOrDefault(ticketId, null);
        if(ticket != null) {
            ParkingSpot spot = ticket.getParkingSpot();
            spot.unpark(ticket.getVehicle());
            ticket.setExitTime(localDateTime);
            double fee = feeStrategy.computeFee(ticket);
            return fee;
        }
        activeTickets.remove(ticketId);
        throw new Exception("Ticket is not active");
    }

}
