package org.designPattern.BehaviouralDesignPattern.StateDesignPattern;


import lombok.Data;

@Data
public class Inventory {
    private ItemShelf[] itemShelf;
    public Inventory(int noOfItems) {
        itemShelf = new ItemShelf[noOfItems];
        initializeEmptyInventory();
    }

    private void initializeEmptyInventory() {
        int code =101;
        for(int i=0;i<itemShelf.length;i++){
            ItemShelf itemShelf1 = new ItemShelf();
            itemShelf1.setCode(code++);
            itemShelf1.setSoldOut(false);
            itemShelf[i] = itemShelf1;
        }
    }

    public Item getItem(int code) throws Exception {
        for(ItemShelf itemShelf1 : itemShelf){
            if(itemShelf1.getCode() == code && !itemShelf1.isSoldOut()) {
                Item item = itemShelf1.getItem();
                return item;
            }else{
                throw new Exception("Item is already sold out");
            }
        }
        throw new Exception("Item is already sold out");
    }

    public void updateSoldOutItem(int code){
        for(ItemShelf itemShelf1 : itemShelf){
            if(itemShelf1.getCode() == code) {
                itemShelf1.setSoldOut(true);
            }
        }
    }

}
