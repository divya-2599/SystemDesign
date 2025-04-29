package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.impl;

import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Coin;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Item;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingMachine;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State;

import java.util.List;

public class DispenseState implements State {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You can't click on insert coin button in dispense state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        throw new Exception("You can't click on select product button in dispense state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You can insert coin in dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("You can't choose product in dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception {
        Item item = machine.getInventory().getItem(code);
        machine.getInventory().updateSoldOutItem(code);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public int getChange(int amount) throws Exception {
        return 0;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine, Item item, int code) throws Exception {
        return List.of();
    }
}
