package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern;

import org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern.VendingStates.State;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try{
            System.out.println("|" + "filling up the inventory" + "|");
            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);
            System.out.println("|"+"clicking on insert coin button"+ "|");
            State vendingState=vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);
            vendingState=vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.DIME);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);
            System.out.println("|"+"clicking on select product button"+"|");
            vendingState.clickOnSelectProductButton(vendingMachine);
            vendingState=vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine,102);
            vendingState=vendingMachine.getVendingMachineState();
            vendingState.dispenseProduct(vendingMachine, 102);
            displayInventory(vendingMachine);

        }catch (Exception e){
            displayInventory(vendingMachine);
        }
    }

    public static void fillUpInventory(VendingMachine machine){
        ItemShelf[] slots = machine.getInventory().getItemShelf();
        for(int i=0;i<slots.length;i++){
            Item item = new Item();
            if(i>=0 && i<3){
                item.setItemType(ItemType.COKE);
                item.setPrice(40);
            }else if(i>=3 && i<6){
                item.setItemType(ItemType.JUICE);
                item.setPrice(30);
            }else if(i>=6 && i<7){
                item.setItemType(ItemType.PEPSI);
                item.setPrice(20);
            }else{
                item.setItemType(ItemType.SODA);
                item.setPrice(10);
            }
            slots[i].setItem(item);
            slots[i].setSoldOut(false);
        }
    }

    public static void displayInventory(VendingMachine machine){
        ItemShelf[] slots = machine.getInventory().getItemShelf();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getItemType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }

    }
}
