package org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor.RoomVisitor;

public interface RoomElement {

    void accept(RoomVisitor visitor);
}
