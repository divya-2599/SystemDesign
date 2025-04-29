package org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DeluxeRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DoubleRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.RoomElement;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.SingleRoom;

public interface RoomVisitor {

    void visit(SingleRoom singleRoom);

    void visit(DoubleRoom doubleRoom);

    void visit(DeluxeRoom deluxeRoom);
}
