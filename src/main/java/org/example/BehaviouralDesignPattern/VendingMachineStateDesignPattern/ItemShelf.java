package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemShelf {

    private Item item;

    private int code;

    private boolean isSoldOut;

}
