package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates;

import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Coin;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Item;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingMachine;

import java.util.List;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void clickOnSelectProductButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    public void chooseProduct(VendingMachine machine, int code) throws Exception;

    public Item dispenseProduct(VendingMachine machine, int code) throws Exception;

    public int getChange(int amount) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine machine, Item item, int code) throws Exception;
}
