package org.project.StructuralDesignPattern.DecoratorDesignPattern.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Extracheese(new Mushroom(new Farmhouse()));
        System.out.println(basePizza.cost());
        BasePizza basePizza1 = new Extracheese(basePizza);
        System.out.println(basePizza1.cost());
    }
}
