package org.example.BehaviouralDesignPattern.MediatorDesignPattern.Colleague;

import org.example.BehaviouralDesignPattern.MediatorDesignPattern.Mediator.AuctionMediator;

public class Bidder implements Colleague {

    AuctionMediator mediator;

    String name;

    public Bidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.add(this);
    }

    @Override
    public void placeBid(AuctionMediator mediator, double amount) {
        mediator.placeBid(amount, this);
    }

    @Override
    public void receiveNotification(Double amount, String name) {
        System.out.println("Bid received of amount: " + amount + " by: " + name);
    }

    @Override
    public String getName() {
        return name;
    }

}
