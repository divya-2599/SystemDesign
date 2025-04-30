package org.designPattern.CreationalDesignPattern.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shape = shapeFactoryObj.getShape("CIRCLE");
        shape.draw();
        shapeFactoryObj.getShape("RECTANGLE").draw();
        shapeFactoryObj.getShape("SQUARE").draw();
    }
}
