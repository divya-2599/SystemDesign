package org.project.BehaviouralDesignPattern.StateDesignPattern.VendingStates.impl;


import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Coin;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Item;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingMachine;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.impl.DispenseState;
import org.project.BehaviouralDesignPattern.StateDesignPattern.VendingStates.State;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Inside selection state");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Invalid operation");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("can't insert coin in selection state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("can't click on select product button again");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Item item = vendingMachine.getInventory().getItem(code);
        int paidByUser = 0;
        int amount = 0;
        for(Coin coin : vendingMachine.getCoins()) {
            amount += coin.getValue();
        }
        if(item.getPrice()>amount) {
            refundAllMoney(vendingMachine);
            throw new Exception("Your amount is less than the product amount hence refunded");
        } else {
            if(item.getPrice()<amount) {
                getChange(amount- item.getPrice());
            }
            vendingMachine.setVendingMachineState(new DispenseState());
        }
    }

    @Override
    public Item despenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("can't dispense product in selection state");
    }

    @Override
    public int getChange(int amount) {
        return amount;
    }

    @Override
    public int refundAllMoney(VendingMachine vendingMachine) {
        int amount=0;
        for(Coin coin : vendingMachine.getCoins()) {
            amount += coin.getValue();
        }
        return amount;
    }
}
