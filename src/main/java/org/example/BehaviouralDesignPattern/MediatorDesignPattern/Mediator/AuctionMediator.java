package org.example.BehaviouralDesignPattern.MediatorDesignPattern.Mediator;

import org.example.BehaviouralDesignPattern.MediatorDesignPattern.Colleague.Colleague;

public interface AuctionMediator {

    void placeBid(double amount, Colleague colleague);

    void add(Colleague colleague);
}
