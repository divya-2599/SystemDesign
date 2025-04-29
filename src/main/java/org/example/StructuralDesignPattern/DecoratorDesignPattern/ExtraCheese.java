package org.example.StructuralDesignPattern.DecoratorDesignPattern;

public class ExtraCheese extends Toppings {

    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
