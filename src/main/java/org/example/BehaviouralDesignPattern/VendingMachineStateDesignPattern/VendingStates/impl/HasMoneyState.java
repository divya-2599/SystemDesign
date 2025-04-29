package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.impl;

import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Coin;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Item;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingMachine;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState(){
        System.out.println("Currently vending machine is in has money state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Invalid Operation");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
       machine.getCoins().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("You can't choose product in has money state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("You can't dispense product in has money state");
    }

    @Override
    public int getChange(int amount) throws Exception {
        throw new Exception("You can't get change in has money state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine, Item item, int code) throws Exception {
        System.out.println("Refund full amount in dispense tray");
        machine.setCoins(null);
        return machine.getCoins();
    }
}
