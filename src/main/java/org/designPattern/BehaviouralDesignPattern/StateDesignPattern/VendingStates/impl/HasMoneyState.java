package org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingStates.impl;

import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.Coin;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.Item;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingMachine;
import org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingStates.State;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState(){
        System.out.println("Inside has money state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Invalid operation");

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        List<Coin> coins = vendingMachine.getCoins();
        coins.add(coin);
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("can't choose product in has money state");
    }

    @Override
    public Item despenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("can't dispense product in has money state");
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
