package org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingStates.impl;

import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.Coin;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.Item;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingMachine;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingStates.State;

import java.util.ArrayList;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Vending machine is in idle state currently");
    }

    public IdleState(VendingMachine vendingMachine) {
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("can't insert coin in idle state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("can't click on select product button in idle state");

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("can't choose product in idle state");

    }

    @Override
    public Item despenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("can't dispense product in idle state");
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
