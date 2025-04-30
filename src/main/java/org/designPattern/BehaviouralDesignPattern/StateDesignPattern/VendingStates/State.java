package org.designPattern.BehaviouralDesignPattern.StateDesignPattern.VendingStates;

import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Coin;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Item;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingMachine;

public interface State {
    void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception;
    void chooseProduct(VendingMachine vendingMachine, int code) throws Exception;
    Item despenseProduct(VendingMachine vendingMachine, int code) throws Exception;
    int getChange(int amount);
    int refundAllMoney(VendingMachine vendingMachine);

}
