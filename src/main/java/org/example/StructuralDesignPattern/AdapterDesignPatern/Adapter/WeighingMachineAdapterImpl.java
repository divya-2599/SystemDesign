package org.example.StructuralDesignPattern.AdapterDesignPatern.Adapter;

import org.example.StructuralDesignPattern.AdapterDesignPatern.Adaptee.WeighingMachine;

public class WeighingMachineAdapterImpl implements WeighingMachineAdapter {

    WeighingMachine weighingMachine;

    public WeighingMachineAdapterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weighingMachine.getWeightInPound();
        return weightInPound * 0.45;
    }
}
