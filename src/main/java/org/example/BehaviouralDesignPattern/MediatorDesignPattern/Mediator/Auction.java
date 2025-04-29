package org.example.BehaviouralDesignPattern.MediatorDesignPattern.Mediator;

import org.example.BehaviouralDesignPattern.MediatorDesignPattern.Colleague.Colleague;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auction implements AuctionMediator{

    List<Colleague> list = new ArrayList<>();

    @Override
    public void placeBid(double amount, Colleague bidder) {
        for(Colleague colleague : list) {
            if(!Objects.equals(colleague.getName(), bidder.getName())) {
                colleague.receiveNotification(amount, bidder.getName());
            }
        }
    }

    @Override
    public void add(Colleague colleague) {
        list.add(colleague);
    }
}
