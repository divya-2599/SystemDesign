package org.designPattern.BehaviouralDesignPattern.StateDesignPattern;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {

    private ItemType itemType;

    private int price;
}
