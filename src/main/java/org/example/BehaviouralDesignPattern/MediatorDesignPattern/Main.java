package org.example.BehaviouralDesignPattern.MediatorDesignPattern;

import org.example.BehaviouralDesignPattern.MediatorDesignPattern.Colleague.Bidder;
import org.example.BehaviouralDesignPattern.MediatorDesignPattern.Colleague.Colleague;
import org.example.BehaviouralDesignPattern.MediatorDesignPattern.Mediator.Auction;
import org.example.BehaviouralDesignPattern.MediatorDesignPattern.Mediator.AuctionMediator;

public class Main {

    public static void main(String[] args) {
        AuctionMediator mediator = new Auction();
        Colleague colleague1 = new Bidder("Divya", mediator);
        Colleague colleague2 = new Bidder("Aashima", mediator);
        colleague1.placeBid(mediator, 10);
        colleague2.placeBid(mediator, 20);
    }
}
