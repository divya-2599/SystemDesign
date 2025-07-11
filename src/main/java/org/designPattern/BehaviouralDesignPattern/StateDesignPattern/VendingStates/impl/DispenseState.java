package org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingStates.impl;

import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.Coin;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.Item;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingMachine;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingStates.State;

public class DispenseState implements State {

    public DispenseState(){
        System.out.println("Inside dispense state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("can't click insert coin button in this state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("can't insert coin in dispense state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("can't click select product button in dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("can't choose product in dispense state");
    }

    @Override
    public Item despenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        Item item = vendingMachine.getInventory().getItem(code);
        vendingMachine.getInventory().updateSoldOutItem(code);
        vendingMachine.setVendingState(new IdleState(vendingMachine));
        return item;
    }

    @Override
    public int getChange(int amount) {
        return 0;
    }

    @Override
    public int refundAllMoney(VendingMachine vendingMachine) {
        return 0;
    }
}
