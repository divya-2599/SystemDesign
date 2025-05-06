package org.designPatternProblems.ParkingLot.Fee;

import org.designPatternProblems.ParkingLot.Ticket;

public interface FeeStrategy {
    double computeFee(Ticket ticket);
}
