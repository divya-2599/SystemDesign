package org.example.StructuralDesignPattern.DecoratorDesignPattern;

public class Mushroom extends Toppings {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}
