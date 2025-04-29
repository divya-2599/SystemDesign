package org.example.BehaviouralDesignPattern.MementoDesignPattern.Originator;

import lombok.Setter;
import org.example.BehaviouralDesignPattern.MementoDesignPattern.Memento.ConfigurationMemento;

public class ConfigurationOriginator {

    @Setter
    public int height;

    @Setter
    public int width;

    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(this.height, this.width);
    }

    public void restoreMemento(ConfigurationMemento mementoToBeRestored) {
            this.height = mementoToBeRestored.getHeight();
            this.width = mementoToBeRestored.getWidth();
    }

}
