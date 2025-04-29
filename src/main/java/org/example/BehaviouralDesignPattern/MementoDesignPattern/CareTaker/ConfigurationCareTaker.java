package org.example.BehaviouralDesignPattern.MementoDesignPattern.CareTaker;

import org.example.BehaviouralDesignPattern.MementoDesignPattern.Memento.ConfigurationMemento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {

    List<ConfigurationMemento> history = new ArrayList<>();

    public void add(ConfigurationMemento memento) {
        history.add(memento);
    }

    public ConfigurationMemento undo() {
        if(!history.isEmpty()) {
            ConfigurationMemento lastSavedMemento = history.get(history.size() -1);
            history.remove(lastSavedMemento);
            return lastSavedMemento;
        }
        return null;
    }

}
