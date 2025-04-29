package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern;


import lombok.Data;

@Data
public class Item {

    private ItemType itemType;

    private int price;
}
