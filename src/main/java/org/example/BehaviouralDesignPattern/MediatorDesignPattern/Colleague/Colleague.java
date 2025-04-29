package org.example.BehaviouralDesignPattern.MediatorDesignPattern.Colleague;

import org.example.BehaviouralDesignPattern.MediatorDesignPattern.Mediator.AuctionMediator;

public interface Colleague {

    void placeBid(AuctionMediator mediator, double amount);

    void receiveNotification(Double amount, String name);

    String getName();
}
