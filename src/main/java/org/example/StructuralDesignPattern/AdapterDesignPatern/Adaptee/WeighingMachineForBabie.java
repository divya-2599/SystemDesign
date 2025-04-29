package org.example.StructuralDesignPattern.AdapterDesignPatern.Adaptee;

public class WeighingMachineForBabie implements WeighingMachine{
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
