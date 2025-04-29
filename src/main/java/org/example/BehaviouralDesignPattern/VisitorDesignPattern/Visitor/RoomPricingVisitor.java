package org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DeluxeRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DoubleRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom singleRoom) {
        singleRoom.price = 1000;
        System.out.println("Pricing of single room element");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        doubleRoom.price = 2000;
        System.out.println("Pricing of double room element");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        deluxeRoom.price = 3000;
        System.out.println("Pricing of deluxe room element");
    }

}
