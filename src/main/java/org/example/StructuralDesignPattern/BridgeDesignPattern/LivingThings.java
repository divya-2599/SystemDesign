package org.example.StructuralDesignPattern.BridgeDesignPattern;

public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract public void breatheProcess();
}
