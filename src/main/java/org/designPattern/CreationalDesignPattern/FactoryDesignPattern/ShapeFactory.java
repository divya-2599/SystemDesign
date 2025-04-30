package org.designPattern.CreationalDesignPattern.FactoryDesignPattern;

public class ShapeFactory {
    public Shape getShape(String input) {
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
