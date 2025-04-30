package org.designPattern.StructuralDesignPattern.DecoratorDesignPattern.DecoratorDesignPattern;

public class Extracheese extends Toppings {

    BasePizza basePizza;

    public Extracheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
