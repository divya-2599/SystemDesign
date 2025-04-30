package org.designPattern.BehaviouralDesignPattern.StateDesignPattern;

import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Coin;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.Item;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.ItemShelf;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.ItemType;
import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingMachine;


public class Main {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("|" + "filling up the inventory" + "|");
            fillUpInventory(vendingMachine);
            System.out.println("|" + "displaying the inventory 1" + "|");
            displayInventory(vendingMachine);
            System.out.println("here");
            org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State vendingState = vendingMachine.getVendingMachineState();
            System.out.println("state is : " + vendingState);
            vendingState.clickOnInsertCoinButton(vendingMachine);
            vendingState = (org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State) vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);
            vendingState.insertCoin(vendingMachine, Coin.DIME);
            vendingState.insertCoin(vendingMachine, Coin.NICKEL);
            vendingState.clickOnSelectProductButton(vendingMachine);
            vendingState = (org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State) vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 102);
            vendingState = (org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State) vendingMachine.getVendingMachineState();
            vendingState.dispenseProduct(vendingMachine, 102);
            System.out.println("|" + "displaying the inventory 2" + "|");
            displayInventory(vendingMachine);
        } catch (Exception e) {
            displayInventory(vendingMachine);
            throw new Exception("Exception occurred");
        }

    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelf1 = vendingMachine.getInventory().getItemShelf();
        for(int i=0;i<itemShelf1.length;i++) {
            Item item = new Item();
            if(i>=0 && i<=3) {
                item.setItemType(ItemType.PEPSI);
                item.setPrice(10);
            }else if(i>=4 && i<=7) {
                item.setItemType(ItemType.SODA);
                item.setPrice(20);
            }else{
                item.setItemType(ItemType.JUICE);
                item.setPrice(30);
            }
            itemShelf1[i].setItem(item);
            itemShelf1[i].setSoldOut(false);
        }


    }

    public static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelf1 = vendingMachine.getInventory().getItemShelf();
        for(ItemShelf itemShelf : itemShelf1) {
            System.out.println("Item is : " + itemShelf.getItem().getItemType() + " and price is : " + itemShelf.getItem().getPrice() + " sold out : " + itemShelf.isSoldOut());
        }
    }
}
