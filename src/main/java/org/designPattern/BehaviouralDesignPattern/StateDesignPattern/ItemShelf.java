package org.designPattern.BehaviouralDesignPattern.StateDesignPattern;

import lombok.Data;

@Data
public class ItemShelf {
    private Item item;
    private int code;
    private boolean isSoldOut;

}
