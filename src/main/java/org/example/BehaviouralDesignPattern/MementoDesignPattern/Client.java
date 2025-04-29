package org.example.BehaviouralDesignPattern.MementoDesignPattern;

import org.example.BehaviouralDesignPattern.MementoDesignPattern.CareTaker.ConfigurationCareTaker;
import org.example.BehaviouralDesignPattern.MementoDesignPattern.Memento.ConfigurationMemento;
import org.example.BehaviouralDesignPattern.MementoDesignPattern.Originator.ConfigurationOriginator;

public class Client {

    public static void main(String[] args) {
        ConfigurationOriginator originator = new ConfigurationOriginator();
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        originator.setHeight(5);
        originator.setWidth(10);
        ConfigurationMemento memento = originator.createMemento();
        careTaker.add(memento);
        originator.setHeight(20);
        originator.setWidth(30);
        ConfigurationMemento memento1 = originator.createMemento();
        careTaker.add(memento1);
        originator.setHeight(40);
        originator.setWidth(50);
        ConfigurationMemento memento2 = originator.createMemento();
        careTaker.add(memento2);
        ConfigurationMemento resotedMementoObj = careTaker.undo();
        originator.restoreMemento(resotedMementoObj);
        System.out.println(resotedMementoObj.getHeight() + " " + resotedMementoObj.getWidth());
        ConfigurationMemento resotedMementoObj2 = careTaker.undo();
        System.out.println(resotedMementoObj2.getHeight() + " " + resotedMementoObj2.getWidth());
        System.out.println(originator.height + " " + originator.width);

    }
}
