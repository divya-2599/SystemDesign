package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class VendingMachine {

    private State vendingMachineState;

    private Inventory inventory;

    private List<Coin> coins;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }
}
