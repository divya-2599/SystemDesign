package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.impl;

import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Coin;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Item;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingMachine;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State;

import java.util.List;

public class SelectionState implements State {

    public SelectionState(){
        System.out.println("Currently vending machine is in selection state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
         throw new Exception("You can't click on insert coin button in selection state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
          throw new Exception("You can't click on select product in selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
          throw new Exception("You can't insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
         Item item = machine.getInventory().getItem(code);
         int paidByUser = 0;
        for (Coin coin : machine.getCoins()) {
            paidByUser += coin.getValue();
        }
        if(paidByUser<item.getPrice()){
            refundFullMoney(machine, item, code);
            throw new Exception("Insufficient amount");
        }else{
            if(paidByUser> item.getPrice()){
                getChange(item.getPrice()-paidByUser);
            }
            machine.setVendingMachineState(new DispenseState());
        }
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception {
         throw new Exception("Product can't be dispensed in selection state");
    }

    @Override
    public int getChange(int amount) throws Exception {
        return amount;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine, Item item, int code) throws Exception {
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoins();
    }
}
