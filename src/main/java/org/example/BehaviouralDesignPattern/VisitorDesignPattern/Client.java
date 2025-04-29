package org.example.BehaviouralDesignPattern.VisitorDesignPattern;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DeluxeRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DoubleRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.SingleRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor.RoomMaintainenceVisitor;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor.RoomPricingVisitor;

public class Client {

    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        DeluxeRoom deluxeRoom = new DeluxeRoom();
        RoomMaintainenceVisitor roomMaintainenceVisitor = new RoomMaintainenceVisitor();
        singleRoom.accept(roomMaintainenceVisitor);
        doubleRoom.accept(roomMaintainenceVisitor);
        deluxeRoom.accept(roomMaintainenceVisitor);
        RoomPricingVisitor roomPricingVisitor = new RoomPricingVisitor();
        singleRoom.accept(roomPricingVisitor);
        doubleRoom.accept(roomPricingVisitor);
        deluxeRoom.accept(roomPricingVisitor);

    }
}
