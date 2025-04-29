package org.example.BehaviouralDesignPattern.VendingMachineStateDesignPattern;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Inventory {

    ItemShelf[] itemShelf;

    Inventory(int noOfItems){
        itemShelf = new ItemShelf[noOfItems];
        initializeEmptyInventory();
    }

    public void initializeEmptyInventory(){
        int startCode = 101;
        for(int i=0;i<itemShelf.length;i++){
            ItemShelf itemShelf1 = new ItemShelf();
            itemShelf1.setCode(startCode++);
            itemShelf1.setSoldOut(false);
            itemShelf[i]=itemShelf1;
        }
    }

    public Item getItem(int code) throws Exception {
        for(ItemShelf itemShelf1 : itemShelf){
            if(itemShelf1.getCode() == code){
                if(itemShelf1.isSoldOut()){
                    throw new Exception("Item is sold out");
                }
                return itemShelf1.getItem();
            }
        }
        throw new Exception("Item is sold out");
    }

    public void updateSoldOutItem(int code){
        for(ItemShelf itemShelf1 : itemShelf){
            if(itemShelf1.getCode() == code){
                itemShelf1.setSoldOut(true);
            }
        }
    }


}
