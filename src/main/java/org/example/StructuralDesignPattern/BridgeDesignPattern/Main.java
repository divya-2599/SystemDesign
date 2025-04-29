package org.example.StructuralDesignPattern.BridgeDesignPattern;

public class Main {

    public static void main(String[] args) {
        LivingThings tree = new Tree(new TreeBreatheImplementation());
        LivingThings fish = new Fish(new WaterBreatheImplementation());
        System.out.println(tree);
        System.out.println(fish);
    }
}
