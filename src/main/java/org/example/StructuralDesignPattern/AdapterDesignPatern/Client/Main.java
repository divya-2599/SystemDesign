package org.example.StructuralDesignPattern.AdapterDesignPatern.Client;

import org.example.StructuralDesignPattern.AdapterDesignPatern.Adaptee.WeighingMachineForBabie;
import org.example.StructuralDesignPattern.AdapterDesignPatern.Adapter.WeighingMachineAdapter;
import org.example.StructuralDesignPattern.AdapterDesignPatern.Adapter.WeighingMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {
        WeighingMachineAdapter adapter = new WeighingMachineAdapterImpl(new WeighingMachineForBabie());
        System.out.println(adapter.getWeightInKg());
    }
}
