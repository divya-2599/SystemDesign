package org.example.StructuralDesignPattern.CompositeDesignPattern.Calculator;

public class Main {

    public static void main(String[] args) {
        ArithmeticExpression expression = new Expression(new Number(2), new Number(3), '+');
        ArithmeticExpression five = new Number(5);
        ArithmeticExpression  parentExpression = new Expression(five, expression, '*');
        System.out.println(parentExpression.evaluate());
    }
}
