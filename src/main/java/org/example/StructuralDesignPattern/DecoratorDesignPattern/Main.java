package org.example.StructuralDesignPattern.DecoratorDesignPattern;

public class Main {

    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new ExtraCheese(new Margeritha()));
        System.out.println(basePizza.cost());
    }
}
