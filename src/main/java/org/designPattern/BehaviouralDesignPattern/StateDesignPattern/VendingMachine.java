package org.designPattern.BehaviouralDesignPattern.StateDesignPattern;

import lombok.Data;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingStates.State;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingStates.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

@Data
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
