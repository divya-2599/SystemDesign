package org.designPatternProblems.ParkingLot;

import org.designPatternProblems.ParkingLot.Fee.VehicleTypeBasedFeeStrategy;
import org.designPatternProblems.ParkingLot.Vehicle.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingLotDemo {

    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        List<ParkingSpot> parkingSpotFloor1 = List.of(new ParkingSpot("101", VehicleType.CAR, true),
                new ParkingSpot("102", VehicleType.BIKE, true),
                new ParkingSpot("103", VehicleType.TRUCK, true));

        List<ParkingSpot> parkingSpotFloor2 = List.of(new ParkingSpot("201", VehicleType.BIKE, true),
                new ParkingSpot("202", VehicleType.TRUCK, true));

        ParkingFloors parkingFloor1 = new ParkingFloors(1, parkingSpotFloor1);
        ParkingFloors parkingFloor2 = new ParkingFloors(2, parkingSpotFloor2);
        parkingLot.addFloors(parkingFloor1);
        parkingLot.addFloors(parkingFloor2);

        parkingLot.setFeeStrategy(new VehicleTypeBasedFeeStrategy());

        Vehicle vehicle = new Car("CAR12345");
        Vehicle vehicle1 = new Bike("BIKE12345");
        Vehicle vehicle2 = new Truck("TRUCK34576");
        Vehicle vehicle3 = new Truck("TRUCK0867");
        Vehicle vehicle4 = new Truck("TRUCK05231");

        // View available spots
        System.out.println("Available spots for Car:");
        for (ParkingFloors floor: parkingLot.getParkingFloors()) {
            System.out.println("Floor: " + floor.getFloorNumber() + " " + floor.getAllAvailableParkingSpots(VehicleType.TRUCK));
        }

        List<Ticket> parkingTickets = new ArrayList<>();
        try {
            Ticket ticket1 = parkingLot.parkVehicle(vehicle);
            System.out.println("Vehicle parked is : " + ticket1.getVehicle().getVehicleType() + "ticket id : " + ticket1.getTicketId());
            parkingTickets.add(ticket1);
            Ticket ticket2 = parkingLot.parkVehicle(vehicle1);
            System.out.println("Vehicle parked is : " + ticket2.getVehicle().getVehicleType() + "ticket id : " + ticket2.getTicketId());
            parkingTickets.add(ticket2);
            Ticket ticket3 = parkingLot.parkVehicle(vehicle2);
            System.out.println("Vehicle parked is : " + ticket3.getVehicle().getVehicleType() + "ticket id : " + ticket3.getTicketId());
            parkingTickets.add(ticket3);
            Ticket ticket4 = parkingLot.parkVehicle(vehicle3);
            System.out.println("Vehicle parked is : " + ticket4.getVehicle().getVehicleType() + "ticket id : " + ticket4.getTicketId());
            parkingTickets.add(ticket4);
            Ticket ticket5 = parkingLot.parkVehicle(vehicle4);
            System.out.println("Vehicle parked is : " + ticket5.getVehicle().getVehicleType() + "ticket id : " + ticket5.getTicketId());
            parkingTickets.add(ticket1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double fee = parkingLot.unparkVehicle(parkingTickets.get(0).getTicketId(), LocalDateTime.of(2025, 5, 6, 17, 30));
            System.out.println("Fee for vehicle parking is : " + fee);
            fee = parkingLot.unparkVehicle("1", null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
