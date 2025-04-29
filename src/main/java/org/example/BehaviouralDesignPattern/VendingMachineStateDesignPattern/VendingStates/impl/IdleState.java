package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.impl;

import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Coin;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Item;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingMachine;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState(){
        System.out.println("Currently vending machine is in idle state");
    }

    public IdleState(VendingMachine vendingMachine) {
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
         throw new Exception("You can't select product in idle state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You can't insert coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
         throw new Exception("You can't choose product in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("You can't dispense product in idle state");
    }

    @Override
    public int getChange(int amount) throws Exception {
        return 0;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine, Item item, int code) throws Exception {
        throw new Exception("Money can't be refunded in idle state");
    }


}
