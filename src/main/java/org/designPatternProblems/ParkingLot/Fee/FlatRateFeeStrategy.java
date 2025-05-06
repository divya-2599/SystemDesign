package org.designPatternProblems.ParkingLot.Fee;

import org.designPatternProblems.ParkingLot.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class FlatRateFeeStrategy implements FeeStrategy {

    private static final double FLAT_RATE_PER_HOUR = 10.0;

    @Override
    public double computeFee(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = ticket.getExitTime();
        long duration = Duration.between(entryTime, exitTime).toHours();
        System.out.println("Duration is : " + duration);
        return duration * FLAT_RATE_PER_HOUR;
    }

}
