package org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DeluxeRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DoubleRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.SingleRoom;

public class RoomMaintainenceVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Single room maintainence");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Double room maintainence");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Deluxe room maintainence");
    }
}
