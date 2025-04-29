package org.project.BehaviouralDesignPattern.StateDesignPattern;


import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingState;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine() {
        vendingState = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }
}
